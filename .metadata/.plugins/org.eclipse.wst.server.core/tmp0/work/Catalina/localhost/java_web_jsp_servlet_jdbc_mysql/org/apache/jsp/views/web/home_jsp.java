/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-03-11 18:13:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1582349879470L));
    _jspx_dependants.put("jar:file:/E:/JAVA_WEB_JSP_SERVLET_JDBC_MYSQL/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/java_web_jsp_servlet_jdbc_mysql/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/E:/JAVA_WEB_JSP_SERVLET_JDBC_MYSQL/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/java_web_jsp_servlet_jdbc_mysql/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1582293489152L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1582293489645L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Trang chủ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  \r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-3\">\r\n");
      out.write("\r\n");
      out.write("          <h1 class=\"my-4\">Shop Cars</h1>\r\n");
      out.write("          <div class=\"list-group\">\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Mini Cars</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Small Cars</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Medium Cars</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Large Cars</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Executive Cars</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Full-size luxury Cars</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Sports Coupes</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Multi Purpose Cars</a>\r\n");
      out.write("          <a href='");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("' class=\"list-group-item\">Sport-Utility Cars</a>\r\n");
      out.write("          <!--  \r\n");
      out.write("          \t<div class=\"list-group-item\"><a href='");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("'><img alt=\"Volkswagen logo not exist\" src=\"./images/logo/Volkswagen-logo-2019-1500x1500.png\" style=\"width:50px;height=50px\" title=\"Volkswagen\"></a></div>\r\n");
      out.write("          \t<div class=\"list-group-item\"><a href=\"#\"><img alt=\"Vinfast logo not exist\" src=\"./images/logo/Vinfast-logo.png\" style=\"width:50px;height=50px\" title=\"Vinfast\"></a></div>\r\n");
      out.write("            <div class=\"list-group-item\"><a href=\"#\"><img alt=\"Audi logo not exist\" src=\"./images/logo/Audi-logo-1999-1920x1080.png\" style=\"width:70px;height=50px\" title=\"Audi\"></a></div>\r\n");
      out.write("            <div class=\"list-group-item\"><a href=\"#\"><img alt=\"BMW logo not exist\" src=\"./images/logo/BMW-logo-2000-2048x2048.png\" style=\"width:50px;height=50px\" title=\"BMW\"></a></div>\r\n");
      out.write("            <div class=\"list-group-item\"><a href=\"#\"><img alt=\"Cadillac logo not exist\" src=\"./images/logo/Cadillac-logo-2014-1920x1080.png\" style=\"width:70px;height=80px\" title=\"Cadillac\"></a></div>\r\n");
      out.write("          \t<div class=\"list-group-item\"><a href=\"#\"><img alt=\"Chevrolet logo not exist\" src=\"./images/logo/Chevrolet-logo-2013-2560x1440.png\" style=\"width:50px;height=50px\" title=\"Chevrolet\"></a></div>\r\n");
      out.write("            <div class=\"list-group-item\"><a href=\"#\"><img alt=\"Vinfast logo not exist\" src=\"./images/logo/Vinfast-logo.png\" style=\"width:50px;height=50px\" title=\"Vinfast\"></a></div>\r\n");
      out.write("            <div class=\"list-group-item\"><a href=\"#\"><img alt=\"Vinfast logo not exist\" src=\"./images/logo/Vinfast-logo.png\" style=\"width:50px;height=50px\" title=\"Vinfast\"></a></div>\r\n");
      out.write("            <div class=\"list-group-item\"><a href=\"#\"><img alt=\"Aston Martin logo not exist\" src=\"./images/logo/Aston-Martin-logo-2003-6000x3000.png\" style=\"width:80px;height=40px\" title=\"Aston Martin\"></a></div>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">BMW</a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Cadillac</a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Chevrolet</a>\r\n");
      out.write("            <a href=\"#\" class=\"list-group-item\">Ferrari</a>\r\n");
      out.write("            -->\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.col-lg-3 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-9\">\r\n");
      out.write("\r\n");
      out.write("          <div id=\"carouselExampleIndicators\" class=\"carousel slide my-4\" data-ride=\"carousel\">\r\n");
      out.write("            <ol class=\"carousel-indicators\">\r\n");
      out.write("              <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("              <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("              <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("              <div class=\"carousel-item active\">\r\n");
      out.write("                <img class=\"d-block img-fluid\" style=\"width:1500px;height:500px\" src=\"./images/cars/a2_eobn.jpg\" alt=\"First slide\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <img class=\"d-block img-fluid\" style=\"width:1500px;height:500px\" src=\"./images/cars/17043_VinFast.jpg\" alt=\"Second slide\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"carousel-item\">\r\n");
      out.write("                <img class=\"d-block img-fluid\" style=\"width:1500px;height:500px\" src=\"./images/cars/vinfast2_aatg.jpg\" alt=\"Third slide\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("              <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("              <span class=\"sr-only\">Previous</span>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("              <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("              <span class=\"sr-only\">Next</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("              <div class=\"card h-100\">\r\n");
      out.write("                <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <h4 class=\"card-title\">\r\n");
      out.write("                    <a href=\"#\">Item One</a>\r\n");
      out.write("                  </h4>\r\n");
      out.write("                  <h5>$24.99</h5>\r\n");
      out.write("                  <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("              <div class=\"card h-100\">\r\n");
      out.write("                <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <h4 class=\"card-title\">\r\n");
      out.write("                    <a href=\"#\">Item Two</a>\r\n");
      out.write("                  </h4>\r\n");
      out.write("                  <h5>$24.99</h5>\r\n");
      out.write("                  <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("              <div class=\"card h-100\">\r\n");
      out.write("                <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <h4 class=\"card-title\">\r\n");
      out.write("                    <a href=\"#\">Item Three</a>\r\n");
      out.write("                  </h4>\r\n");
      out.write("                  <h5>$24.99</h5>\r\n");
      out.write("                  <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("              <div class=\"card h-100\">\r\n");
      out.write("                <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <h4 class=\"card-title\">\r\n");
      out.write("                    <a href=\"#\">Item Four</a>\r\n");
      out.write("                  </h4>\r\n");
      out.write("                  <h5>$24.99</h5>\r\n");
      out.write("                  <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("              <div class=\"card h-100\">\r\n");
      out.write("                <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <h4 class=\"card-title\">\r\n");
      out.write("                    <a href=\"#\">Item Five</a>\r\n");
      out.write("                  </h4>\r\n");
      out.write("                  <h5>$24.99</h5>\r\n");
      out.write("                  <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur! Lorem ipsum dolor sit amet.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-4 col-md-6 mb-4\">\r\n");
      out.write("              <div class=\"card h-100\">\r\n");
      out.write("                <a href=\"#\"><img class=\"card-img-top\" src=\"http://placehold.it/700x400\" alt=\"\"></a>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <h4 class=\"card-title\">\r\n");
      out.write("                    <a href=\"#\">Item Six</a>\r\n");
      out.write("                  </h4>\r\n");
      out.write("                  <h5>$24.99</h5>\r\n");
      out.write("                  <p class=\"card-text\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet numquam aspernatur!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer\">\r\n");
      out.write("                  <small class=\"text-muted\">&#9733; &#9733; &#9733; &#9733; &#9734;</small>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.col-lg-9 -->\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("      <!-- /.row -->\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /views/web/home.jsp(17,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/group?category=mini");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /views/web/home.jsp(18,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/group?category=small");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /views/web/home.jsp(19,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/group?category=medium");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /views/web/home.jsp(20,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/group?category=large");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /views/web/home.jsp(21,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/group?category=executive");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f5_reused = false;
    try {
      _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f5.setParent(null);
      // /views/web/home.jsp(22,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f5.setValue("/group?category=fullSize");
      int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
      if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      _jspx_th_c_005furl_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f5, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f6_reused = false;
    try {
      _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f6.setParent(null);
      // /views/web/home.jsp(23,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f6.setValue("/group?category=sports");
      int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
      if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      _jspx_th_c_005furl_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f6, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f7_reused = false;
    try {
      _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f7.setParent(null);
      // /views/web/home.jsp(24,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f7.setValue("/group?category=multi");
      int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
      if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      _jspx_th_c_005furl_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f7, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f8_reused = false;
    try {
      _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f8.setParent(null);
      // /views/web/home.jsp(25,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f8.setValue("/group?category=sportUtility");
      int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
      if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      _jspx_th_c_005furl_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f8, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f9_reused = false;
    try {
      _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f9.setParent(null);
      // /views/web/home.jsp(27,49) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f9.setValue("/group?action=volkswagen");
      int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
      if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      _jspx_th_c_005furl_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f9, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f9_reused);
    }
    return false;
  }
}