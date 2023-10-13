package bean;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private long orderId;
    private String orderDate;
    private String orderStatus;
    private double orderAmount;
    private double amountAfterDiscount;
    private ArrayList<Item> itemArrayList;
    private Customer customer;

    public Order(long orderId, String orderDate, String orderStatus, double orderAmount, double amountAfterDiscount, ArrayList<Item> itemArrayList, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderAmount = orderAmount;
        this.amountAfterDiscount = amountAfterDiscount;
        this.itemArrayList = itemArrayList;
        this.customer = customer;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    public void setAmountAfterDiscount(double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }

    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderAmount=" + orderAmount +
                ", amountAfterDiscount=" + amountAfterDiscount +
                ", itemArrayList=" + itemArrayList +
                ", customer=" + customer +
                '}';
    }
}
