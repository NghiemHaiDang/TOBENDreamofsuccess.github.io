/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import Model.Category;
import Model.Company;
import Model.Job;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class jobDAO extends BaseDAO<Job> {

    @Override
    public ArrayList<Job> getAllCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Job> getAllCompany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Job> getAllJob() {
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            String sql = "select *from job";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Job job = new Job();
                job.setId(rs.getInt("id"));
                job.setJob_name(rs.getString("job_name"));
                job.setDescription(rs.getString("description"));
                job.setSalary(rs.getString("salary"));
                job.setCategoryid(rs.getInt("categoryid"));
                job.setCompanyid(rs.getInt("companyid"));
                job.setRecruitmentdate(rs.getDate("recruitmentdate"));
                job.setExpirationdate(rs.getDate("expirationdate"));
                job.setImageurl(rs.getString("imageurl"));
                jobs.add(job);
            }
        } catch (SQLException ex) {
            Logger.getLogger(categoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return jobs;
    }

}
