package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.utils.Alerts;
import gui.utils.Constrainer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{

	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	@FXML
	private Label labelResult;

	@FXML
	private Button btnSum;

	@FXML
	public void onbtnSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double number1 = Double.parseDouble(txtNumber1.getText());
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			labelResult.setText(String.format("%.2f", sum));			
		}
		catch(NumberFormatException e) {
			Alerts.showAlert("Error!", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constrainer.setTextFieldDouble(txtNumber1);
		Constrainer.setTextFieldDouble(txtNumber2);
		
	}
}
