import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.application.Platform;
import javafx.geometry.Pos;
import java.util.Random;

public class DessertGame extends Application {
	private int score = 0;
    @Override
    public void start(final Stage stage) {
        // Step 1 & 2
        BorderPane borderPane = new BorderPane();
        Scene scene = new Scene(borderPane, 640, 480);
        stage.setTitle("Dessert in the Desert JavaFX Game");
        
        // Step 3
        Label scoreLabel = new Label("Score: 0");
        borderPane.setTop(scoreLabel);
        BorderPane.setAlignment(scoreLabel, Pos.TOP_LEFT);

        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> {
            Platform.exit();
        });
        borderPane.setBottom(exitButton);
        BorderPane.setAlignment(exitButton, Pos.BOTTOM_RIGHT);
        
        // Step 4
        Pane pane = new Pane();
        borderPane.setCenter(pane);
        BorderPane.setAlignment(pane, Pos.CENTER);

        // TODO: Step 5-8
        Button button = new Button("Dessert");
        Button button2 = new Button("Desert");
        Button button3 = new Button("Desert");
        Button button4 = new Button("Desert");
        Button button5 = new Button("Desert");
        Button button6 = new Button("Desert");
        Button button7 = new Button("Desert");
        Button button8 = new Button("Desert");
        pane.getChildren().add(button);
        pane.getChildren().add(button2);
        pane.getChildren().add(button3);
        pane.getChildren().add(button4);
        pane.getChildren().add(button5);
        pane.getChildren().add(button6);
        pane.getChildren().add(button7);
        pane.getChildren().add(button8);
        Button[] arrayOfButtons = new Button[8];
        arrayOfButtons[0] = button;
        arrayOfButtons[1] = button2;
        arrayOfButtons[2] = button3;
        arrayOfButtons[3] = button4;
        arrayOfButtons[4] = button5;
        arrayOfButtons[5] = button6;
        arrayOfButtons[6] = button7;
        arrayOfButtons[7] = button8;
        Random randy = new Random();
        randomizeButtonPositions(randy, arrayOfButtons);
        button.setOnAction(e -> { score++;  randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        button2.setOnAction(e -> { score--; randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        button3.setOnAction(e -> { score--; randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        button4.setOnAction(e -> { score--; randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        button5.setOnAction(e -> { score--; randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        button6.setOnAction(e -> { score--; randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        button7.setOnAction(e -> { score--; randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        button8.setOnAction(e -> { score--; randomizeButtonPositions(randy, arrayOfButtons); exitButton.requestFocus(); scoreLabel.setText("Score: " + score);});
        
        stage.setScene(scene);
        stage.show();
    }

    private void randomizeButtonPositions(Random randomizer, Button[] arrayOfButtons){
    	for(int x = 0; x < 8; x++) {
    		int xPos = randomizer.nextInt(600);
    		int yPos = randomizer.nextInt(400);
    		arrayOfButtons[x].setLayoutX(xPos);
    		arrayOfButtons[x].setLayoutY(yPos);
    	}
    }
    
    public static void main(String[] args) {
        Application.launch();
    }
}
