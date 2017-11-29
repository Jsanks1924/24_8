package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Animation extends Application {
    private ArrayList list = new ArrayList();
    private DisplayList view = Displaylist();
    private Button searchbtn = new Button("Search");
    private Button inserthbtn = new Button("Insert");
    private Button deletebtn = new Button("Delete");
    private Button trimbtn = new Button("Trim to size");
    private TextField txtNumber = new TextField();
    private TextField indexTxt = new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox box = new HBox(5);
        box.setPadding(new Insets(15,0,0,0));
        box.getChildren().addAll(new Label("Enter Number:"),txtNumber, new Label("Enter index;"),
                indexTxt, searchbtn,inserthbtn,deletebtn,trimbtn);
        box.setAlignment(Pos.CENTER);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenterShape(view);
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
