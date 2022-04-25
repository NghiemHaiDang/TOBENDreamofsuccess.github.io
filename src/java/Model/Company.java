/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Company {

    private int id;
    private String company_name;
    private String address;
    private String ceo;
    private String phonecompany;
    private String imageurlcompany;

    public Company() {
    }

    public Company(String company_name, String address, String ceo, String phonecompany, String imageurlcompany) {
        this.company_name = company_name;
        this.address = address;
        this.ceo = ceo;
        this.phonecompany = phonecompany;
        this.imageurlcompany = imageurlcompany;
    }

    public Company(int id, String company_name, String address, String ceo, String phonecompany, String imageurlcompany) {
        this.id = id;
        this.company_name = company_name;
        this.address = address;
        this.ceo = ceo;
        this.phonecompany = phonecompany;
        this.imageurlcompany = imageurlcompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getPhonecompany() {
        return phonecompany;
    }

    public void setPhonecompany(String phonecompany) {
        this.phonecompany = phonecompany;
    }

    public String getImageurlcompany() {
        return imageurlcompany;
    }

    public void setImageurlcompany(String imageurlcompany) {
        this.imageurlcompany = imageurlcompany;
    }

}
