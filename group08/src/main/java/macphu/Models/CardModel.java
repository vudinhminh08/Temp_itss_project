package macphu.Models;

import javafx.beans.property.SimpleStringProperty;

public class CardModel {
    private SimpleStringProperty cardHolderName;
    private SimpleStringProperty cardNumber;
    private SimpleStringProperty cardIssuingBank;
    private SimpleStringProperty cardExpirationDate;
    private SimpleStringProperty cardSecurityCode;

    public CardModel() {
    }

    public CardModel(String cardNumber, String cardHolderName, String cardIssuingBank, String cardExpirationDate, String cardSecurityCode) {
        this.cardHolderName = new SimpleStringProperty(cardHolderName);
        this.cardNumber = new SimpleStringProperty(cardNumber);
        this.cardIssuingBank = new SimpleStringProperty(cardIssuingBank);
        this.cardExpirationDate = new SimpleStringProperty(cardExpirationDate);
        this.cardSecurityCode = new SimpleStringProperty(cardSecurityCode);
    }

    public String getCardHolderName() {
        return this.cardHolderName.get();
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = new SimpleStringProperty(cardHolderName);
    }

    public String getCardNumber() {
        return this.cardNumber.get();
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = new SimpleStringProperty(cardNumber);
    }

    public String getCardIssuingBank() {
        return this.cardIssuingBank.get();
    }

    public void setCardIssuingBank(String cardIssuingBank) {
        this.cardIssuingBank = new SimpleStringProperty(cardIssuingBank);
    }
    public String getCardExpirationDate() {
        return this.cardExpirationDate.get();
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = new SimpleStringProperty(cardExpirationDate);
    }

    public String getCardSecurityCode() {
        return this.cardSecurityCode.get();
    }

    public void setCardSecurityCode(String cardSecurityCode) {
        this.cardSecurityCode = new SimpleStringProperty(cardSecurityCode);
    }

    
}
