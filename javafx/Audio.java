package javafx;


import java.net.URL;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Audio extends Application {
	
	private GridPane gp = new GridPane();
	private URL resource = getClass().getResource("/Doaa.mp3");
	private Media media = new Media(resource.toString());
	private MediaPlayer player = new MediaPlayer(media);
	private MediaView mediaView = new MediaView(player);
	private Button playBtn = new Button("Play");
	private Button stopBtn = new Button("Stop");
		
	
	

	@Override
	public void start(Stage primaryStage) {
		
		// GridPane
		gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
				
        // play Button
        
        gp.setHalignment(playBtn,HPos.LEFT);
        gp.add(playBtn, 0, 0);
        playBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				
				player.play();
			}
        	
        	
		});
        
		// Stop Button
        gp.setHalignment(stopBtn, HPos.RIGHT);
        gp.add(stopBtn, 1, 0);
        stopBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				player.pause();
				
			}
		});
		
		gp.getChildren().add(mediaView);
		  Scene scene = new Scene(gp, 300, 200);
	        primaryStage.setTitle("Audio Palyer..");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
