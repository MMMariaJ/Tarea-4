package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Formulario");
		GridPane grid=new GridPane();
		grid.setHgap(15);
		grid.setVgap(15);
		
		
		Label labela=new Label ("TextF");
		TextField texfield=new TextField();
		
		Label labelb =new Label ("Password :");
	    PasswordField password = new PasswordField();
		
		Label labec =new Label ("AreaText");
		TextArea texarea =new TextArea();
		
		CheckBox checkbox = new CheckBox ("Acepto terminos y condiciones");
		RadioButton radioBButton=new RadioButton ("Item 1");
		ToggleButton toggleButton = new ToggleButton ("Activar- Desactivar");
		Hyperlink hyperlink =new Hyperlink("Hiperlink");
		Button button =new Button ("Enviar");
		ProgressBar progressBar = new ProgressBar();
		ProgressIndicator progressIdicator = new ProgressIndicator();
		Slider slider =new Slider();
		
		grid.add(labela, 0, 0);
		grid.add(texfield, 1, 0);
		grid.add(labelb, 0, 1);
		grid.add(password, 1, 1);
		grid.add(labec, 0, 2);
		grid.add(texarea, 1, 2);
		grid.add(checkbox, 0, 3);
		grid.add(radioBButton, 1, 3);
		grid.add(toggleButton, 0, 4);
		grid.add(hyperlink, 1, 4);
		grid.add(button, 0, 5);
		grid.add(progressBar, 1, 5);
		grid.add(progressIdicator, 0, 6);
		grid.add(slider, 1, 6);
		
		Scene scene = new Scene(grid,500 ,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
