package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
	@FXML
	private Button fileb;
	@FXML
	private TextField textb;
    @FXML
    private TextField textb2;
    @FXML
    private Button fileb2;  
    @FXML
    private Label lab_opened;
    @FXML
    private Label lab_saved;
    @FXML
    private TextField txt_E;
    @FXML
    private Button btn_E;
    
	AppModel appM = new AppModel();
	
	public void openFile(){
		textb.setText(appM.SRTFileOpen());
		lab_opened.setText("Selected file: "+appM.getOpenFileName());
	}
	public void saveFile(){
		textb2.setText(appM.SRTFileSave());
		lab_saved.setText("Saved file as: "+appM.getSaveFileName());
	}
	
	public void doSomething(String abc){
		txt_E.setText("guess"+abc);
		//txt_E.setText(abc);
		System.out.println("Not showing up");
	}
	public void doButton(){
		//txt_E.setText("guess");
		Error err = new Error();
		err.ErrorLoging(this);
	}
	
}
