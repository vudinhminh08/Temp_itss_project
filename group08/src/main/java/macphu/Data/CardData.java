package macphu.Data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import macphu.Models.CardModel;
import macphu.Utils.DbUtils;

public class CardData {
    public static void setCardData(CardModel card){
        DbUtils connectJDBC = new DbUtils();
        Connection conn = connectJDBC.connect();
        String query = "INSERT INTO ecobike.card (card_number, card_holder, issuing_bank, expiration_date, security_code) VALUES ('"+card.getCardNumber()+"', '"+card.getCardHolderName()+"', '"+card.getCardIssuingBank()+"', '"+card.getCardExpirationDate()+"', '"+card.getCardSecurityCode()+"') ";

        Statement stm = null;

        try {
               stm = conn.createStatement();
               stm.execute(query);
           conn.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
    }
}