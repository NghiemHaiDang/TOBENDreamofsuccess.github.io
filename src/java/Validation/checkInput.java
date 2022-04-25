/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class checkInput {

    public boolean checkInputCompany(String company_name, String address, String ceo, String phonecompany, String imageurlcompany) {
        Pattern pattern1 = Pattern.compile("^[0-9]+$");
        Matcher matcher1 = pattern1.matcher(company_name);
        if (company_name!=null&&address!=null&&matcher1.find()&&imageurlcompany!=null) {
            return true;
        }
        return false;
    }

}
