/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Category {
    private int id;
    private String ct_name;

    public Category() {
    }

    public Category(int id, String ct_name) {
        this.id = id;
        this.ct_name = ct_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCt_name() {
        return ct_name;
    }

    public void setCt_name(String ct_name) {
        this.ct_name = ct_name;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", ct_name=" + ct_name + '}';
    }

    
}
