package sio.devoirsio1b.Model.Exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class SocietePresseTest {

    private SocietePresse societePresse;
    private Pigiste pigiste1;
    private Pigiste pigiste2;
    private Article article1;
    private Article article2;
    private Article article3;
    private Article article4;
    private Article article5;
    private Article article6;

    @BeforeEach
    void setUp()
    {
        societePresse = new SocietePresse("ORT Presse");
        pigiste1 = new Pigiste(1, "Fortin",1.76);
        pigiste2 = new Pigiste(2, "Garnier",1.24);
        article1 = new Article(1, LocalDate.of(2024,6,24),"Article n°1",3);
        article2 = new Article(2,LocalDate.of(2024,3,9),"Article n°2",1);
        article3 = new Article(3,LocalDate.of(2024,3,17),"Article n°3",2);
        article4 = new Article(4,LocalDate.of(2024,3,24),"Article n°4",4);
        article5 = new Article(5,LocalDate.of(2024,1,12),"Article n°5",2);
        article6 = new Article(6,LocalDate.of(2024,6,27),"Article n°4",1);
        pigiste1.ajouterArticle(article1);
        pigiste1.ajouterArticle(article2);
        pigiste1.ajouterArticle(article3);
        pigiste2.ajouterArticle(article4);
        societePresse.ajouterPigiste(pigiste1);
        societePresse.ajouterPigiste(pigiste2);
    }

    @Test
    void calculerCA()
    {
        // Cas n°1 :
        societePresse.ajouterPigiste(pigiste1);
        double expected = pigiste1.calculerCA();
        double actual = 200;

        assertEquals(expected,actual);

        societePresse.ajouterPigiste(pigiste2);
        expected = pigiste2.calculerCA();
        actual = 300;

        assertEquals(expected,actual);



    }

    @Test
    void getBestPigiste()
    {
        // Cas n°1 : pigiste1
        pigiste1.ajouterArticle(article1);
        pigiste1.ajouterArticle(article2);
        pigiste1.ajouterArticle(article3);
        Pigiste expected = societePresse.getBestPigiste();
        // Pigiste actual = ;

        //assertEquals(expected, //actual);

        // Cas n°2 : des ex aequo : pigiste1 et pigiste2
        pigiste1.ajouterArticle(article1);
        pigiste2.ajouterArticle(article4);
        expected = societePresse.getBestPigiste();
        // Pigiste actual = ;

        //assertEquals(expected, //actual);

    }
}