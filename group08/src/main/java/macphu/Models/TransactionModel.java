package macphu.Models;



public class TransactionModel {
    private int transactionId;
    private String customerPhone;
    private String cardNumber;
    private int time;
    private int cost;

    public TransactionModel() {
    }

    public TransactionModel(int transactionId, String customerPhone, String cardNumber, int time, int cost) {
        this.transactionId = transactionId;
        this.customerPhone = customerPhone;
        this.cardNumber = cardNumber;
        this.time = time;
        this.cost = cost;
    }

    public int getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
