package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javafx.stage.FileChooser;

public class AppModel {
	private String defaultFileName = "MySRT.srt";
	private String openFilePath="";
	private String openFileName="";
	private String saveFilePath="";
	private String saveFileName="";
	
	public String SRTFileOpen(){
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Locate the SRT files");
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("SRT files (*.srt)", "*.srt");
		fileChooser.getExtensionFilters().add(extFilter);
		File file = fileChooser.showOpenDialog(null);
		if (file !=null){
		openFilePath = file.getAbsolutePath();
		openFileName = file.getName();}
		else{
		openFilePath ="";
		}
		return openFilePath;
	}
	
	public String getOpenFileName(){
		return openFileName;
	}
	public String getSaveFileName(){
		return saveFileName;
	}
	
	public String SRTFileSave(){
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Save the SRT files");
		fileChooser.setInitialFileName(defaultFileName);
		File savedFile = fileChooser.showSaveDialog(null);
		savedfileroutine(savedFile);
		saveFileName = savedFile.getName();
		saveFilePath = savedFile.getAbsolutePath();
		return saveFilePath;
	}
	
	private void savedfileroutine(File file) {
		try {
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			writer.write("This is a test srt file");
			writer.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}


}

