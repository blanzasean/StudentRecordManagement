module org.example.studentrecordmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.example.studentrecordmanagement to javafx.fxml;
    exports org.example.studentrecordmanagement;
}