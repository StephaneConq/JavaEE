package beans;

import com.mysql.jdbc.exceptions.MySQLDataException;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnexion implements java.io.Serializable {

    private String login;
    private String password;
    private String hostname;
    private String port;
    private String base;
    private Connection cnx;
    private MysqlDataSource mds;

    public void setLogin(String valeur) {
        login = valeur;
    }

    public void setPassword(String valeur) {
        password = valeur;
    }

    public void setHostname(String valeur) {
        hostname = valeur;
    }

    public void setPort(String valeur) {
        port = valeur;
    }

    public void setBase(String valeur) {
        base = valeur;
    }

    public Connection getConnection() {
        if (cnx == null) 
            this.connecter();
        return cnx;
    }
    
    public Connection getConnection(String l, String pass, String port, String host, String bd) {
        this.login = l;
        this.password = pass;
        this.port = port;
        this.hostname = host;
        this.base = bd;
        if (cnx == null) 
            this.connecter();
        return cnx;
    }

    private String construireUrlJdbc() {
        String urlJdbc;
        urlJdbc = "jdbc:mysql://" + hostname + ":" + port
                + "/" + base;
        urlJdbc = urlJdbc
                + "?user=" + login + "&password=" + password;
        return urlJdbc;
    }

    private boolean etablirConnexion() {
        /**
         * DEPRECATED par moi même
         */
        boolean statusConnexion = false;
        String urlJdbc;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //urlJdbc=construireUrlJdbc();

            cnx = DriverManager.getConnection("jdbc:mysql://localhost:8081/web_app", "root", "");
            // cnx=DriverManager.getConnection("jdbc:mysql://iutdoua-web.univ-lyon1.fr/p1500700","p1500700","239393"); 
            statusConnexion = true;
        } catch (Exception e) {
            statusConnexion = false;
            System.out.println(e);
        }
        return statusConnexion;
    }

    private void connecter() {
        mds = new MysqlDataSource();
        mds.setPortNumber(Integer.parseInt(port));
        mds.setUser(login);
        mds.setPassword(password);
        mds.setServerName(hostname);
        mds.setDatabaseName(base);
        try {
            cnx = mds.getConnection();
            System.out.println("Connexion réussie à la BD MySQL");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la BD MySQL");
            Logger.getLogger(DBConnexion.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
