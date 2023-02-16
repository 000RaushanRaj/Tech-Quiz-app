/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import techquizapp.dbutil.DBConnection1;
import techquizapp.pojo.Performance;

/**
 *
 * @author DELL
 */
public class PerformanceDAO {
    
    public  static void addPerformance(Performance p) throws SQLException
    {
        Connection conn=DBConnection1.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into performance Values(?,?,?,?,?,?,?)");
        ps.setString(1, p.getUserId());
        ps.setString(2, p.getExamId());
        ps.setInt(3, p.getRight());
        ps.setInt(4, p.getWrong());
        ps.setInt(5, p.getUnattempted());
        ps.setDouble(6, p.getPer());
        ps.setString(7, p.getLanguage());
        ps.executeUpdate();
    }
    
}
