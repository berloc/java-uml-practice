package warehouse.model;

import java.util.Date;

/**
 * Created by berloc on 2016.12.21..
 */
public class Order {

    private int orderID;
    private Date date;
    private int goodsID;
    private int quantity;
    private String status;


    public Order() {
    }

    public Order(int orderID, Date date, int goodsID, int quantity, String status) {
        this.orderID = orderID;
        this.date = date;
        this.goodsID = goodsID;
        this.quantity = quantity;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(int goodsID) {
        this.goodsID = goodsID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
