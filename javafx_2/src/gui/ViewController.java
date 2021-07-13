package gui;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class ViewController {
	 
	@FXML
	private Button btnTeste;
	
	@FXML
	public void onbtnTesteAction() {
		System.out.println("Click");
	}
}
