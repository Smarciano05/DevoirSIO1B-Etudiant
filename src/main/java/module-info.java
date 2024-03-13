module sio.devoirsio1b {
    requires javafx.controls;
    requires javafx.fxml;

    opens sio.devoirsio1b.Model.Exo1;
    opens sio.devoirsio1b to javafx.fxml;
    exports sio.devoirsio1b;
}