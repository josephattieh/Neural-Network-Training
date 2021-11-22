package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws FileNotFoundException {
		Welcome w = new Welcome();
		Scene s1 = w.getScene();
		s1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		Settings1 set1 = new Settings1();
		stage.setScene(s1);
		w.getButton().pressedProperty().addListener(e->{
			Scene s2 = set1.getScene();
			s2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			stage.setScene(s2);
		});
		set1.getButton().pressedProperty().addListener(e->{
			//nbr of layers
			if(set1.spinner0.getValue()!=0)
			{
			int l =set1.spinner0.getValue();
			ArrayList<Integer> list = new ArrayList<>();
			for(Spinner<Integer> s :set1.list) {
				list.add(s.getValue());
			}
			
			
			//nbr of inputs
			int nbrInput = set1.spinner1.getValue();
			//Error
			int err;
			if(set1.radioButton.isSelected()) {
				//MDE
				err=0;
			}else if(set1.radioButton0.isSelected()) {
				err=1; //MAE
			}else {
				err=2;
			}
			//Thresshhold
			double threshold = set1.slider.getValue();

			//Nbr of Iterations
			int iteration = set1.spinner.getValue();
			
			ANN ann =new ANN(list, nbrInput,threshold,err, iteration);
			Design d=  new Design(ann, stage);
			Scene s3 = d.getScene();
			s3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			stage.setScene(d.getScene());
			}
		});
	
		stage.setTitle("ANN");
		stage.getIcons().add(new Image(getClass().getResource("nn.png").toExternalForm())); 

		stage.show();	
		stage.setResizable(false);

	}


	public static void main(String[] args) {
		launch(args);
	}
	
}
