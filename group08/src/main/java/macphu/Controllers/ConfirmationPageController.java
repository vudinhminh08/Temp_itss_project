package macphu.Controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import macphu.App;
import macphu.Data.BikeSelection;
import macphu.Data.CardData;
import macphu.Data.CustomerData;
import macphu.Data.TransactionData;
import macphu.Models.CardModel;
import macphu.Models.CustomerModel;

public class ConfirmationPageController {

    @FXML
    private TextField cardExpirationDate;

    @FXML
    private TextField cardHolderName;

    @FXML
    private TextField cardIssuingBank;

    @FXML
    private TextField cardNumber;

    @FXML
    private TextField cardSecurityCode;

    @FXML
    private Button comfirmBtn;

    @FXML
    private TextField customerAddress;

    @FXML
    private TextField customerName;

    @FXML
    private TextField customerPhone;

    @FXML
    void confirmRent(ActionEvent event) throws IOException {
        if(customerName.getText().equals("")){
            System.out.print("Customer name is empty");
            return;
        }
        if(customerAddress.getText().equals("")){
            System.out.print("Customer address is empty");
            return;
        }
        if(customerPhone.getText().equals("")){
            System.out.print("Customer phone is empty");
            return;
        }
        if(cardNumber.getText().equals("")){
            System.out.print("Card number is empty");
            return;
        }
        if(cardIssuingBank.getText().equals("")){
            System.out.print("Issuing bank is empty");
            return;
        }
        if(cardHolderName.getText().equals("")){
            System.out.print("Card holder name is empty");
            return;
        }
        if(cardExpirationDate.getText().equals("")){
            System.out.print("Expiration date is empty");
            return;
        }
        if(cardSecurityCode.getText().equals("")){
            System.out.print("Security code is empty");
            return;
        }
        else{
            CustomerModel customer = new CustomerModel(customerName.getText(),customerAddress.getText(),customerPhone.getText());
            CustomerData.setCardData(customer);
            CardModel card = new CardModel(cardNumber.getText(),cardHolderName.getText(),cardIssuingBank.getText(),cardExpirationDate.getText(), cardSecurityCode.getText());
            CardData.setCardData(card);
            TransactionData.setTransactionData(BikeSelection.returnBikeInfor().getBarcode(), customerPhone.getText(), cardNumber.getText());
            
            App.setRoot("RentStatusPage");
        }
    }

}