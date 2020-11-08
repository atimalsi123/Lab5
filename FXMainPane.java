import org.w3c.dom.events.EventTarget;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button b1, b2, b3, b4, b5, b6;
	Label label;
	TextField textField;
	//  declare two HBoxes
	HBox boxOne, boxTwo;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataMang;

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		Button b1 = new Button("Hello");
		Button b2 = new Button("Howdy");
		Button b3 = new Button("Chinese");
		Button b4 = new Button("Clear");
		Button b5 = new Button("Exit");
		Button b6 = new Button("Nepali");
		Label label = new Label("Feedback");
		TextField textField = new TextField();
		HBox boxOne = new HBox();
		HBox boxTwo = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		DataManager dataMang = new DataManager();
		HBox.setMargin(b1,new Insets(10, 20, 20, 10));
		HBox.setMargin(b2,new Insets(10, 20, 20, 10));
		HBox.setMargin(b3,new Insets(10, 20, 20, 10));
		HBox.setMargin(b6,new Insets(10, 20, 20, 10));
		HBox.setMargin(b4,new Insets(10, 20, 20, 10));
		HBox.setMargin(b5,new Insets(10, 20, 20, 10));
		HBox.setMargin(label,new Insets(10, 20, 20, 10));
		boxOne.setAlignment(Pos.CENTER);
		boxTwo.setAlignment(Pos.CENTER); 
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		boxOne.getChildren().addAll(b1, b2, b3, b4, b5, b6);
		boxTwo.getChildren().addAll(label, textField);
		this.getChildren().addAll(boxOne, boxTwo);
		
		b1.setOnAction(new ButtonHandler());
		b2.setOnAction(new ButtonHandler());
		b3.setOnAction(new ButtonHandler());
		b4.setOnAction(new ButtonHandler());
		b5.setOnAction(new ButtonHandler());
		b6.setOnAction(new ButtonHandler());
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			
			if(event.getTarget() == b1){
				textField.setText(dataMang.getHello());
			}
			else if(event.getTarget() == b2){
				textField.setText(dataMang.getHowdy());
			}
			else if(event.getTarget() == b3){
				textField.setText(dataMang.getChinese());
			}
			else if(event.getTarget() == b6){
				textField.setText(dataMang.getNepali());
			}
			else if(event.getTarget() == b4){
				textField.setText("");
			}
			else if(event.getTarget() == b5) {
				Platform.exit();
				System.exit(0);
			}

			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
