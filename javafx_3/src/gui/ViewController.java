package gui;

import javafx.fxml.FXML;
import gui.utils.Alerts;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	 
	@FXML
	private Button btnTeste;
	
	@FXML
	public void onbtnTesteAction() {
		Alerts.showAlert("Alerta!", "31-19", "MEu DEUS", AlertType.WARNING);
	}
}
