/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Builder
@ToString
@Getter
@Setter
public class Account {

    public static final String admin = "admin";
    public static final String usercompany = "usercompany";
    private int id;
    private String username;
    private String password;
    private String displayname;
    private String address;
    private String email;
    private String phone;
    private String role;

    public Account() {
    }

    public Account(int id, String username, String password, String displayname, String address, String email, String phone, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

}
