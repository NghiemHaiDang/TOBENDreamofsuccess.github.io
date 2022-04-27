/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import Context.accountDAO;
import Context.companyDAO;
import Context.jobDAO;
import Model.Account;
import Model.Company;
import Model.Job;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class updateJob extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet updateJob</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet updateJob at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String idUpdate = request.getParameter("updateId");
        jobDAO dao = new jobDAO();
        Job job = dao.getJob(idUpdate);
        request.setAttribute("job", job);
        request.getRequestDispatcher("updateJob.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String id = request.getParameter("idup");
        int id1 = Integer.parseInt(id);
        String jobname = request.getParameter("jobname");
        String des = request.getParameter("description");
        String salary = request.getParameter("salary");
        String categoryid = request.getParameter("categoryid");
        int categoryid1 = Integer.parseInt(categoryid);
        String companyid = request.getParameter("companyid");
        int companyid1 = Integer.parseInt(companyid);
        Date rec = Date.valueOf(request.getParameter("recruitmentdate"));
        Date exp = Date.valueOf(request.getParameter("expirationdate"));
        String img = request.getParameter("imageurl");
        jobDAO dao = new jobDAO();
        Job job = new Job(id1, jobname, des, salary, categoryid1, companyid1, rec, exp, img);
        dao.updateJob(job);
        response.sendRedirect("listJob");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
