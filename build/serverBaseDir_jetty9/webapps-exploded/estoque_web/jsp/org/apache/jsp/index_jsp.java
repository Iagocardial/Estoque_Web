package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"lib/bootstrap-4.3.1-dist/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <title>Estoque WEB</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-fluid container-principal\">\r\n");
      out.write("        <h1>Estoque WEB</h1>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 coluna-1\">\r\n");
      out.write("                <label for=\"\">Código</label>\r\n");
      out.write("                <input type=\"text\">\r\n");
      out.write("                <label for=\"\">Quantidade</label>\r\n");
      out.write("                <input type=\"number\" name=\"\" id=\"\">\r\n");
      out.write("                <form><button id=\"buscar\"> Buscar </button></form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col coluna-2\">\r\n");
      out.write("                <table class=\"table table-striped\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"col\">COD</th>\r\n");
      out.write("                            <th scope=\"col\">Produto</th>\r\n");
      out.write("                            <th scope=\"col\">Quantidade</th>\r\n");
      out.write("                            <th scope=\"col\">Valor/UN</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"row\">1</th>\r\n");
      out.write("                            <td>Leite</td>\r\n");
      out.write("                            <td>4</td>\r\n");
      out.write("                            <td>R$3,20</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"row\">2</th>\r\n");
      out.write("                            <td>Ovo</td>\r\n");
      out.write("                            <td>6</td>\r\n");
      out.write("                            <td>R$2,10</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"row\">3</th>\r\n");
      out.write("                            <td>Tênis Nike</td>\r\n");
      out.write("                            <td>1</td>\r\n");
      out.write("                            <td>R$320,99</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("                <button class=\"btn btn-primary\" id='Finalizar'>Finalizar Compra</button>\r\n");
      out.write("                <div class=\"alert alert-success\" role=\"alert\">\r\n");
      out.write("                    Compra Realizada!\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"src/main/webapp/lib/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"src/main/webapp/lib/bootstrap-4.3.1-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"src/main/webapp/js/efeitos.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
