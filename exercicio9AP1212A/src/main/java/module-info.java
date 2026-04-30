module com.mycompany.exercicio9ap1212a {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.exercicio9ap1212a to javafx.fxml;
    exports com.mycompany.exercicio9ap1212a;
}
