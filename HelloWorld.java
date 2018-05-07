import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{


        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("/fxml/StackPaneWindow.fxml"));
        StackPane stakcPane = loader.load();
        Scene scene =  new Scene(stakcPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Tetris game");
        primaryStage.show();

    }
}
