/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import techquizapp.dbutil.DBConnection1;
import techquizapp.pojo.User;

/**
 *
 * @author DELL
 */
public class UserDAO {
    public static boolean validateUser(User user)throws SQLException
    {
     
      
        Connection conn= DBConnection1.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select *from strecord where userid=? and password =? and usertype=?");
        ps.setString (1,user.getUserID());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
}
                


    
 