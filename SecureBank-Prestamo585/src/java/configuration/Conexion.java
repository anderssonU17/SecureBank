
package configuration;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection conexion;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBSecureBank?useSSL=false","root","enner1-2");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("La conexion no se puede establecer");
        }
    }
    
    public Connection getConnection(){
        return conexion;
    }
       
}
