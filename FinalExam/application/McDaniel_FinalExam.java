package application;




import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class McDaniel_FinalExam extends Application{

	
	public double sum;
	
	public ComboBox combobox1 = new ComboBox();
	public ComboBox combobox2 = new ComboBox();
	public ComboBox combobox3 = new ComboBox();
	
	
	
	@Override // override the start method
	public void start(Stage primaryStage) {
		
	
		
		
		
		// create the pane 
		Pane pane = new Pane();
		pane.setPrefSize(600, 600);
		
		
		
		
		// beverage combo box 1 
		combobox1.getItems().add("Soda $1.95");
		combobox1.getItems().add("Tea $1.50");
		combobox1.getItems().add("Coffee $1.25");
		combobox1.getItems().add("Mineral Water $2.95");
		combobox1.getItems().add("Juice $2.50");
		combobox1.getItems().add("Milk $1.50");
		
		combobox1.setLayoutX(200); // used to set the actual position of the combobox 
		combobox1.setLayoutY(220);
		pane.getChildren().add(combobox1);
		
		
		
		// appetizer combo box 2 
		combobox2.getItems().add("Buffalo Wings $5.95");
		combobox2.getItems().add("Buffalo Fingers $8.95");
		combobox2.getItems().add("Potato Skins $8.95");
		combobox2.getItems().add("Nachos $8.95");
		combobox2.getItems().add("Mushroom Caps $10.95");
		combobox2.getItems().add("Shrimp Cocktail $12.95");
		combobox2.getItems().add("Chips amd Salsa $6.95");
		
		pane.getChildren().add(combobox2);
				
		combobox2.setLayoutX(200); // used to set the actual position of the combobox 
		combobox2.setLayoutY(250);
		
		// main course combo box 3 
		combobox3.getItems().add("Seafood Alfredo $15.95");
		combobox3.getItems().add("Chicken Alfredo $13.95");
		combobox3.getItems().add("Chicken Picatta $13.95");
		combobox3.getItems().add("Turkey Club $11.95");
		combobox3.getItems().add("Lobster Pie $19.95");
		combobox3.getItems().add("Prime Rib $20.95");
		combobox3.getItems().add("Shrimp Scampi $18.95");
		combobox3.getItems().add("Turkey Dinner  $13.95");
		combobox3.getItems().add("Stuffed Chicken $13.95");
		
		pane.getChildren().add(combobox3);
		
		combobox3.setLayoutX(200); // used to set the actual position of the combobox 
		combobox3.setLayoutY(280);
		

		Label message1 = new Label("Select Beverage");
		message1.setText("Select Beverage");
		message1.setLayoutX(80);
		message1.setLayoutY(220);
		
		Label message2 = new Label();
		message2.setText("Select Appetizer");
		message2.setLayoutX(80);
		message2.setLayoutY(250);
		
		Label message3 = new Label("Select Main Course");
		message3.setText("Select Main Course");
		message3.setLayoutX(80);
		message3.setLayoutY(280);
		
		
		
		
		
		Label message4 = new Label();
		message4.setText("Tax: ");
		message4.setLayoutX(80);
		message4.setLayoutY(340);
		
		
		
		Label message5 = new Label();
		message5.setText("Tip: ");
		message5.setLayoutX(80);
		message5.setLayoutY(360);
		
		
		
		
		Label message6 = new Label();
		message6.setText("Total: ");
		message6.setLayoutX(80);
		message6.setLayoutY(390);
		
		
		Label taxlabel = new Label();
		taxlabel.setText("");
		taxlabel.setLayoutX(200);
		taxlabel.setLayoutY(340);
		
		Label tiplabel = new Label();
		tiplabel.setText("");
		tiplabel.setLayoutX(200);
		tiplabel.setLayoutY(360);
		
		Label totallabel = new Label();
		totallabel.setText("");
		totallabel.setLayoutX(200);
		totallabel.setLayoutY(390);

		
		pane.getChildren().add(message1);
		pane.getChildren().add(message2);
		pane.getChildren().add(message3);
		pane.getChildren().add(message4);
		pane.getChildren().add(message5);
		pane.getChildren().add(message6);
		pane.getChildren().add(taxlabel);
		pane.getChildren().add(tiplabel);
		pane.getChildren().add(totallabel);
		
		
		// tax and tip var 
		double tax = 0.7;
		double tip = 0.15;
		
		
	
		
		
		
		
		
		   // action event for pressing the button 
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) 
			{ 
				
				double tax = 0.7;
				double tip = 0.15;
				
				
				double sum = 0;
				
			//  choose values from combo box and add all the numbers up 
				
				
			String a = (String) combobox1.getValue();
			String b = (String) combobox2.getValue();
			String c = (String) combobox3.getValue();
			
			
			
			
			if (a.length() == 0 && b.length()== 0 && c.length()== 0)
			{
				
				
				
			}
			else
			{
				
				String app = a.substring(a.length() - 4);
				double value1 = Double.parseDouble(app);
				
			
			
			String bev = "";
	
			if (b.contains("Mushroom Caps") || b.contains("Shrimp Cocktail"))
			{
	
				
				
				bev = b.substring(b.length() - 5);
				
			}
			
			else
			{
				
				bev = b.substring(b.length() - 4);
				double value2 = Double.parseDouble(bev);
				
				
				
			}
			
			
			double value2 = Double.parseDouble(bev);
			
				
			String main = c.substring(c.length() - 5);
			double value3 = Double.parseDouble(main);
			
				
			
			
			sum = value1 + value2 + value3;
			
			
			tax = 0.7 * sum;
			
			tip = 0.15 * sum;
			
			double total = sum + tax + tip;
			
				
			taxlabel.setText(String.valueOf(tax));
			tiplabel.setText(String.valueOf(tip));
			totallabel.setText(String.valueOf(total));
			
				
			
			}
				
			} 
		};
		
		
		
		
		
		// need button to start the calculations 
		Button bttn = new Button("Calculate Cost");
		bttn.setOnAction(event); 
		
		bttn.setLayoutX(200);
		bttn.setLayoutY(310);
		
		pane.getChildren().add(bttn);
		
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("McDaniel_Final");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	
	}
	
	public static void main(String[] args) {
			
		launch(args);
	}
	
	
	
	
}
