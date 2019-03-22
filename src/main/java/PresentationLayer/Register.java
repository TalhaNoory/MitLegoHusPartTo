/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Talha Noory
 */
public class Register extends Command{
    
    String execute( HttpServletRequest request, HttpServletResponse response ) throws LoginSampleException {
        String userName = request.getParameter("userName"); //Tilføjet en userName her;
        String email = request.getParameter( "email" );
        String password1 = request.getParameter( "password1" );
        String password2 = request.getParameter( "password2" );
        if ( password1.equals( password2 ) ) {
            User user = LogicFacade.createUser( userName, email, password1 );
            HttpSession session = request.getSession();
            session.setAttribute( "user", user );
//            session.setAttribute( "role", user.getRole() );
//            return user.getRole() + "page";
            return "page";
        } else {
            throw new LoginSampleException( "the two passwords did not match" );
        }
    }
    
}
