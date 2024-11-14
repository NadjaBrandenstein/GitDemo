module dk.easv.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.gitdemo to javafx.fxml;
    exports dk.easv.gitdemo;
}