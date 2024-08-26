package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Patient Details</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px; /* Add padding to the body to give some space around the content */\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 50%;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("            margin: 0 auto; /* Center the table */\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("        }\n");
      out.write("        td:first-child {\n");
      out.write("            width: 30%; /* Adjust this value as needed */\n");
      out.write("            font-weight: bold; /* Optional: make the labels bold for better distinction */\n");
      out.write("        }\n");
      out.write("        td:last-child {\n");
      out.write("            width: 70%; /* Adjust this value as needed */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Patient Details</h1>\n");
      out.write("\n");
      out.write("    ");

       
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String grp = request.getParameter("grp");
        String wt = request.getParameter("wt");
        String pwd = request.getParameter("pwd");
        String confirmpwd = request.getParameter("confirmpwd");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phno = request.getParameter("phno");
        String patient_id = request.getParameter("patient_id");
    Connection con = null;
    try {
       
         response.setContentType("text/html");
        // Check if any parameter is null or empty
        if (name == null || gender == null || age == null || grp == null || wt == null || 
            pwd == null || confirmpwd == null || email == null || address == null || 
            phno == null || patient_id == null) {
            throw new Exception("All parameters are required.");
        }

        // Check if passwords match
        if (!pwd.equals(confirmpwd)) {
            throw new Exception("Passwords do not match.");
        }

        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1232");

        String sql = "INSERT INTO patientRegister_table (name, gender, age, blood_group, weight, password, confirm_password, email, address, phone_number, patient_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, name);
        ps.setString(2, gender);
        ps.setString(3, age);
        ps.setString(4, grp);
        ps.setString(5, wt);
        ps.setString(6, pwd);
        ps.setString(7, confirmpwd);
        ps.setString(8, email);
        ps.setString(9, address);
        ps.setString(10, phno);
        ps.setString(11, patient_id);

        int n = ps.executeUpdate();
        if (n > 0) {
            out.println("Registration successful!");
           
        } 
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
       
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    
      out.write("\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>Name:</td>\n");
      out.write("                <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Gender:</td>\n");
      out.write("                <td>");
      out.print(gender);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Age:</td>\n");
      out.write("                <td>");
      out.print(age);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Blood Group:</td>\n");
      out.write("                <td>");
      out.print(grp);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Weight in kg:</td>\n");
      out.write("                <td>");
      out.print(wt);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Email:</td>\n");
      out.write("                <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Address:</td>\n");
      out.write("                <td>");
      out.print(address);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Phone Number:</td>\n");
      out.write("                <td>");
      out.print(phno);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Patient Id:</td>\n");
      out.write("                <td>");
      out.print(patient_id);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("            <input type=\"button\" value=\"Register\" style=\"left: 80px;\"onclick=\"window.location.href='loginp.html'\">\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
