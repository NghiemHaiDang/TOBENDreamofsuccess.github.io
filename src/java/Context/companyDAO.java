/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import Model.Category;
import Model.Company;
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
    
}
