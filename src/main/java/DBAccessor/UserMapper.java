package DBAccessor;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 The purpose of UserMapper is to...

 @author kasper
 */
public class UserMapper {

    public static void createUser( User user ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
//            String SQL = "INSERT INTO Users (email, password, role) VALUES (?, ?, ?)";
            String SQL = "INSERT INTO `User` (userName, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString(1, user.getUserName() );
            ps.setString( 2, user.getEmail() );
            ps.setString( 3, user.getPassword() );
//            ps.setString( 3, user.getRole() );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
//            int id = ids.getInt( 1 );
//            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

    //Har tilføjet userName til parameteren!
    public static User login( String userName,String email, String password ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
//            String SQL = "SELECT id, role FROM Users "
//                    + "WHERE email=? AND password=?";
            String SQL = "SELECT * FROM `User` "
                    + "WHERE email AND password";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString(1, userName);
            ps.setString( 2, email );
            ps.setString( 3, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
//                String role = rs.getString( "role" );
//                int id = rs.getInt( "id" );
                User user = new User( userName, email, password/*, role */ );
//                user.setId( id );
                return user;
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

}
