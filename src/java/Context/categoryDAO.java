/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import Context.BaseDAO;
import Model.Category;
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
public class categoryDAO extends BaseDAO<Category> {
    
    @Override
    public ArrayList<Category> getAllCategory() {
        ArrayList<Category> categorys = new ArrayList<>();
        try {
            String sql = "select *from category";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setId(rs.getInt("id"));
                c.setCt_name(rs.getString("ct_name"));
                categorys.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(categoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorys;
    }
    
}
