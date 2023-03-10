package mk.ukim.finki.fashionstore.web.servlet;

import mk.ukim.finki.fashionstore.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "category-servlet",urlPatterns = "/servlet/category")
public class CategoryServlet extends HttpServlet {

    private final CategoryService categoryService;

    public CategoryServlet(CategoryService categoryService) {
        this.categoryService = categoryService;
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String ipAddress= req.getRemoteAddr();
        String clinetAgent = req.getHeader("User-Agent");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>User info</h3>");
        out.format("IP Address: %s",ipAddress);
        out.format("Client Agent: %s",clinetAgent);
        out.println("<h3>Category list</h3>");
        out.println("<ul>");
        categoryService.listCategories().forEach(r->
                out.format("<li>%s (%s)</li>",r.getName(),r.getDescription()));

        out.println("</ul>");
        out.println("<h2>Add New Category</h2>");

        out.println("<form method='POST' action='/hello'/>");
        out.println("<label for='name'>Name:<label>");
        out.println("<input id='name' type='text' name='name'/>");
        out.println("<label for='desc'>Description:<label>");
        out.println("<input id='desc' type='text' name='desc'/>");
        out.println("<input type='submit' value='Submit'/>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
        out.flush();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String categoryName = (String)req.getParameter("name");
        String categoryDesc = (String) req.getParameter("description");
        categoryService.create(categoryName,categoryDesc);
        resp.sendRedirect("/servlet/category");

    }

}
