package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

public class Controller {

    @FXML
    private RadioButton radiobutton1; //chickentikka
    @FXML
    private RadioButton radiobutton2; //tunamayo
    @FXML
    private RadioButton radiobutton3; //cheeseonion
    @FXML
    private CheckBox checkbox1;       //pickles
    @FXML
    private CheckBox checkbox2;       //lettuce
    @FXML
    private CheckBox checkbox3;       //onion


    //no need for initialize cuz we're not really putting values or anything


    public void buttonClicked(ActionEvent event){

        double price = 0;
        String orderdetails = "";

        if(radiobutton1.isSelected()){
            price += 2.20;
            orderdetails += "Chicken Tikka";
        }
        else if(radiobutton2.isSelected()){
            price += 1.20;
            orderdetails += "Tuna & Mayo";
        }
        else if(radiobutton3.isSelected()){
            price += 1.20;
            orderdetails += "Cheese & Onion";
        }

        if(checkbox1.isSelected()){
            price += 0.20;
            orderdetails += " with Pickles ";
        }
        if(checkbox2.isSelected()){
            price += 0.20;
            orderdetails += " with Lettuce ";
        }
        if(checkbox3.isSelected()){
            price += 0.20;
            orderdetails += " with Onion ";
        }

        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Information");
        a.setHeaderText("Order details" + orderdetails);
        a.setContentText(Double.toString(price));
        a.show();

    }


}
