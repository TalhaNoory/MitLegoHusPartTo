package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Talha Noory
 */
public class Login extends Command{

    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String userName = request.getParameter("userName"); // Tilføjet en userName her;
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user;
        try {
            user = LogicFacade.login(userName, email, password);
        } catch (Exception ex) {
            throw new LoginSampleException(ex.getMessage());
        }
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
//        session.setAttribute("role", user.getRole());
//        return user.getRole() + "page";
        return "customerpage";
    }

}
