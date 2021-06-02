package application;
	/**
	 * @author raind
	 * @date: 2021/06/02
	 * @description: Programme permettant d'ajouter deux nombres ensemble
	 *  
	 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Main extends Application {
	
	Pane pane = new Pane();
	Scene scene = new Scene(pane, 400,400);
	int nombre1;
	int nombre2;
	TextField input1 = new TextField();
	TextField input2 = new TextField();
	Label label1 = new Label();
	Label label2 = new Label();
	Label labelResultat = new Label();
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//bouton.prefHeightProperty().bind(pane.heightProperty().divide(2));
			
			
			pane.getChildren().add(input1);
			input1.prefWidthProperty().bind(pane.widthProperty().divide(4));
			input1.setLayoutX(100 - pane.getWidth() / 8);
			input1.setLayoutY(50);
			
			
			pane.getChildren().add(input2);
			input2.prefWidthProperty().bind(pane.widthProperty().divide(4));
			input2.setLayoutX(300 - pane.getWidth() / 8);
			input2.setLayoutY(50);
			
			
			label1.setText("");
			pane.getChildren().add(label1);
			label1.prefWidthProperty().bind(pane.widthProperty().divide(4));
			label1.setLayoutX(100 - pane.getWidth() / 8);
			label1.setLayoutY(100);
			
			
			label2.setText("");
			pane.getChildren().add(label2);
			label2.prefWidthProperty().bind(pane.widthProperty().divide(4));
			label2.setLayoutX(300 - pane.getWidth() / 8);
			label2.setLayoutY(100);
			
			
			labelResultat.setText("");
			pane.getChildren().add(labelResultat);
			labelResultat.prefWidthProperty().bind(pane.widthProperty().divide(4));
			labelResultat.setLayoutX(200 - pane.getWidth() / 8);
			labelResultat.setLayoutY(150);
			
			/**
			 * Listener pour écouter à des changements dans le bôite et faire des changements aux label
			 */
			input1.textProperty().addListener((observable, oldValue, newValue)->
			{
				try {
					nombre1 = Integer.parseInt(input1.getText());
					//int resultat = Integer.parseInt(input1.getText()) + Integer.parseInt(input2.getText());	
					label1.setText("" + nombre1);
					EssayezAfficherResultat(Integer.parseInt(input1.getText()), Integer.parseInt(input2.getText()));
				}
				catch(Exception e) {
					
				}
			});
			
			input2.textProperty().addListener((observable, oldValue, newValue)->
			{
				try {
					nombre2 = Integer.parseInt(input2.getText());
					//int resultat = Integer.parseInt(input1.getText()) + Integer.parseInt(input2.getText());	
					label2.setText("" + nombre2);
					EssayezAfficherResultat(Integer.parseInt(input1.getText()), Integer.parseInt(input2.getText()));
				}
				catch(Exception e) {
					
				}
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param num1: Premier numéro à additionner
	 * @param num2: Deuxième Numéto à additionner
	 */
	void EssayezAfficherResultat(int num1, int num2) {
		int resultat = num1 + num2;
		labelResultat.setText("" + resultat);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
