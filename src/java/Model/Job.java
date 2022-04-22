/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Job {

    private int id;
    private String job_name;
    private String description;
    private String salary;
    private int categoryid;
    private int companyid;
    private Date recruitmentdate;
    private Date expirationdate;
    private String imageurl;

    public Job() {
    }

    public Job(int id, String job_name, String description, String salary, int categoryid, int companyid, Date recruitmentdate, Date expirationdate, String imageurl) {
        this.id = id;
        this.job_name = job_name;
        this.description = description;
        this.salary = salary;
        this.categoryid = categoryid;
        this.companyid = companyid;
        this.recruitmentdate = recruitmentdate;
        this.expirationdate = expirationdate;
        this.imageurl = imageurl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public Date getRecruitmentdate() {
        return recruitmentdate;
    }

    public void setRecruitmentdate(Date recruitmentdate) {
        this.recruitmentdate = recruitmentdate;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
