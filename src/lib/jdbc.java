/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author raaz4
 */
public class jdbc {
    String HOST = "localhost";
    int PORT = 3306;
    String USER = "root";
    String PASSWORD ="";
    String DBNAME = "db_pcps";
    String DRIVER ="com.mysql.cj.jdbc.Driver";
    String URL ="jdbc:mysql://localhost:3306/db_pcps";
    
    public boolean connect(){
        boolean res = false;
        try{
            //load driver
            Class.forName(DRIVER);
            //try to communicte with database server
            Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
            res=true;
        }
        catch(Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }
        return res;
    }
}