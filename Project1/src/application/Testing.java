package application;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class Testing  {

    protected final ScrollPane scrollPane;
    protected final AnchorPane anchorPane;

    protected final ScrollPane scrollPane0;
    protected AnchorPane anchorPane0;
    protected final Button button;
    
    protected final Label label;
    protected final Label label0;
    protected final Label label1;

    
Scene scene;
    public Testing(ANN ann) {
    	label= new Label();
    	label0= new Label();
    	label1= new Label();

        scrollPane = new ScrollPane();
        anchorPane = new AnchorPane();
        scrollPane0 = new ScrollPane();
        anchorPane0 = new AnchorPane();
        button = new Button();
        AnchorPane ap = new AnchorPane();
        ap.setPrefHeight(400.0);
        ap.setPrefWidth(600.0);

        label.setLayoutX(56.0);
        label.setLayoutY(67.0);
        label.setText("Testing");
        label.setFont(new Font(20.0));

        scrollPane.setLayoutX(56.0);
        scrollPane.setLayoutY(140.0);
        scrollPane.setPrefHeight(200.0);
        scrollPane.setPrefWidth(200.0);

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);
        scrollPane.setContent(anchorPane);

        label0.setLayoutX(56.0);
        label0.setLayoutY(119.0);
        label0.setText("Enter the inputs:");

        label1.setLayoutX(350.0);
        label1.setLayoutY(120.0);
        label1.setText("Outputs:");

        scrollPane0.setLayoutX(346.0);
        scrollPane0.setLayoutY(140.0);
        scrollPane0.setPrefHeight(200.0);
        scrollPane0.setPrefWidth(200.0);
        ArrayList<TextField> list = new ArrayList<>();
        for(int j=0; j<ann.input;j++) {
        	Text tx = new Text();
    		tx.setText("Input#"+(j+1));
    		tx.setLayoutX(10);
    		tx.setLayoutY(30*j+10);
    		TextField t = new TextField();
    	     t.setPrefHeight(20.0);
    	     t.setPrefWidth(70.0);
    		t.setLayoutX(60);
    		t.setLayoutY(30*j);
    	
        	anchorPane.getChildren().add(t);
        	anchorPane.getChildren().add(tx);
        	list.add(t);
        }
    		
    		
        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);
        scrollPane0.setContent(anchorPane0);

        button.setLayoutX(282.0);
        button.setLayoutY(215.0);
        button.setMnemonicParsing(false);
        button.setText("Test");

        button.setOnAction(e->{
            
        	anchorPane0.getChildren().clear();
        	ArrayList<Double> al = new ArrayList<>();
       	
        try {
        	for(int i=0; i<list.size();i++)
        		al.add(Double.parseDouble(list.get(i).getText()));
        }catch(Exception ss) {
        	
        }
        ArrayList<Double> out =ann.getOutput(al);
        if(out !=null) {
        for(int k=0; k<out.size();k++) {
        	Text tx = new Text();
    		tx.setText("Output#"+(k+1));
    		tx.setLayoutX(10);
    		tx.setLayoutY(30*k+10);
    		Text t = new Text();
    	     t.setText(out.get(k)+"");
    		t.setLayoutX(80);
    		t.setLayoutY(30*k+10);
    		
        	anchorPane0.getChildren().add(t);
        	anchorPane0.getChildren().add(tx);
        }}
        });
        ap.getChildren().add(label);
        ap.getChildren().add(scrollPane);
        ap.getChildren().add(label0);
        ap.getChildren().add(label1);
        ap.getChildren().add(scrollPane0);
        ap.getChildren().add(button);
        scene = new Scene(ap);

    }
    public Scene getScene() {
    	return scene;
    }
}
