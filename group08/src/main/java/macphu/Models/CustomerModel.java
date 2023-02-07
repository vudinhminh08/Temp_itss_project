package macphu.Models;

import javafx.beans.property.SimpleStringProperty;

public class CustomerModel {
    private SimpleStringProperty customerName;
    private SimpleStringProperty customerAddress;
    private SimpleStringProperty customerPhone;

    public CustomerModel() {
    }

    public CustomerModel(String customerName, String customerAddress, String customerPhone) {
        this.customerName = new SimpleStringProperty(customerName);
        this.customerAddress = new SimpleStringProperty(customerAddress);
        this.customerPhone = new SimpleStringProperty(customerPhone);
    }

    public String getCustomerName() {
        return this.customerName.get();
    }

    public void setCustomerName(String customerName) {
        this.customerName = new SimpleStringProperty(customerName);
    }

    public String getCustomerAddress() {
        return this.customerAddress.get();
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = new SimpleStringProperty(customerAddress);
    }

    public String getCustomerPhone() {
        return this.customerPhone.get();
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = new SimpleStringProperty(customerPhone);
    }

    
}
