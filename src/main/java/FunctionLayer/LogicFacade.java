package FunctionLayer;

import DBAccessor.UserMapper;

/**
 *
 * @author Talha Noory
 */
public class LogicFacade {
    
    //Har tilføjet userName i parameteren!
    public static User login( String userName, String email, String password ) throws LoginSampleException {
        return UserMapper.login( userName, email, password );
    } 

    // Har tilføjet en userName i parameteren!
    public static User createUser( String userName, String email, String password ) throws LoginSampleException {
        User user = new User(userName, email, password/*, "customer"*/);
        UserMapper.createUser( user );
        return user;
    }
    
}
