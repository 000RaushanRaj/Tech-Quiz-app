/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DBConnection1{
    private static Connection conn;
   static
           {
             try
               {
                   Class.forName("oracle.jdbc.OracleDriver");
                   conn=DriverManager.getConnection("jdbc:oracle:thin:@//Raushan:1521/XE", "Onlineexam","Student");
  
                   JOptionPane.showMessageDialog(null," DB Connected Successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
  
  
                }
         catch(Exception x)
                      {
                        JOptionPane.showMessageDialog(null,"Connot connect to the DB","Error",JOptionPane.ERROR_MESSAGE);
                        x.printStackTrace();
                        System.exit(1);
                    }
           }
  
     public static Connection getConnection()
     {
         return conn;
     }
     public static void closeConnection() 
     {
         if(conn!=null)
         {
         try
         {
         conn.close();
         JOptionPane.showMessageDialog(null," DB Disconnected Successfully","Successfully",JOptionPane.INFORMATION_MESSAGE);
         }
         catch(SQLException x)
     {
               JOptionPane.showMessageDialog(null,"Connot disconnect to the DB","Error",JOptionPane.ERROR_MESSAGE);
              x.printStackTrace();
    
     }
    }
 }    

}
    

