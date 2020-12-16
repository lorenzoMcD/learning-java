

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class McDaniel_OLA4 extends Application {

	public Label message;
	public Label totalAmntSpent;
	public Label totalAmntWon;
	public Label amntWon;
	public TextField text;
	public ImageView one;
	public ImageView two;
	public ImageView three;
	public ImageView four;
	public int score = 0;
	public int moneySpent = 0;
	

	
	
	@Override // override the start method
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();
		pane.setPrefSize(500, 400);
		
		
	

		// create label and add to pane
		Label label1 = new Label("Amount Inserted: $");
		label1.setLayoutX(100);
		label1.setLayoutY(200);
		pane.getChildren().add(label1);
		
		
		
		// create text field 
		text = new TextField();
		text.setLayoutX(220);
		text.setLayoutY(200);
		pane.getChildren().add(text);
		
		
		
		
		
		Label label2 = new Label("Amount Won This Spin: $ ");
		amntWon = new Label();
		amntWon.setText("0.00"); // set starting text to 0.00
		amntWon.setLayoutX(298);
		amntWon.setLayoutY(245);
		
		pane.getChildren().add(amntWon);
		
		
		
		
		
		
		
		Label label3 = new Label("    Total Amount Won: $");
		totalAmntWon = new Label();
		totalAmntWon.setText("0.00"); // set starting text to 0.00
		totalAmntWon.setLayoutX(290);
		totalAmntWon.setLayoutY(273);
		pane.getChildren().add(totalAmntWon);
		
		
		
		Label label4 = new Label("	So far you Spend");
		totalAmntSpent = new Label();
		totalAmntSpent.setText("0.00");
		totalAmntSpent.setLayoutX(280);
		totalAmntSpent.setLayoutY(300);
		
		pane.getChildren().add(totalAmntSpent);
		
		
		
		
		// create the button
		SpinHandlerClass handle1 = new SpinHandlerClass();
		// set button text 
		Button btSpin = new Button("Spin");
		btSpin.setOnAction(handle1);
		btSpin.setLayoutX(220);
		btSpin.setLayoutY(330);
		pane.getChildren().add(btSpin); // add to pane 
		
		
		
		message = new Label();
		message.setLayoutX(160);
		message.setLayoutY(370);
		pane.getChildren().add(message);
		
	
		
		
		// add items to vbox 
		VBox vbox = new VBox(10,label2,label3,label4); 
		vbox.setLayoutX(150);
		vbox.setLayoutY(245);
		pane.getChildren().add(vbox);
		
		
		
		
		one = new ImageView("file:image/13.png");
		two = new ImageView("file:image/13.png");
		three = new ImageView("file:image/13.png");
		four = new ImageView("file:image/13.png");
		
		one.setFitWidth(80);
		one.setFitHeight(100);
		
		two.setFitWidth(80);
		two.setFitHeight(100);
		
		three.setFitWidth(80);
		three.setFitHeight(100);
		
		four.setFitWidth(80);
		four.setFitHeight(100);
		
		
		
		
		
		
		HBox hbox = new HBox(10,one,two,three,four);
		
		hbox.setLayoutX(85);
		hbox.setLayoutY(95);
		
		pane.getChildren().add(hbox);
		
		

        // import images into file 
		// need to have 4 images show in imageview 
		
			
		// setup vbox to put the text labels and button 
 
		Scene scene = new Scene(pane);
		primaryStage.setTitle("McDaniel_OLA4");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	
	}
	
	public static void main(String[] args) {
			
		launch(args);
	}
	





class SpinHandlerClass implements EventHandler<ActionEvent>
{
	@Override
	public void handle(ActionEvent e) {
		
		
		if( text.getText().isEmpty())
		{
			
			message.setText("Error. Try a different amount.");
		}
		else
		{
			
			message.setText("");
			
		}
		
		
		// only run if the text box is not empty 
		if(!text.getText().isEmpty())
		{
		
			Random rand = new Random();
		
			int max = 25;
			int min = 1;
		
			// create random number values 
			int rand_int1 = rand.nextInt(max - min + 1) + min;
			int rand_int2 = rand.nextInt(max - min + 1) + min;
			int rand_int3 = rand.nextInt(max - min + 1) + min;
			int rand_int4 = rand.nextInt(max - min + 1) + min;
		
		
		
			// set the images to pull random number 
			one.setImage(new Image("file:image/" + rand_int1 +  ".png"));
			two.setImage(new Image("file:image/" + rand_int2 +  ".png"));
			three.setImage(new Image("file:image/" + rand_int3 +  ".png"));
			four.setImage(new Image("file:image/" + rand_int4 +  ".png"));
		

		
			totalAmntSpent.setText(text.getText() + ".00");
	
		
		// 2 items match 
			if (rand_int1 == rand_int2 && rand_int1!= rand_int3 && rand_int1!=rand_int4 ||
				rand_int1 == rand_int3 && rand_int1!= rand_int2 && rand_int1!= rand_int4 ||
				rand_int1 == rand_int4 && rand_int1!= rand_int2 && rand_int1!= rand_int3)
			{
				score += Integer.parseInt(text.getText()) * 2;
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 2))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
			
				message.setText("Sweet! Double WIN x2!!");
			}
		
		// 3 items match
		
			else if (rand_int1 == rand_int2 && rand_int1 == rand_int3)
			{
				score += Integer.parseInt(text.getText()) * 3;
			
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(Integer.parseInt(text.getText()) * 3)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 3)) + ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
				message.setText("Sweet! Triple WIN x3!!");
			}
		
		// 4 items match 
			else if (rand_int1 == rand_int2 && rand_int1 == rand_int3 && rand_int1 == rand_int4)
			{
			
				score += Integer.parseInt(text.getText()) * 4;
			
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 4))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");		
				message.setText("Jackpot! Quadruple WIN x 4!!");
			}
		

		// 2 items match 
			else if (rand_int2 == rand_int1 && rand_int2!= rand_int3 && rand_int2!=rand_int4 ||
				rand_int2 == rand_int3 && rand_int2!= rand_int1 && rand_int2!= rand_int4 ||
				rand_int2 == rand_int4 && rand_int2!= rand_int1 && rand_int2!= rand_int3
				)
			{
				score += Integer.parseInt(text.getText()) * 2;
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 2))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
				message.setText("Sweet! Double WIN x2!!");
			
			}
		
		// 3 items match
			else if  (rand_int2 == rand_int1 && rand_int2 == rand_int3 || 
				 rand_int2 == rand_int1 && rand_int2 == rand_int4 ||
				
				 rand_int2 == rand_int3 && rand_int2 == rand_int4)
			{
				score += Integer.parseInt(text.getText()) * 3;
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 3))+ ".00");
				
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
				message.setText("Sweet! Triple WIN x3!!");
			}
		
		// 4 items match 
			else if (rand_int2 == rand_int1 && rand_int2 == rand_int3 && rand_int2 == rand_int4)
			{
				score += Integer.parseInt(text.getText()) * 4;
			
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 4))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
			
				message.setText("Jackpot! Quadruple WIN x 4!!");
			
			
			}
		
		// 2 match
			else if (rand_int3 == rand_int1 && rand_int3!= rand_int2 && rand_int3!=rand_int4 ||
				rand_int3 == rand_int2 && rand_int3!= rand_int1 && rand_int3!= rand_int4 ||
				rand_int3 == rand_int4 && rand_int3!= rand_int1 && rand_int3!= rand_int2)
			{
				score += Integer.parseInt(text.getText()) * 2;
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 2))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
				message.setText("Sweet! Double WIN x2!!");

			}
		
		// 3 match 
			else if (rand_int3 == rand_int1 && rand_int3 == rand_int2 || 
				 rand_int3 == rand_int1 && rand_int3 == rand_int4 ||
				 rand_int3 == rand_int2 && rand_int3 == rand_int4)
			{
				score += Integer.parseInt(text.getText()) * 3;
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 3))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
				message.setText("Sweet! Triple WIN x3!!");
			
			
			}
		
		// 4 match
		
			else if (rand_int3 == rand_int1 && rand_int3 == rand_int2 && rand_int3 == rand_int4)
			{
			
				score += Integer.parseInt(text.getText()) * 4;
			
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 4))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
			
				message.setText("Jackpot! Quadruple WIN x 4!!");
			}
		
		
		// 2 match

			else if (rand_int4 == rand_int1 && rand_int4!= rand_int2 && rand_int4!=rand_int3 ||
				rand_int4 == rand_int2 && rand_int4!= rand_int1 && rand_int4!= rand_int3 ||
				rand_int4 == rand_int3 && rand_int4!= rand_int1 && rand_int4!= rand_int2)
			{
			
				score += Integer.parseInt(text.getText()) * 2;
				moneySpent+= Integer.parseInt(text.getText());
				
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 2))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
				message.setText("Sweet! Double WIN x2!!");
			
			
		}
		
		// 3 match
			else if (rand_int4 == rand_int1 && rand_int4 == rand_int2 || 
				 rand_int4 == rand_int1 && rand_int4 == rand_int3 ||
				 rand_int4 == rand_int2 && rand_int4== rand_int3)
			{
				score += Integer.parseInt(text.getText()) * 3;
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score));
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 3))+ ".00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
				message.setText("Sweet! Triple WIN x3!!");
				
			
			}
		
		// 4 match 
			else if (rand_int4 == rand_int1 && rand_int4 == rand_int2 && rand_int4 == rand_int3)
			{
			
			
				score += Integer.parseInt(text.getText()) * 4;
			
				moneySpent+= Integer.parseInt(text.getText());
			
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText((String.valueOf(Integer.parseInt(text.getText()) * 4))+ ".00");
				
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
			
				message.setText("Jackpot! Quadruple WIN x 4!!");
			
			}
		
		
			else
			{
			
				moneySpent+= Integer.parseInt(text.getText());
			
				totalAmntWon.setText(String.valueOf(score)+ ".00");
			
				amntWon.setText("0.00");
			
				totalAmntSpent.setText(String.valueOf(moneySpent)+ ".00");
			
				message.setText("No Luck. Play again!");
				message.setLayoutX(180);
			
			}
		

	}

	}

	}
}

