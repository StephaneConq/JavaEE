/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donnees;

import java.util.ArrayList;

/**
 *
 * @author Zonthem
 */
public class Panier {
    
    private int taillePanier;
    
    private ArrayList<String> contenu;
    
    public Panier() {
        contenu = new ArrayList<>();
        taillePanier = 0;
    }
    
    public void addToPanier(String elem) {
        contenu.add(elem);
        taillePanier ++;
    }
    
    /**
     * Supprimer element du panier
     * @param elem
     * @return true si la suppression s'est effectuee, false sinon
     */
    public boolean supprFromPanier(String elem) {
        for (int i = 0; i<contenu.size(); i++) {
            if (contenu.get(i).equals(elem)) {
                contenu.remove(i);
                taillePanier --;
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<String> getPanier() {
        return contenu;
    }
    
    public int getTaillePanier() {
        return taillePanier;
    }
    
    public void viderPanier() {
        contenu.clear();
        taillePanier = 0;
    }
    
    @Override
    public String toString() {
        StringBuilder retour;
        retour = new StringBuilder();
        for (String e : contenu) {
            retour.append("<br>" + e);
        }
        return retour.toString();
    }
}
