package sio.devoirsio1b.Model.Exo2;

import java.time.LocalDate;
import java.util.Date;

public class Article
{
    private int idArticle;
    private String nomArticle;
    private LocalDate dateArticle;
    private int nbPages;

    public Article(int idArticle, LocalDate dateArticle, String nomArticle, int nbPages) {
        this.idArticle = idArticle;
        this.nomArticle = nomArticle;
        this.dateArticle = dateArticle;
        this.nbPages = nbPages;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public LocalDate getDateArticle() {
        return dateArticle;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setDateArticle(LocalDate dateArticle) {
        this.dateArticle = dateArticle;
    }
}
