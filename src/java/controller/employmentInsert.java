/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import Context.categoryDAO;
import Context.companyDAO;
import Context.jobDAO;
import Model.Category;
import Model.Company;
import Model.Job;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class employmentInsert extends HttpServlet {

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
 
            String job_name = request.getParameter("jobname");
            String description = request.getParameter("description");
            String salary = request.getParameter("salary");
            String category_name = request.getParameter("category");
            String company_name = request.getParameter("company");
            Date recruitmentdate = Date.valueOf(request.getParameter("recruitmentdate"));
            Date expirationdate = Date.valueOf(request.getParameter("dexpirationdate"));
            String imageurl = request.getParameter("imageurl");
            jobDAO jobdao = new jobDAO();
            categoryDAO ctDao = new categoryDAO();
            companyDAO cpDao = new companyDAO();
            int category_id = 0;
            int company_id = 0;
            ArrayList<Category> listCategory = ctDao.getAllCategory();
            ArrayList<Company> listCompany = cpDao.getAllCompany();
            for (Company company : listCompany) {
                if(company.getCompany_name().equals(company_name)){
                    company_id = company.getId();
                }
            }
            for (Category category : listCategory) {
                if(category.getCt_name().equals(category_name)){
                    category_id = category.getId();
                }
            }
            Job job = new Job(job_name, description, salary, category_id, company_id, recruitmentdate, expirationdate, imageurl);
            jobdao.insertJob(job);
            request.getRequestDispatcher("employmentinformation.jsp").forward(request, response);
        
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
        processRequest(request, response);
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
        processRequest(request, response);
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
