package beans;

import java.sql.*;

public class DBLien implements java.io.Serializable {

    private Statement lien = null;
    private boolean statusStatement;

    public Statement getLien(Connection cnx) {
        if (construireStatement(cnx)) {
            return lien;
        } else {
            return null;
        }
    }

    private boolean construireStatement(Connection cnx) {
        statusStatement = false;
        try {
            lien = cnx.createStatement();
            statusStatement = true;
        } catch (SQLException e) {
            statusStatement = false;
            System.out.println(e);
        }
        return statusStatement;
    }
}
