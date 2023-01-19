import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AuthFormController {

    @FXML
    private Button btStart;

    @FXML
    private TextField fname;

    @FXML
    private Label lb1;

    @FXML
    private TextField lname;

    /**@FXML
    void btStartClick(ActionEvent event)  throws IOException {
        btStart.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("TestForm.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }*/

    @FXML
    void btStartClick() throws IOException{
        String name = fname.getText().trim();
        String pass = lname.getText().trim();
        try {
            loginuser(name, pass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //fname.setOnAction(actionEvent -> {

        //});
    }

    private void loginuser(String name, String pass) throws IOException {
        //DBHandler dbHandler = new DBHandler();
        //User user = new User(name, pass);

        if(!name.equals("") && !pass.equals("")) {
            btStart.getScene().getWindow().hide();
            Parent root = FXMLLoader.load(getClass().getResource("TestForm.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
            //================
            //btStart.getScene().getWindow().hide();

            //FXMLLoader loader = new FXMLLoader(getClass().getResource("test.fxml"));
            //Parent root = loader.load();
            
            //Stage stage = new Stage();

            //stage.setScene(new Scene(root, 800, 600));
            //stage.setTitle("Тестирование по Эл.без. УА и МО");
            ////stage.setResizable(false);
            //stage.show();

            //loginUser(name1, pass1);
            //dbHandler.regUser(user);
        }
        else
            lb1.setText("Заполните пустые поля");
    }
}
