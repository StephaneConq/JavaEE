/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Stephane
 */
public class Jeu {
    private static int idJeu;
    private static String nomJeu;
    private static String imgJeu;
    
    public Jeu(int id, String nom, String img){
        this.idJeu = id;
        this.nomJeu = nom;
        this.imgJeu = img;
    }

    public static int getIdJeu() {
        return idJeu;
    }

    public static void setIdJeu(int idJeu) {
        Jeu.idJeu = idJeu;
    }

    public static String getNomJeu() {
        return nomJeu;
    }

    public static void setNomJeu(String nomJeu) {
        Jeu.nomJeu = nomJeu;
    }

    public static String getImgJeu() {
        return imgJeu;
    }

    public static void setImgJeu(String imgJeu) {
        Jeu.imgJeu = imgJeu;
    }
    
}
