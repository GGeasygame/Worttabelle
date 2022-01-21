package ch.ictbz.worttabelle.worttabelle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    private TextArea inputTextField;
    @FXML
    private TextArea outputTableTextField;

    public void onButtonCountWords() {
        WordTab wrdTb = new WordTab();
        Parser wrdCounter = new Parser(wrdTb);
        wrdCounter.parse(inputTextField.getText());
        outputTableTextField.setText(wrdTb.getTab());
    }
}