package macphu.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class BikeModel {
    private SimpleIntegerProperty barcode;
    private SimpleStringProperty type;
    private SimpleStringProperty description;
    private SimpleStringProperty status;
    private SimpleStringProperty battery;
    private SimpleStringProperty licensePlate;
    private SimpleIntegerProperty deposit;

    

    public BikeModel(int barcode, String type, String description, String status) {
        this.barcode = new SimpleIntegerProperty(barcode);
        this.type = new SimpleStringProperty(type);
        this.description = new SimpleStringProperty(description);
        this.status = new SimpleStringProperty(status);
        this.battery = new SimpleStringProperty("");
        this.licensePlate = new SimpleStringProperty("");
        if(type.equals("normal")){
            this.deposit = new SimpleIntegerProperty(400000);
        }
        else this.deposit = new SimpleIntegerProperty(550000);
    }

    public BikeModel(int barcode, String type, String description, String status, String battery, String licensePlate){
        this.barcode = new SimpleIntegerProperty(barcode);
        this.type = new SimpleStringProperty(type);
        this.description = new SimpleStringProperty(description);
        this.status = new SimpleStringProperty(status);
        this.battery = new SimpleStringProperty(battery);
        this.licensePlate = new SimpleStringProperty(licensePlate);
        this.deposit = new SimpleIntegerProperty(700000);
    }

    public int getDeposit() {
        return this.deposit.get();
    }

    public String getStatus(){
        return status.get();
    }

    public void setStatus(String status){
        this.status = new SimpleStringProperty(status);
    }
    public int getBarcode() {
        return this.barcode.get();
    }

    public void setBarcode(int barcode) {
        this.barcode = new SimpleIntegerProperty(barcode);
    }

    public String getType() {
        return this.type.get();
    }

    public void setType(String type) {
        this.type = new SimpleStringProperty(type);
    }

    public String getDescription() {
        return this.description.get();
    }

    public void setDescription(String description) {
        this.description = new SimpleStringProperty(description);
    }

    public String getBattery() {
        return this.battery.get();
    }

    public void setBattery(String battery) {
        this.battery = new SimpleStringProperty(battery);
    }

    public String getLicensePlate(){
        return licensePlate.get();
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = new SimpleStringProperty(licensePlate);
    }
}
