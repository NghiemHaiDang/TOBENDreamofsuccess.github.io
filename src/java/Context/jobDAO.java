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
import java.util.List;
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

    public List<Job> getJobBycategoryId(int categoryId) {
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            String sql = "select *from job where categoryid = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, categoryId);
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

    public ArrayList<Job> getAllJobWithPagging(int page, int PAGE_SIZE) {
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            String sql = "select * from job order by id offset (?-1)*? row fetch next ? rows only";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, page);
            statement.setInt(2, PAGE_SIZE);
            statement.setInt(3, PAGE_SIZE);
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

    public int getTotalJobs() {
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            String sql = "select count(*) from job";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(categoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Job> search(String keyword) {
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            String sql = "select *from job where job_name like ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "%" + keyword + "%");
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

    public Job getJobById(int jobid) {
        ArrayList<Job> jobs = new ArrayList<>();
        try {
            String sql = "select *from job where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, jobid);
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
                return job;
            }
        } catch (SQLException ex) {
            Logger.getLogger(categoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public ArrayList<Job> getAllQueues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Job> getAllOrder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Job> getAllOrderDetail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Job> getAllAccount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Job getJob(String id) {
        try {
            String sql = "select *from job where id = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Job job = new Job();
                job.setId(rs.getInt("id"));
                job.setJob_name(rs.getString("company_name"));
                job.setDescription(rs.getString("description"));
                job.setSalary(rs.getString("salary"));
                job.setCategoryid(rs.getInt("categoryid"));
                job.setCompanyid(rs.getInt("companyid"));
                job.setRecruitmentdate(rs.getDate("recruitmentdate"));
                job.setExpirationdate(rs.getDate("expirationdate"));
                job.setImageurl(rs.getString("imageurl"));
                return job;
            }

        } catch (SQLException ex) {
            Logger.getLogger(jobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateJob(Job job) {
        try {
            String sql = "update job set job_name = ?, description = ? ,salary = ?,categoryid = ?, companyid = ?,recruitmentdate = ?, expirationdate = ?, imageurl = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, job.getJob_name());
            statement.setString(2, job.getDescription());
            statement.setString(3, job.getSalary());
            statement.setInt(4, job.getCategoryid());
            statement.setInt(5, job.getCompanyid());
            statement.setDate(6, job.getRecruitmentdate());
            statement.setDate(7, job.getExpirationdate());
            statement.setString(8, job.getImageurl());
            statement.setInt(6, job.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(jobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteJob(String id) {
        try {
            String sql = "delete job where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(companyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertJob(Job job) {
        try {
            String sql = "insert into job (job_name, description, salary, categoryid, companyid, recruitmentdate, expirationdate, imageurl) values (?,?,?,?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, job.getJob_name());
            statement.setString(2, job.getDescription());
            statement.setString(3, job.getSalary());
            statement.setInt(4, job.getCategoryid());
            statement.setInt(5, job.getCompanyid());
            statement.setDate(6, job.getRecruitmentdate());
            statement.setDate(7, job.getExpirationdate());
            statement.setString(8, job.getImageurl());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(companyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
