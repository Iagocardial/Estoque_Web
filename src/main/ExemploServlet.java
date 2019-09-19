import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;


@WebServlet("/exemplo")
public class ExemploServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res){

        try{
            PrintWriter pw = res.getWriter();
            pw.write("Funcionando!!");
            pw.close();

        } catch (Exception e){
            System.out.print("Errou ao escrever na resposta");
        }
    }
}