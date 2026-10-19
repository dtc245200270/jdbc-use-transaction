package com.codegym.controller;

import com.codegym.dao.UserDAO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private UserDAO userDAO;

    public void init() {
        userDAO = new UserDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "test-use-tran":
                testUseTran(request, response);
                break;
            default:
                response.getWriter().println("User Management Application");
                break;
        }
    }

    private void testUseTran(HttpServletRequest request, HttpServletResponse response) throws IOException {
        userDAO.insertUpdateUseTransaction();
        System.out.println("Hoàn tất gọi hàm testUseTran!");
        response.getWriter().println("Executed testUseTran successfully. Check database!");
    }
}
