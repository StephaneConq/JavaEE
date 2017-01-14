/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Zonthem
 */
public class Compte {
    private String username;
    private boolean connecte;
    
    public Compte() {
        connecte = true;
    }

    public String getUsername() {
        return username;
    }

    public boolean isConnecte() {
        return connecte;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setConnecte(boolean connecte) {
        this.connecte = connecte;
    }

    
}
