/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.UserService;

/**
 *
 * @author Jay
 */
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService us = new UserService();
        String action = (String) request.getParameter("action");
        try{
            HttpSession session = request.getSession();
            List<User> users = us.getAll();
            request.setAttribute("users", users);
        } catch (Exception ex){
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception gotten");
        }
        
        if(action!=null)
        {
            if (action.equals("edit"))
            {
                System.out.println("ACTION: EDIT");
                getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService us = new UserService();
        
        try{
            HttpSession session = request.getSession();
            List<User> users = us.getAll();
            request.setAttribute("users", users);
        } catch (Exception ex){
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception gotten");
        }
        
        String action = (String)request.getParameter("action");
        if(action.equals("add")){
            System.out.println("ACTION: ADD");
        }
        else if(action.equals("save"))
        {
            System.out.println("ACTION: SAVE");
        }
        else if(action == null)
        {
            System.out.println("action null");
        }
       
        getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
        System.out.println("POST");

    }
}