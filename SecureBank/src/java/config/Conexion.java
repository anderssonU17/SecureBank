<<<<<<< HEAD

=======
>>>>>>> esalazar-2021585
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conexion; 
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBSecureBank?useSSL=false", "root", "andersson2004");
=======
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBSecureBank?useSSL=false","root","andersson2004");
>>>>>>> esalazar-2021585
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo establecer la conexion");
        }
<<<<<<< HEAD
        return conexion; 
    }
=======
        return conexion;
    }      
>>>>>>> esalazar-2021585
}
