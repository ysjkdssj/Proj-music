package Ui;

import javafx.event.Event;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.sound.midi.Soundbank;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javax.sound.sampled.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class SubController implements Initializable {
	static Clip clip;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		try {
			user_move();
		} catch (Exception e) {
			// TODO: handle exception

		}
	}

	public static void sound(String file) {
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
			clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void stop_sound() {
		clip.stop();
		clip.close();
	}

	@FXML
	private ImageView test01;

	public void user_move() {
		// 캐릭터
		test01.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				move(event, null);
				move1(event, null);
				move2(event, null);
				move3(event, null);
				move4(event, null);
				move5(event, null);
				move6(event, null);
				move7(event, null);
				move8(event, null);
				move9(event, null);
				

			}
		});
	}

	public void move(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.Q)) {
			sound("bbb/piano.wav");
		}

	}

	public void move1(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.W)) {
			sound("bbb/piano1.wav");
		}

	}

	public void move2(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.E)) {
			sound("bbb/piano2.wav");
		}

	}

	public void move3(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.R)) {
			sound("bbb/piano3.wav");
		}

	}

	public void move4(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.T)) {
			sound("bbb/piano4.wav");
		}

	}

	public void move5(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.Y)) {
			sound("bbb/piano5.wav");
		}

	}

	public void move6(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.U)) {
			sound("bbb/piano6.wav");
		}

	}

	public void move7(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.I)) {
			sound("bbb/piano7.wav");
		}

	}
	
	public void move8(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.O)) {
			sound("bbb/piano8.wav");
		}

	}
	
	public void move9(KeyEvent event, String pass) {
		KeyCode keyCode = event.getCode();
		if (keyCode.equals(keyCode.P)) {
			sound("bbb/piano9.wav");
		}

	}
	
	
	
	@FXML
	private Label back1;
	
	public void playout() {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("/more/home.fxml"));
			Scene scene = new Scene(login);
			Stage primaryStage = (Stage) back1.getScene().getWindow(); // 현재 윈도우 가져오기
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}