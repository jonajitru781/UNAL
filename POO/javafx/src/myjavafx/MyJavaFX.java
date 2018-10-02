package myjavafx;
import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyJavaFX extends Application{
    
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Scene scene = new Scene(getBorderPane(), 700, 400);
        primaryStage.setTitle("ShowBorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private Pane getvBox() throws FileNotFoundException{
        VBox vbox = new VBox (7.5);
        Button button = new Button("botoooon");
        Button button4 = new Button("ultimo");
        vbox.getChildren().add(button);
        vbox.getChildren().add(gethBox());
        vbox.getChildren().add(button4);
        
        return vbox;
    }
    
    private Pane gethBox() throws FileNotFoundException{
        Button button1 = new Button("Number 1");
        Button button2 = new Button("Number 2");
        FileInputStream input = new
        FileInputStream("emotion_face_panda.png");
        Image image = new Image(input);
        Label label3 = new Label("", new ImageView(image));
        HBox hbox = new HBox(7.5);
        hbox.getChildren().add(button1);
        hbox.getChildren().add(button2);
        hbox.getChildren().add(label3);
        return hbox;
    }
    
    private Pane getGridPane() throws FileNotFoundException{
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        FileInputStream input = new
        FileInputStream("emotion_face_panda.png");
        Image image = new Image(input);
        Label label3 = new Label("", new ImageView(image));
        pane.add(label3,2,0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1, 2, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2, 2, 1);
        Button btAdd = new Button("Add");
        pane.add(btAdd, 2, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
        return pane;
    }
    
    private Pane getBorderPane() throws FileNotFoundException{
        
        
        BorderPane root = new BorderPane();
        root.setTop( getMenu());
        root.setRight( getvBox());
        root.setBottom( gethBox());
        root.setLeft( new Button("Left"));
        root.setCenter( getGridPane());
        return root;
    }
    
    private MenuBar getMenu() throws FileNotFoundException{
        Menu menu = new Menu("Menu 1");
        MenuItem menuItem1 = new
        MenuItem("Item 1");
        MenuItem menuItem2 = new
        MenuItem("Item 2");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        Menu menu2 = new Menu("Menu 2");
        Menu menu3 = new Menu("Menu 3");
        Menu menu4 = new Menu("Menu 4");
        MenuItem menuitem13 = new MenuItem("item 13");
        MenuItem menuitem31 = new MenuItem("item 31");
        MenuItem menuitem41 = new MenuItem("item 41");
        menu3.getItems().add(menuitem13);
        menu3.getItems().add(menuitem31);
        menu3.getItems().add(menu4);
        menu4.getItems().add(menuitem41);
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        menuBar.getMenus().add(menu2);
        menuBar.getMenus().add(menu3);
        return menuBar;
    }
    
}
