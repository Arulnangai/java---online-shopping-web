package bean;

public class Supplier {
    private long supplierId;
    private String name;
    private String address;

    public Supplier(long supplierId, String name, String address) {
        this.supplierId = supplierId;
        this.name = name;
        this.address = address;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
