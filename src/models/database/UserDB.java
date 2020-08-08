
package models.database;

import java.sql.ResultSet;
import lib.ConnectionDB;
import models.User;

/**
 *
 * @author Gustavo
 */
public class UserDB {
    
    private ConnectionDB con;
    
    /**
     * Constructor.
     */
    public UserDB(){}
    
    /**
     * Método para comprobar si el usuario que desea ingresar al sistema se 
     * encuentra registrado.
     * @param email correo electrónico del usuario.
     * @param pass contraseña del usuario.
     * @return variable booleana.
     */
    public boolean signer(String email, String pass){
        
        try{
            
            // Se instancia la clase para la conexión con la BD y se establece la conexión.
            con = new ConnectionDB();
            con.connect();
          
            // Se descrie la sentencia SQL.
            String SQL =    "SELECT * FROM \"user\" WHERE \"email\" = '"
                            + email + "' AND \"password\" = '" + pass + 
                            "' AND \"state\" = 'A';";
            
            // Se realiza la consulta y se obtiene el resultado.
            java.sql.ResultSet rs = con.queryConsultar(SQL);
            
            // Se desconecta la BD.
            con.disconnect();
            
            // Si se obtuvo un resultado (que tiene que ser único) retorna 'true'.
            return rs.next();
            
            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar el usuario. Error: " + ex);
        }
        
        // De no encontrarse ningún resultado, retorna 'false'.
        return false;
        
    }
    
    /**
     * Método para comprobar la existencia de un usuario.
     * @param email correo electrónico del usuario.
     * @return variable booleana.
     */
    public boolean signer(String email){
        
        try{
            
            // Se instancia la clase de conexión con BD y se establece una conexión.
            con = new ConnectionDB();
            con.connect();
          
            // Se declara una sentencia SQL.
            String SQL =    "SELECT * FROM \"user\" WHERE \"email\" = '"
                            + email + "' AND \"state\" = 'A';";
            
            // Se realiza la consulta y se obtiene el resultado.
            java.sql.ResultSet rs = con.queryConsultar(SQL);
            
            // Se desconecta la BD.
            con.disconnect();
            
            // Si el usuario existe (que debe ser único) retorna 'true'.
            return rs.next();
            
            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar el usuario. Error: " + ex);
        }
        
        // Si el usuario no existe, retorna 'false'.
        return false;
        
    }
  
    public boolean userExist(String email, char estatus){
        
        try{
            
            // Se instancia la clase de conexión con BD y se establece una conexión.
            con = new ConnectionDB();
            con.connect();
          
            // Se declara una sentencia SQL.
            String SQL =    "SELECT * FROM \"user\" WHERE \"email\" = '"
                            + email + "' AND \"state\" = '" + estatus + "';";
            
            // Se realiza la consulta y se obtiene el resultado.
            java.sql.ResultSet rs = con.queryConsultar(SQL);
            
            // Se desconecta la BD.
            con.disconnect();
            
            // Si el cliente existe (que debe ser único) retorna 'true'.
            return rs.next();
            
            
        } catch (java.sql.SQLException ex){
            System.out.println("No se pudo encontrar al usuario. Error: " + ex);
        }
        
        // Si el usuario no existe, retorna 'false'.
        return false;
        
    }
    
    /**
     * Método para actualizar la contraseña de un usuario.
     * @param email correo electrónico del usuario.
     * @param pass nueva contraseña
     */
    public void insertNewPass(String email, String pass){
       
        // Se instancia la clase de conexión de la BD y se establece conexión.
        con = new ConnectionDB();
        con.connect();
          
        // Se declara la sentencia SQL.
        String SQL =    "UPDATE \"user\" SET \"password\" = '" + pass + 
                        "' WHERE \"email\" = '" + email + "';";
            
        // Se realiza la actualización.
        con.queryInsert(SQL);
            
        // Se desconecta la BD.
        con.disconnect();
                 
    }
    
    /**
     * Método para obtener los datos de acceso del usuario que ingresa al sistema.
     * @param email Correo Electrónico del usuario que está accediendo al sistema.
     * @return Devuelve consulta.
     */
    public ResultSet getDataAccess(String email){
        
        // Se instancia la variable para la consulta.
        ResultSet result;
        
        // Se declara e inicializa la sentencia SQL
        String SQL  = "SELECT empleado.\"nombre\" as \"NombreEmpleado\", "
                    + "\"apellido\" as \"ApellidoEmpleado\", rol.\"codigo\" as \"CodigoRol\", "
                    + "sucursal.\"nombre\" as \"NombreSucursal\" FROM \"rol\", \"empleado\", "
                    + "\"usuario\", \"sucursal\" WHERE rol.\"codigo\" = \"rol_codigo\" AND "
                    + "\"empleado_cedula\" = \"cedula\" AND \"sucursal_codigo\" = sucursal.\"codigo\" "
                    + "AND usuario.\"correo\" = '" + email + "' AND usuario.\"estado\" = 'A' AND "
                    + "rol.\"estado\" = 'A' AND empleado.\"estado\" = 'A' AND sucursal.\"estado\" = 'A';";
        
        // Se instancia y se establece una conexión con la BD.
        con = new ConnectionDB();
        con.conectar();
        
        // Se realiza y se recibe la consulta.
        result = con.queryConsultar(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.desconectar();
        
        // Retorna consulta.
        return result;
        
    }
    
    /**
     * Método para obtener los datos de una sala.
     * @return Devuelve consulta.
     */
    public ResultSet readUserData(String email){
        
        // Se declara una variable de tipo 'ResultSet' para realizar la consulta.
        ResultSet result;
        
        // Se define la sentencia SQL a aplicar en la BD.
        String SQL = "SELECT usuario.\"correo\", empleado.\"nombre\" as \"Nombre\", "
                   + "empleado.\"apellido\" as \"Apellido\", rol.\"nombre\" as \"rol\", "
                   + "usuario.\"clave\" FROM \"usuario\", \"empleado\", \"rol\" "
                   + "WHERE usuario.\"correo\" = '" + email + "' and \"empleado_cedula\" = empleado.\"cedula\" "
                   + "and \"rol_codigo\" = rol.\"codigo\" and usuario.\"estado\" = 'A' "
                   + "and empleado.\"estado\" = 'A' and rol.\"estado\" = 'A';";
        
        // Se instancia y se establece una conexión con la BD.
        con = new ConnectionDB();
        con.connect();
        
        // Se realiza y se recibe la consulta.
        result = con.queryConsultar(SQL);
        
        System.out.println("La consulta se realizó con éxito.");
        
        // Se desconecta la BD.
        con.desconectar();
        
        // Retorna consulta.
        return result;
        
    }
    
    /**
     * Método para registrar en la base de datos un nuevo usuario.
     * @param user Clase Usuario.
     */
    public void registerUser(User user) {
            
        // Se instancia la clase para la conexiÃ³n con la BD y se establece la conexiÃ³n.
        con = new ConnectionDB();
        con.connect();
          
        // Se desclara la sentencia SQL.
        String SQL = "INSERT INTO \"user\" (\"id\", \"email\", "
                    + "\"password\", \"type\", \"firstSession\", \"lastSession\", "
                    + "\"rememberData\", \"state\") "
                    + "VALUES ("
                    + "'" + user.getId() + "', "
                    + "'" + user.getEmail() + "', "
                    + "'" + user.getPassword() + "', "
                    + "'" + user.getType() + "', "
                    + "'" + user.getFirstSession() + "', "
                    + "'" + user.getLastSession() + "', "
                    + "'" + user.getRememberData() + "', "
                    + "'" + user.getState() + "'"
                    + ");";
    
        // Se insertan los datos en la BD.
        con.queryInsert(SQL);
        
        // Se muestra el mensaje de éxito.
        System.out.println("El usuario del correo \"" + user.getEmail() + "\" se"
                + " ha registrado con éxito.");
     
        // Se desconecta la BD.
        con.disconnect();
        
    }
   
    public void updateUser(User user, String email) {
         
        // Se instancia la clase para la conexion con la BD y se establece la conexion.
        con = new ConnectionDB();
        con.connect(); 

        // Se descrie la sentencia SQL.
        String SQL = "UPDATE \"user\" SET \"empleado_cedula\" = "
                    + "'" + us.getEmployee_id() + "', "
                    +  "\"rol_codigo\" = '" + us.getRole_id() + "', "
                    +  "\"clave\" = '" + us.getPass() + "', "
                    +  " WHERE \"correo\" = '" + us.getEmail() + "';";
            
        con.queryInsert(SQL);
            
        // Se desconecta la BD.
        con.disconnect();
            
    }
         
    /**
     * Método para cambiar el estado de un usuario.
     * @param email Correo del usuario a eliminar.
     * @param type Si el cambio es a un estado 'Activo' o estado 'Inactivo'.
     */
    public void changeStateUser(String email, int type) {
        
        // Se declara la variable de sentencia SQL.
        String SQL = "";
        
        // Dependiendo del valor de type, se elimina (lógica) o se reactiva el empleado.
        if(type == 0)
            SQL     = "UPDATE \"user\" SET \"state\" = 'I' "
                    + "WHERE \"email\" = '" + email + "';";
        else
            SQL     = "UPDATE \"user\" SET \"state\" = 'A' "
                    + "WHERE \"email\" = '" + email + "';";
        
        // Se instancia y se establece una conexión con la BD.
        con = new ConnectionDB();
        con.connect();
        
        // Se realiza y se recibe la consulta.
        con.queryInsert(SQL);
        
        // Dependiendo del valor de type, se muestra mensaje de éxito.
        if(type == 0)
            System.out.println("La eliminación del usuario cuyo correo es '" + email + "' "
                    + "se ha efectuado con éxito.");
        else
            System.out.println("La reactivación del usuario cuyo correo es '" + email + "' "
                + "se ha efectuado con éxito.");
                
        // Se desconecta la BD.
        con.disconnect();
    }
 
}
