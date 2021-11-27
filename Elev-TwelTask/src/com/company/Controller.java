package com.company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    private int one, two;
    private char symb;

    @FXML
    private TextField title;

    Stage mainWindow = (Stage) title.getScene().getWindow();

    @FXML
    private TextField title2;

    @FXML
    void btnPlus(ActionEvent event) {
        if (symb != '+') {
            symb = '+';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }

    @FXML
    void btnM(ActionEvent event) {
        if (symb != '-') {
            symb = '-';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }

    @FXML
    void btnMult(ActionEvent event) {
        if (symb != '*') {
            symb = '*';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }

    @FXML
    void btnD(ActionEvent event) {
        if (symb != '/') {
            symb = '/';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }


    @FXML
    void btnOnClicked(ActionEvent event) {
        two = Integer.parseInt(title.getText());
        switch (symb) {
            case '+':
                title2.setText(String.valueOf(one + two));
                break;
            case '-':
                title2.setText(String.valueOf(one - two));
                break;
            case '*':
                title2.setText(String.valueOf(one * two));
                break;
            case '/':
                if (two != 0) title2.setText(String.valueOf(one / two));
                break;
        }
    }
}