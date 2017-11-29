package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.awt.*;

public class displayList extends Pane{
    private int startX=20;
    private int startY =20;
    private int boxW =30;
    private int boxH =20;

    public displayList(){
        this.setStyle("-fx-border-color: black");
    }
    protected void repaintMethod(){
        getChildren().clear();
        int x = startX + 5;
        int y = startY + 40;
        getChildren().add(new Text(startX + 110,startX,"size = " + listElement.size() +
                "and size is " + listElement.getCapacity()));

        if (listElement.size() == 0) {

            getChildren().add(new Text(startX,startY,"list is empty"));
        }
        else{
            getChildren().add( new Text(startX,startY,"list"));
            for(int idx =0; idx<listElement.size(); idx++){
                Rectangle rectangleObj = new Rectangle(x,y,boxW,boxH);
                rectangleObj.setFill(Color.WHITE);
                rectangleObj.setStroke(javafx.scene.paint.Color.BLACK);
                getChildren().add(rectangleObj);
                getChildren().add(new Text(x +10, y +15,listElement.get(idx)+ ""));
                x= x + boxW;

            }
        }

        for(int i = listElement.size(); i < listElement.getCapacity();i++){
            Rectangle rectangleObject = new Rectangle(x,y,boxW,boxH);
            rectangleObject.setFill(Color.WHITE);
            rectangleObject.setStroke(Color.BLACK);

            getChildren().add(rectangleObject);
            getChildren().add(new Line(x + boxW,y,y,+boxH));



        }
    }
}
