module ch.ictbz.worttabelle.worttabelle {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.ictbz.worttabelle.worttabelle to javafx.fxml;
    exports ch.ictbz.worttabelle.worttabelle;
}