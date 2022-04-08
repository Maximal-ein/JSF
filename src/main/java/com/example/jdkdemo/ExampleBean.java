package com.example.jdkdemo;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@SessionScoped
@ManagedBean(name = "exampleBean")
public class ExampleBean implements Serializable {
    private boolean logged;
    private String login;
    private String password;
    private static int counter;//счётчик для тестирования

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean doLogin() {
        logged = true;
        return logged;
    }
}

//новое лицо

//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
//import javax.faces.context.FacesContext;
//
//@ManagedBean
//@RequestScoped
//public class LoginBean {
//
//    private String username;
//    private String password;
//
//    public LoginBean() {
//    }
//
//    public void login() {
//        //Simple login
//        if (!this.username.equals("") && this.username.equals(password)) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
//                    FacesMessage.SEVERITY_INFO, "Success", "Login with success"));
//        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
//                    FacesMessage.SEVERITY_ERROR, "Error", "Username or password not correct"));
//        }
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}