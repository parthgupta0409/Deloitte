package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("1.Init");
        super.init();
    }
 
    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    int counter=0;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String gn =request.getParameter("guestName");
        String[] color=request.getParameterValues("color");
        counter++;
        response.setContentType("text/html");
        response.getWriter().println("<h1>Hello " + gn + " Welcome In web site");
        response.getWriter().println("<h1> You are vistor numbere:"+counter);
       
        for(String c:color)
        {
            response.getWriter().println("<font color="+ c+ ">Hello " + gn + " Welcome In web site</font>");
        }
       
        if(gn.startsWith("A"))
    {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("ValidServlet");
        	 dispatcher.forward(request, response);
    }
        else
        {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("InvalidServlet");
       	 	dispatcher.forward(request, response);
        }
    }
 
}
