package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HomePage {
    public TextField txtName;
    public TextArea txtFullText;
    public ImageView imgHart;

    public void initializer(){


        txtFullText.setVisible(false);

    }

    public void btnOkOnAction(ActionEvent actionEvent) {
        String id = txtName.getText();
        txtFullText.setText("Hi "+ id);
        txtName.clear();

        imgHart.setVisible(true);

        txtFullText.setEditable(false);
    }

    public void btnClearOnAction(ActionEvent actionEvent) {

        imgHart.setVisible(false);
        txtFullText.clear();


    }



}
