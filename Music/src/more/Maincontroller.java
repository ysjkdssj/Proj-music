package more;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Maincontroller {
	
	
	
	@FXML
	private Label go1;
	
	public void play() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/Ui/Drum.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) go1.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label go2;
	
	public void play1() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("SheetMusic.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) go2.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label back2;
	
	public void playout2() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("home.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) back2.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label go3;
	
	public void play2() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("Musical.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) go3.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label back3;
	
	public void playout3() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("SheetMusic.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) back3.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label go4;
	
	public void play3() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("song.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) go4.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label back4;
	
	public void playout4() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("Musical.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) back4.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label go5;
	
	public void play4() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("use.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) go5.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private Label back5;
	
	public void playout5() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("home.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) back5.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
