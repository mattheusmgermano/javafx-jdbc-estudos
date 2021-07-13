package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> comboBoxPerson;

	private ObservableList<Person> obsList;
	
	@FXML
	private Button btnShowAll;
	
	@FXML
	public void onComboBoxPerson() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}
	
	@FXML
	public void onBtnShowAllAction() {
		for(var person : comboBoxPerson.getItems()) {
			System.out.println(person);
		}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person(1, "Maria", "Maria@gmail.com"));
		personList.add(new Person(2, "Alex", "Alex@gmail.com"));
		personList.add(new Person(3, "Bob", "Bob@gmail.com"));

		obsList = FXCollections.observableArrayList(personList);

		comboBoxPerson.setItems(obsList);
		
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			 @Override
			 protected void updateItem(Person item, boolean empty) {
			 super.updateItem(item, empty);
			 setText(empty ? "" : item.getName());
			 }
			};
			comboBoxPerson.setCellFactory(factory);
			comboBoxPerson.setButtonCell(factory.call(null));
	}
	
}
