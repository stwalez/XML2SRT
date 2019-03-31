package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AnotherController {

@FXML
private TextField txt_E;

	
	
	public void doSomething(String abc){
		txt_E.setText(abc);	
		System.out.println("Not showing up");
	}
}
