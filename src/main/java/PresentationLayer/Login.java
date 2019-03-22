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
public class Login extends Command{

    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String userName = request.getParameter("userName"); // Tilføjet en userName her;
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = LogicFacade.login(userName, email, password);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
//        session.setAttribute("role", user.getRole());
//        return user.getRole() + "page";
        return "page";
    }

}
