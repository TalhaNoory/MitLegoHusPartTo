/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Talha Noory
 */
public class User {
    
//    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String userName; //Min Kode
    private String email;
    private String password; // Should be hashed and secured
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
//    private String role;

//    public int getId() {
//        return id;
//    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getRole() {
//        return role;
//    }

//    public void setRole(String role) {
//        this.role = role;
//    }

    public User(/*int id,*/String userName, String email, String password/*, String role*/) {
//        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
//        this.role = role;
    }
    
}
