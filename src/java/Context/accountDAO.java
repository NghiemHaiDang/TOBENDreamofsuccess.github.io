/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import Model.Account;
import Model.Category;
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
public class accountDAO extends BaseDAO<Account> {

    @Override
    public ArrayList<Account> getAllCategory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> getAllCompany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> getAllJob() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> getAllQueues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> getAllOrder() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> getAllOrderDetail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Account> getAllAccount() {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = "select *from account";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setId(rs.getInt("id"));
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("password"));
                a.setDisplayname(rs.getString("displayname"));
                a.setAddress(rs.getString("address"));
                a.setEmail(rs.getString("email"));
                a.setPhone(rs.getString("phone"));
                a.setRole(rs.getString("role"));
                accounts.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public Account login(String username, String password) {
        try {
            String sql = "select *from account where username = ? and password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setDisplayname(rs.getString("displayname"));
                account.setAddress(rs.getString("address"));
                account.setEmail(rs.getString("email"));
                account.setPhone(rs.getString("phone"));
                account.setRole(rs.getString("role"));
                return account;
            }

        } catch (SQLException ex) {
            Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertAccount(Account a) {
        try {
            String sql = "insert into account (username,password,displayName,address,email,phone,role) values (?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, a.getUsername());
            statement.setString(2, a.getPassword());
            statement.setString(3, a.getDisplayname());
            statement.setString(4, a.getAddress());
            statement.setString(5, a.getEmail());
            statement.setString(6, a.getPhone());
            statement.setString(7, a.getRole());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteAccount(String id) {
        try {
            String sql = "delete account where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(accountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
