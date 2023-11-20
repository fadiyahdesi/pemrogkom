
import com.mysql.cj.jdbc.MysqlDataSource;
import com.sun.jdi.connect.spi.Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class koneksi {
   public static Connection Go(){
        try {
            
            MysqlDataSource m = new MysqlDataSource();
            m.setDatabaseName("challens");
            m.setUser("root"); 
            m.setPassword(""); 
            m.setServerName("localhost"); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            Connection k = (Connection) m.getConnection();
            System.out.println("Sukses!");
            
            return k;
        } catch (SQLException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        return k;
    
    
}
