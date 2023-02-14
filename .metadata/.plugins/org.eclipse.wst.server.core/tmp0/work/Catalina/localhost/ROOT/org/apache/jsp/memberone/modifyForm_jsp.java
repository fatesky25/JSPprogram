/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.85
 * Generated at: 2023-02-07 04:23:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.memberone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.memberone.*;

public final class modifyForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("com.memberone");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      com.memberone.StudentDAO dao = null;
      dao = (com.memberone.StudentDAO) _jspx_page_context.getAttribute("dao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new com.memberone.StudentDAO();
        _jspx_page_context.setAttribute("dao", dao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Update Form</title>\r\n");
      out.write("<link href=\"style.css\"rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

   String loginID = (String)session.getAttribute("loginID");
   StudentVO vo = dao.getMember(loginID);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"modifyProc.jsp\" method=\"post\" name=\"regForm\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("  <td colspan=\"2\" align=\"center\">회원 수정 정보 입력</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <td align=\"right\">아이디</td>\r\n");
      out.write("    <td>");
      out.print(vo.getId() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <td align=\"right\">비밀번호</td>\r\n");
      out.write("    <td><input type=\"password\" name=\"pass\" value=\"");
      out.print(vo.getPass());
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <td align=\"right\">비밀번호 확인</td>\r\n");
      out.write("    <td><input type=\"password\" name=\"repass\" value=\"");
      out.print(vo.getPass());
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <td align=\"right\">이름</td>\r\n");
      out.write("    <td>");
      out.print(vo.getName() );
      out.write("</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("       <td align=\"right\">전화번호</td>\r\n");
      out.write("       <td>\r\n");
      out.write("          <input type=\"text\" name=\"phone1\"\r\n");
      out.write("           size=\"5\" value=\"");
      out.print(vo.getPhone1());
      out.write("\">-\r\n");
      out.write("          <input type=\"text\" name=\"phone2\"\r\n");
      out.write("           size=\"5\" value=\"");
      out.print(vo.getPhone2());
      out.write("\">-\r\n");
      out.write("          <input type=\"text\" name=\"phone3\"\r\n");
      out.write("           size=\"5\" value=\"");
      out.print(vo.getPhone3());
      out.write("\">       \r\n");
      out.write("       </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <td align=\"right\">이메일</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"email\" \r\n");
      out.write("    value=\"");
      out.print(vo.getEmail());
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("   <tr>\r\n");
      out.write("    <td align=\"right\">우편번호</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"zipcode\" \r\n");
      out.write("    value=\"");
      out.print(vo.getZipcode());
      out.write("\">\r\n");
      out.write("         <input type=\"button\" value=\"찾기\" onclick=\"zipCheck()\">\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"right\">주소1</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"address1\" size=\"50\"\r\n");
      out.write("     value=\"");
      out.print(vo.getAddress1());
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"right\">주소2</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"address2\" size=\"30\"\r\n");
      out.write("    value=\"");
      out.print(vo.getAddress2());
      out.write("\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("     <td colspan=\"2\" align=\"center\">\r\n");
      out.write("        <input type=\"button\" value=\"정보수정\" \r\n");
      out.write("        onclick=\"updateCheck()\">&nbsp;&nbsp;\r\n");
      out.write("        <input type=\"button\" value=\"취소\"\r\n");
      out.write("        onclick=\"javascript:window.location='login.jsp'\"> \r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
