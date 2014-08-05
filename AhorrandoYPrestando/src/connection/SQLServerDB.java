/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author william
 */
public class SQLServerDB {
    private final String URL= "jdbc:sqlserver://localhost:1433;databaseName=AhorrandoyPrestando;";
    private final String USER="GONDU";
    private final String PASS="12345";
    private CallableStatement cstmt;
    private Statement stmt;
    private Connection con =null;
    
    

    public SQLServerDB() {
    }
    
    public ResultSet executeQuery(String sql) throws SQLException{
        con = DriverManager.getConnection(URL,USER,PASS);
        cstmt =con.prepareCall(sql);
        ResultSet res = cstmt.executeQuery();
        
        return res;
        
    }
     public void execute(String sql) throws SQLException, ClassNotFoundException{
        con= DriverManager.getConnection(URL,USER,PASS);
        stmt =con.createStatement();
        stmt.execute(sql,Statement.RETURN_GENERATED_KEYS);
        
    }
     
     
    public void closeExecuteQuery() throws SQLException{
        cstmt.close();
        con.close();
        
    }
    
     public void closeExecute() throws SQLException{
        stmt.close();
        con.close();
        
    }
     
     public void callStatement(String sql) throws SQLException{
         con= DriverManager.getConnection(URL,USER,PASS);
         cstmt = con.prepareCall(sql);
         cstmt.execute();
         
         
     }
}
