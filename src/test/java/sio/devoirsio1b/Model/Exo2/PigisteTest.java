package sio.devoirsio1b.Model.Exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class PigisteTest {

    private Pigiste pigiste1;
    private Pigiste pigiste2;
    private Article article1;
    private Article article2;
    private Article article3;
    private Article article4;
    @BeforeEach
    void setUp()
    {
        pigiste1 = new Pigiste(1, "Fortin",1.76);
        pigiste2 = new Pigiste(2, "Garnier",1.24);
        article1 = new Article(1,LocalDate.of(2024,6,24),"Article n°1",3);
        article2 = new Article(2,LocalDate.of(2024,3,9),"Article n°2",1);
        article3 = new Article(3,LocalDate.of(2024,3,17),"Article n°3",2);
        article4 = new Article(4,LocalDate.of(2024,3,24),"Article n°4",4);
        pigiste1.ajouterArticle(article1);
        pigiste1.ajouterArticle(article2);
        pigiste1.ajouterArticle(article3);
        pigiste1.ajouterArticle(article4);
    }

    @Test
    void calculerCA()
    {
        // Cas n°1 : Pas d'article


        // Cas n°2 : 4 articles
        pigiste1.ajouterArticle(article1);
        pigiste1.ajouterArticle(article2);
        pigiste1.ajouterArticle(article3);
        pigiste1.ajouterArticle(article4);
        double expected = pigiste1.calculerCA();
        double actual = 7.04;

        assertEquals(expected,actual);

    }

    @Test
    void getNbArticles()
    {
        // Cas n°1 : pour le mois de mars
        pigiste1.ajouterArticle(article2);
        pigiste1.ajouterArticle(article3);
        pigiste1.ajouterArticle(article4);
        int expected = pigiste1.getNbArticles(3);
        int actual = 7 ;

        assertEquals(expected,actual);

        // Cas n°2 : pour le mois de septembre
        pigiste1.ajouterArticle(article1);
        expected = pigiste1.getNbArticles(9);
        actual = 8;
        assertEquals(expected,actual);


    }
}