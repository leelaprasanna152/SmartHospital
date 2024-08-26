package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public final class appointment_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Appointment Successful</title>\n");
      out.write("        \n");
      out.write("     <style>\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f4f4f4;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 20px; /* Add padding to the body to give some space around the content */\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 50%;\n");
      out.write("                background-color: #fff;\n");
      out.write("                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            th {\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("            }\n");
      out.write("            td:first-child {\n");
      out.write("                width: 30%; /* Adjust this value as needed */\n");
      out.write("                font-weight: bold; /* Optional: make the labels bold for better distinction */\n");
      out.write("            }\n");
      out.write("            td:last-child {\n");
      out.write("                width: 70%; /* Adjust this value as needed */\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align:center;\">Appointment Successful</h1>\n");
      out.write("        ");
 
            String patient_id = request.getParameter("patient_id");
            String patient_name = request.getParameter("patient_name");
            String patient_phone = request.getParameter("patient_phone");
            String doctor = request.getParameter("doctor");
            String prefer_date = request.getParameter("prefer_date");
            String prefer_time = request.getParameter("prefer_time");
            String remarks = request.getParameter("remarks");
            
            try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1232");
        PreparedStatement ps = con.prepareStatement("insert into appointment_table values(?,?,?,?,?,?,?)");
        
        ps.setString(1, patient_id);
        ps.setString(2, patient_name);
        ps.setString(3, patient_phone);
        ps.setString(4, doctor);
        ps.setString(5, prefer_date);
        ps.setString(6,prefer_time);
        ps.setString(7, remarks);
        int n=ps.executeUpdate(); 
        if(n>0) {//out.println("Registered successfully!!");
            //out.println("Registered successfully!!");
            //response.sendRedirect("appointment.jsp");
        }
    }
    catch(Exception e) {
        out.println("Error:"+e.getMessage());
    }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table border=\"1\" align = \"center\">\n");
      out.write("           \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Patient_id:</td>\n");
      out.write("                    <td>");
      out.print(patient_id);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Patient Name:</td>\n");
      out.write("                    <td>");
      out.print(patient_name);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone Number:</td>\n");
      out.write("                    <td>");
      out.print(patient_phone);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Preferred Doctor:</td>\n");
      out.write("                    <td>");
      out.print(doctor);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Preferred Date:</td>\n");
      out.write("                    <td>");
      out.print(prefer_date);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Preferred Time:</td>\n");
      out.write("                    <td>");
      out.print(prefer_time);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("<!--                <tr>\n");
      out.write("                    <td>First Visit to Office:</td>\n");
      out.write("                    <td></td>\n");
      out.write("                   \n");
      out.write("                </tr>-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>Problem:</td>\n");
      out.write("                    <td>");
      out.print(remarks);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table><br><br>\n");
      out.write("                <img src =\"qr.png\" alt =\" qr code\" style =\"display: block;\n");
      out.write("                margin: 20px auto;\">  \n");
      out.write("                <p style=\"text-align:center\">Scan here for Patient Details</p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
