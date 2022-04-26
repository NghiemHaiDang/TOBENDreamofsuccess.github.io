/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
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
public class Order {

    private int id;
    private int account_id;
    private String note;
    private Date created_date;
    private int queues_id;

    public Order() {
    }

    public Order(int id, int account_id, String note, Date created_date, int queues_id) {
        this.id = id;
        this.account_id = account_id;
        this.note = note;
        this.created_date = created_date;
        this.queues_id = queues_id;
    }

}
