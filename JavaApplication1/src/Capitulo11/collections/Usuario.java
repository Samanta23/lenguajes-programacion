/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo11.collections;

import java.io.Serializable;

/**
 *
 * @author T-101
 */
public class Usuario implements Serializable{
    //serializacion: comprimir info para enviarla a traves de http
    
    private String login;
    private String pasword;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
