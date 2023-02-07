package macphu.Controllers;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class TimePanelController implements Initializable {
    
    @FXML
    private Text cost;

    @FXML
    private AnchorPane timePanel;

    @FXML
    private Text timerCount;

    private boolean stop = true;
    private int deltaTime = 3000;
    private int costCount = 0;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        Thread timer = new Thread(){
            public void run() {
                
                try {
                    while (stop) {
                        
                        long hh = deltaTime / 3600 % 60;
                        long mm = deltaTime / 60 % 60;
                        long ss = deltaTime % 60;
                        if((deltaTime/60)<30){
                            costCount= 10000;
                        }
                        else{
                            costCount=10000 + (((deltaTime/60)-30)/15) * 3000;
                        }
                        cost.setText(costCount+"");
                        String format = "%1$s:%2$s:%3$s";
                        String strMS = String.format(format, hh, mm, ss);
                        timerCount.setText(strMS);
                        deltaTime++;
                        Thread.sleep(1000);
                }
                Thread.interrupted();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }   
        };
        timer.start();
    }
    public int Stop(){
        this.stop = false;
        return this.deltaTime;
    }
}
