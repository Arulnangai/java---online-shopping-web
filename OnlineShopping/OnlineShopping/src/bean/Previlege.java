package bean;

import java.util.Date;

public class Previlege extends Customer{
    private double discountPercent;

    public Previlege(String name, String dob, String gender, String customerId, String address, String phone, String email, double discountPercent) {
        super(name, dob, gender, customerId, address, phone, email);
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return "Previlege{" +
                "discountPercent=" + discountPercent +super.toString()+
                '}';
    }
}
