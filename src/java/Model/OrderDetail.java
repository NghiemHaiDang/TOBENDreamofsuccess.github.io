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
public class OrderDetail {

    private int id;
    private int order_id;
    private String job_name;
    private String imageurl;

    public OrderDetail() {
    }

    public OrderDetail(int id, int order_id, String job_name, String imageurl) {
        this.id = id;
        this.order_id = order_id;
        this.job_name = job_name;
        this.imageurl = imageurl;
    }

}
