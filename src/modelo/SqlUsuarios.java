
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlUsuarios extends Conexion{
    public boolean registrar(Usuarios usr){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "insert into usuarios (usuario,password,nombre,correo,id_tipo) values (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getCorre());
            ps.setInt(5, usr.getId_tipo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public int existeUsuario(String usuario){
        PreparedStatement ps = null;
         ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "select count(id) from usuarios where usuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        
    }
    
    public boolean esEmail(String correo){
        //Patron para validar el mail
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        
        return mather.find();
    }
    
    
     public boolean login(Usuarios usr){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "select u.id,u.usuario,u.password,u.nombre,u.id_tipo, t.nombre from usuarios as u inner join tipo_usuario as t on u.id_tipo = t.id where usuario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            if(rs.next()){
                if(usr.getPassword().equals(rs.getString(3))){
                    String sqlUpadate = "update usuarios set las_session = ? where id=?";
                    ps=con.prepareStatement(sqlUpadate);
                    ps.setString(1, usr.getLas_session());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setId_tipo(rs.getInt(5));
                    usr.setNombre_tipo(rs.getString(6));
                    return true;
                }else{
                    return false;
                }
            }
          return false;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
}
