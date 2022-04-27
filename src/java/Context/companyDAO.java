/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import Model.Account;
import Model.Category;
import Model.Company;
import java.sql.Date;
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
public class companyDAO extends BaseDAO<Company> {

    @Override
    public ArrayList<Company> getAllCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Company> getAllCompany() {
        ArrayList<Company> companys = new ArrayList<>();
        try {
            String sql = "select *from company";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Company c = new Company();
                c.setId(rs.getInt("id"));
                c.setCompany_name(rs.getString("company_name"));
                c.setAddress(rs.getString("address"));
                c.setCeo(rs.getString("ceo"));
                c.setPhonecompany(rs.getString("phonecompany"));
                c.setImageurlcompany(rs.getString("imageurlcompany"));
                companys.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(categoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return companys;
    }

    @Override
    public ArrayList<Company> getAllJob() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertCompany(Company c) {
        try {
            String sql = "insert into company(company_name, address, ceo, phonecompany,imageurlcompany) values (?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, c.getCompany_name());
            statement.setString(2, c.getAddress());
            statement.setString(3, c.getCeo());
            statement.setString(4, c.getPhonecompany());
            statement.setString(5, c.getImageurlcompany());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(companyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Company> getAllQueues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Company> getAllOrder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Company> getAllOrderDetail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Company> getAllAccount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteCompany(String id) {
        try {
            String sql = "delete company where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(companyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Company getCompany(String id) {
        try {
            String sql = "select *from company where id = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Company company = new Company();
                company.setId(rs.getInt("id"));
                company.setCompany_name(rs.getString("company_name"));
                company.setAddress(rs.getString("address"));
                company.setCeo(rs.getString("ceo"));
                company.setPhonecompany(rs.getString("phonecompany"));
                company.setImageurlcompany(rs.getString("imageurlcompany"));
                return company;
            }

        } catch (SQLException ex) {
            Logger.getLogger(companyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateCompany(Company company) {
        try {
            String sql = "update company set company_name = ?, address = ? ,ceo = ?, phonecompany = ?, imageurlcompany = ? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, company.getCompany_name());
            statement.setString(2, company.getAddress());
            statement.setString(3, company.getCeo());
            statement.setString(4, company.getPhonecompany());
            statement.setString(5, company.getImageurlcompany());
            statement.setInt(6, company.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(companyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
