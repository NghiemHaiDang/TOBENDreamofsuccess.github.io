/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public abstract class BaseDAO<T> {

    protected Connection connection;

    public BaseDAO() {
        try {
            String user = "sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=haidang_NHD";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public abstract ArrayList<T> getAllCategory();

    public abstract ArrayList<T> getAllCompany();

    public abstract ArrayList<T> getAllJob();

    public abstract ArrayList<T> getAllQueues();

    public abstract ArrayList<T> getAllOrder();

    public abstract ArrayList<T> getAllOrderDetail();

    public abstract ArrayList<T> getAllAccount();

}
