package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javap.Training_certificate;
import javap.Placement1;
import javap.Student_record;
import java.util.Iterator;
import org.hibernate.Query;
import java.awt.geom.QuadCurve2D;
import javap.Convert;
import java.io.IOException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.Session;

public final class Placement11_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public List<javap.Placement1> lt=new ArrayList<javap.Placement1>();
 public Placement1 e[]=new Placement1[8];
 public int f=0;
 int i=0; 
 public List<javap.Placement1> lt1;
 public Training_certificate e1[]=new Training_certificate[8];
 int i1=0; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"newcss.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"validate.js\"></script>\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("  ");
 try {
SessionFactory sf=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Placement1.class).buildSessionFactory();
Session s=sf.openSession(); 
Transaction tx=s.beginTransaction();
Query q=s.createQuery("from javap.Placement1 where username='0827IT111058'");
lt=q.list();

if(lt.isEmpty())
    { for(int j=0;j<8;j++)
        e[j]=new Placement1();
   f=1;
    }
else{
      out.write(' ');
      out.write('\n');
for(Iterator t=lt.iterator();t.hasNext();)
{
e[i]=(Placement1)t.next();
i++;
} 
tx.commit();
s.close();
  } }
catch(Exception ex) {
        System.out.println(ex);
         }
 
      out.write("\n");
      out.write(" <form action=\"Placement2\" name=\"myForm\" method=\"post\">\n");
      out.write(" <fieldset>\n");
      out.write("            <legend>PLACEMENT</legend>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Company Name</th>\n");
      out.write("                    <th>Designation</th>\n");
      out.write("                    <th>Job Type</th>\n");
      out.write("                    <th>Annual Package</th>\n");
      out.write("                    <th>Office Letter</th>\n");
      out.write("                    <th>Open/Close Campus</th>\n");
      out.write("                    <th>Remarks</th>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"s11\" size=\"5\" id=\"pdate\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[0].getDate1());
      out.write("\">  </td>    \n");
      out.write("            <td>  <input type=\"text\" name=\"s12\" size=\"20\" id=\"pCompName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getCompany_name());
      out.write("\">  </td>    \n");
      out.write("            <td> <input type=\"text\" name=\"s13\" size=\"8\" id=\"pDes\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getDesignation_or_job_tile());
      out.write("\">    </td>\n");
      out.write("            <td> <input type=\"text\" name=\"s14\" size=\"14\" id=\"pJob\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getJob_type());
      out.write("\"> </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s15\" size=\"5\" id=\"pAnnual\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getAnnual_package());
      out.write("\"></td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s16\" size=\"5\" id=\"pOffice\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getOffice_letter());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s17\" size=\"10\" id=\"pOpen\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getOpen_or_close_campus());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s18\" size=\"15\" id=\"pRemarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[0].getRemarks());
      out.write("\">  </td>            \n");
      out.write("         </tr>\n");
      out.write("         <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"s21\" size=\"5\" id=\"pdate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getDate1());
      out.write("\">  </td>    \n");
      out.write("            <td>  <input type=\"text\" name=\"s22\" size=\"20\" id=\"pCompName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getCompany_name());
      out.write("\">  </td>    \n");
      out.write("            <td> <input type=\"text\" name=\"s23\" size=\"8\" id=\"pDes\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[1].getDesignation_or_job_tile());
      out.write("\">    </td>\n");
      out.write("            <td> <input type=\"text\" name=\"s24\" size=\"14\" id=\"pJob\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getJob_type());
      out.write("\"> </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s25\" size=\"5\" id=\"pAnnual\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getAnnual_package());
      out.write("\"></td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s26\" size=\"5\" id=\"pOffice\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getOffice_letter());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s27\" size=\"10\" id=\"pOpen\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getOpen_or_close_campus());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s28\" size=\"15\" id=\"pRemarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[1].getRemarks());
      out.write("\">  </td>            \n");
      out.write("         </tr>\n");
      out.write("         \n");
      out.write("         <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"s31\" size=\"5\" id=\"pdate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getDate1());
      out.write("\">  </td>    \n");
      out.write("            <td>  <input type=\"text\" name=\"s32\" size=\"20\" id=\"pCompName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getCompany_name());
      out.write("\">  </td>    \n");
      out.write("            <td> <input type=\"text\" name=\"s33\" size=\"8\" id=\"pDes\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[2].getDesignation_or_job_tile());
      out.write("\">    </td>\n");
      out.write("            <td> <input type=\"text\" name=\"s34\" size=\"14\" id=\"pJob\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getJob_type());
      out.write("\"> </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s35\" size=\"5\" id=\"pAnnual\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getAnnual_package());
      out.write("\"></td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s36\" size=\"5\" id=\"pOffice\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getOffice_letter());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s37\" size=\"10\" id=\"pOpen\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getOpen_or_close_campus());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s38\" size=\"15\" id=\"pRemarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[2].getRemarks());
      out.write("\">  </td>            \n");
      out.write("         </tr>\n");
      out.write("         \n");
      out.write("         <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"s41\" size=\"5\" id=\"pdate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getDate1());
      out.write("\">  </td>    \n");
      out.write("            <td>  <input type=\"text\" name=\"s42\" size=\"20\" id=\"pCompName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getCompany_name());
      out.write("\">  </td>    \n");
      out.write("            <td> <input type=\"text\" name=\"s43\" size=\"8\" id=\"pDes\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[3].getDesignation_or_job_tile());
      out.write("\">    </td>\n");
      out.write("            <td> <input type=\"text\" name=\"s44\" size=\"14\" id=\"pJob\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getJob_type());
      out.write("\"> </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s45\" size=\"5\" id=\"pAnnual\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[3].getAnnual_package());
      out.write("\"></td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s46\" size=\"5\" id=\"pOffice\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getOffice_letter());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s47\" size=\"10\" id=\"pOpen\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[3].getOpen_or_close_campus());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s48\" size=\"15\" id=\"pRemarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[3].getRemarks());
      out.write("\">  </td>            \n");
      out.write("         </tr>\n");
      out.write("         \n");
      out.write("         <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"s51\" size=\"5\" id=\"pdate\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getDate1());
      out.write("\">  </td>    \n");
      out.write("            <td>  <input type=\"text\" name=\"s52\" size=\"20\" id=\"pCompName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getCompany_name());
      out.write("\">  </td>    \n");
      out.write("            <td> <input type=\"text\" name=\"s53\" size=\"8\" id=\"pDes\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getDesignation_or_job_tile());
      out.write("\">    </td>\n");
      out.write("            <td> <input type=\"text\" name=\"s54\" size=\"14\" id=\"pJob\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getJob_type());
      out.write("\"> </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s55\" size=\"5\" id=\"pAnnual\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e[4].getAnnual_package());
      out.write("\"></td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s56\" size=\"5\" id=\"pOffice\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getOffice_letter());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s57\" size=\"10\" id=\"pOpen\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getOpen_or_close_campus());
      out.write("\">  </td>\n");
      out.write("            <td>  <input type=\"text\" name=\"s58\" size=\"15\" id=\"pRemarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e[4].getRemarks());
      out.write("\">  </td>            \n");
      out.write("         </tr>\n");
      out.write("         \n");
      out.write("                \n");
      out.write("         </table>\n");
      out.write("            <table>\n");
      out.write("                    <tr><td><span>Joint In :</span></td><td><input type=\"text\" name=\"JoinInDate\"></td>\n");
      out.write("                    <td><span>City :</span></td><td><input type=\"text\" name=\"JoiningCity\"></td></tr>\n");
      out.write("                    <tr><td><span>Country :</span></td><td><input type=\"text\" name=\"JoiningCountry\"></td>\n");
      out.write("                    <td><span>Year :</span></td><td><input type=\"text\" name=\"JoiningYear\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </fieldset>\n");
      out.write("        \n");
      out.write("          ");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("     \n");
      out.write("  ");
 try {
SessionFactory sf1=new AnnotationConfiguration().configure().addAnnotatedClass(javap.Acedemic_record.class).buildSessionFactory();
Session s1=sf1.openSession(); 
Transaction tx1=s1.beginTransaction();
Query q1=s1.createQuery("from javap.Acedemic_record where username='0827IT111058'");
lt1=q1.list();

if(lt1.isEmpty())
    { for(int j=0;j<8;j++)
        e1[j]=new Training_certificate();
   f=1;
    }
else{
      out.write(' ');
      out.write('\n');
for(Iterator t=lt1.iterator();t.hasNext();)
{
e1[i1]=(Training_certificate)t.next();
i1++;
} 
tx1.commit();
 s1.close();
  } }
catch(Exception ex) {
        System.out.println(ex);
         }
 
      out.write("\n");
      out.write("         <fieldset>\n");
      out.write("            <legend>TRAINING & CERTIFICATION DETAILS</legend>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Date</th>\n");
      out.write("                    <th>Course & Certification Name</th>\n");
      out.write("                    <th>Company</th>\n");
      out.write("                    <th>Marks Obtained</th>\n");
      out.write("                    <th>Max. Marks</th>\n");
      out.write("                    <th>Marks Percentage</th>\n");
      out.write("                    <th>Grade</th>\n");
      out.write("                    <th>Total Attendance</th>\n");
      out.write("                    <th>Attendance</th>\n");
      out.write("                    <th>Pass</th>\n");
      out.write("                    <th>Remarks</th>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td> <input type=\"text\" name=\"p11\" size=\"9\" id=\"TrainingDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e1[0].getDate());
      out.write("\"></td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p12\" size=\"20\" id=\"TrainingCourseName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getCourse_and_certification_name());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p13\" size=\"10\" id=\"TrainingCompany\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getCompany());
      out.write("\"> </td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p14\" size=\"3\" id=\"TrainingMarksObt\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getMarks_obtained());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p15\" size=\"3\" id=\"TrainingMaxMarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getMax_marks());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p16\" size=\"3\" id=\"TrainingMarksPercentage\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getMarks_percentage());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p17\" size=\"2\" id=\"TrainingGrade\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getGrade());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p18\" size=\"3\" id=\"TrainingTotAttendance\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getTotal_attendance() );
      out.write("\"></td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p19\" size=\"3\" id=\"TrainingAttend\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getAttendance());
      out.write("\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p110\" size=\"3\" id=\"TrainingPass\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getPass());
      out.write("\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p111\" size=\"15\" id=\"TrainingRemark\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[0].getRemark());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                    <td>  <input type=\"text\" name=\"p21\" size=\"9\" id=\"TrainingDate\" required onchange=\"textValidation(id)\"  value=\"");
      out.print( e1[1].getDate());
      out.write("\"></td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p22\" size=\"20\" id=\"TrainingCourseName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getCourse_and_certification_name());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p23\" size=\"10\" id=\"TrainingCompany\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[1].getCompany());
      out.write("\"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p24\" size=\"3\" id=\"TrainingMarksObt\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getMarks_obtained());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p25\" size=\"3\" id=\"TrainingMaxMarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getMax_marks());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p26\" size=\"3\" id=\"TrainingMarksPercentage\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[1].getMarks_percentage());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p27\" size=\"2\" id=\"TrainingGrade\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getGrade());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p28\" size=\"3\" id=\"TrainingTotAttendance\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getTotal_attendance() );
      out.write("\"></td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p29\" size=\"3\" id=\"TrainingAttend\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getAttendance());
      out.write("\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p210\" size=\"3\" id=\"TrainingPass\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getPass());
      out.write("\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p211\" size=\"15\" id=\"TrainingRemark\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[1].getRemark());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                     <td>  <input type=\"text\" name=\"p31\" size=\"9\" id=\"TrainingDate\" required onchange=\"textValidation(id)\" value=\"");
      out.print( e1[2].getDate());
      out.write("\"></td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p32\" size=\"20\" id=\"TrainingCourseName\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getCourse_and_certification_name());
      out.write("\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p33\" size=\"10\" id=\"TrainingCompany\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[2].getCompany());
      out.write("\"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p34\" size=\"3\" id=\"TrainingMarksObt\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getMarks_obtained());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p35\" size=\"3\" id=\"TrainingMaxMarks\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getMax_marks());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p36\" size=\"3\" id=\"TrainingMarksPercentage\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getTotal_attendance() );
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p37\" size=\"2\" id=\"TrainingGrade\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getGrade());
      out.write("\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p38\" size=\"3\" id=\"TrainingTotAttendance\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getPass());
      out.write("\"></td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p39\" size=\"3\" id=\"TrainingAttend\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getTotal_attendance() );
      out.write("\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p310\" size=\"3\" id=\"TrainingPass\" required onchange=\"textValidation(id)\" value=\"");
      out.print(e1[2].getPass());
      out.write("\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p311\" size=\"15\" id=\"TrainingRemark\" required onchange=\"textValidation(id)\"  value=\"");
      out.print(e1[2].getRemark());
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                     <td>  <input type=\"text\" name=\"p41\" size=\"9\" id=\"TrainingDate\" required onchange=\"textValidation(id)\"></td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p42\" size=\"20\" id=\"TrainingCourseName\" required onchange=\"textValidation(id)\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p43\" size=\"10\" id=\"TrainingCompany\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p44\" size=\"3\" id=\"TrainingMarksObt\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p45\" size=\"3\" id=\"TrainingMaxMarks\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p46\" size=\"3\" id=\"TrainingMarksPercentage\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p47\" size=\"2\" id=\"TrainingGrade\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p48\" size=\"3\" id=\"TrainingTotAttendance\" required onchange=\"textValidation(id)\"></td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p49\" size=\"3\" id=\"TrainingAttend\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p410\" size=\"3\" id=\"TrainingPass\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p411\" size=\"15\" id=\"TrainingRemark\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr class=\"tableTxt\">\n");
      out.write("                     <td>  <input type=\"text\" name=\"p51\" size=\"9\" id=\"TrainingDate\" required onchange=\"textValidation(id)\"></td>    \n");
      out.write("                     <td>  <input type=\"text\" name=\"p52\" size=\"20\" id=\"TrainingCourseName\" required onchange=\"textValidation(id)\"></td>    \n");
      out.write("                        <td> <input type=\"text\" name=\"p53\" size=\"10\" id=\"TrainingCompany\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td> <input type=\"text\" name=\"p54\" size=\"3\" id=\"TrainingMarksObt\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p55\" size=\"3\" id=\"TrainingMaxMarks\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p56\" size=\"3\" id=\"TrainingMarksPercentage\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p57\" size=\"2\" id=\"TrainingGrade\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                        <td>  <input type=\"text\" name=\"p58\" size=\"3\" id=\"TrainingTotAttendance\" required onchange=\"textValidation(id)\"></td>            \n");
      out.write("                        <td>  <input type=\"text\" name=\"p59\" size=\"3\" id=\"TrainingAttend\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p510\" size=\"3\" id=\"TrainingPass\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                      <td>  <input type=\"text\" name=\"p511\" size=\"15\" id=\"TrainingRemark\" required onchange=\"textValidation(id)\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </fieldset>\n");
      out.write("        \n");
      out.write(" </form> \n");
      out.write("    </body>\n");
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
