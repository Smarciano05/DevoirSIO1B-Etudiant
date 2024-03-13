
package sio.devoirsio1b;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import sio.devoirsio1b.Model.Exo1.Projet;
import sio.devoirsio1b.Model.Exo1.ProjetMobile;
import sio.devoirsio1b.Model.Exo1.ProjetWeb;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {

    ArrayList<Projet> mesProjets;
    @FXML
    private TableView<Projet> tvProjets;
    @FXML
    private TableColumn<Projet , Integer> tcMontant;
    @FXML
    private TableColumn<Projet, String> tcDescription;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // Jeu d'essais à décommenter une fois les classes créées

        mesProjets = new ArrayList<>();

        Projet projet1 = new Projet(1,"Projet 1",10,45.18);
        Projet projet2 = new Projet(2,"Projet 2",5,33.00);
        ProjetWeb projetWeb1 = new ProjetWeb(3,"Site vitrine", 30, 50.0, 5, true);
        ProjetWeb projetWeb2 = new ProjetWeb(4,"Site du club", 60, 70.0, 10,false);
        ProjetMobile projetMobile1 =new ProjetMobile(5,"Application Android",4,50,7);
        ProjetMobile projetMobile2 =new ProjetMobile(6,"Application IOS",6,70,5);

        mesProjets.add(projet1);
        mesProjets.add(projet2);
        mesProjets.add(projetWeb1);
        mesProjets.add(projetWeb2);
        mesProjets.add(projetMobile1);
        mesProjets.add(projetMobile2);

        // A vous de jouer
        Collections.sort(mesProjets);

        tcDescription.setCellValueFactory(data ->
        {
            {
                SimpleStringProperty property = new SimpleStringProperty();
                property.setValue(data.getValue().getInfos());
                return property;

            }
        });
        tcMontant.setCellValueFactory(data ->
        {
            {
                SimpleIntegerProperty property = new SimpleIntegerProperty();
                property.setValue(data.getValue().calculerMontant());
                return property.asObject();

            }
        });

        tvProjets.setItems(FXCollections.observableArrayList(mesProjets));
    }
}