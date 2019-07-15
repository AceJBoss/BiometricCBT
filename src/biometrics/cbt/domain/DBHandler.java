/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometrics.cbt.domain;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHandler {

    static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    static String url = "";
    public static String dbDir = "";
    static Connection con;

    public static void createDatabase() {
        try {
            connect();
            PreparedStatement p = con.prepareStatement("create table student_reg("
                    + "id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY,"
                    + "name varchar(50) not null ,"
                    + "phone varchar(50) not null,"
                    + "email varchar(90) not null,"
                    + "address long varchar,"
                    + "username varchar(90),"
                    + "password varchar(90),"
                    + "face long varchar not null,"
                    + "finger long varchar not null)"
            );
            p.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
            }
        }
    }

    public static Connection connect() {
        try {
            String userHomeDir = System.getProperty("user.home", ".");
            dbDir = userHomeDir + "/.biocbt";
            File fileSystemDir = new File(dbDir);
            fileSystemDir.mkdirs();
            url = "jdbc:derby:" + fileSystemDir.getAbsolutePath() + File.separator + "biocbt;create=true";
            Class.forName(driver);
            con = DriverManager.getConnection(url, "biocbt", "biocbt");
            return con;
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void checkDatabase() {
        String userHomeDir = System.getProperty("user.home", ".");
        dbDir = userHomeDir + "/.biocbt";
        File fileSystemDir = new File(dbDir);
        if (!fileSystemDir.exists()) {
            createDatabase();
        }
    }

//    public static void main(String[] args) {
//        DBHandler.createDatabase();
//    }
}
