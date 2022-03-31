package ua.goit.practice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/book")
public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book1 = new Book("Kobzar", "shevchenko@mail.com", "1800");
        Book book2 = new Book("I am Zlatan", "ibrahimovic@mail.com", "2020");

        req.setAttribute("books", List.of(book1, book2));
        req.getRequestDispatcher("/html/book.jsp").forward(req, resp);
    }
}
