package com.example.ryan.passwordvalidator;

/**
 * Created by ryan on 2017-05-27.
 */

public class Password {
    private String password;

    public Password(String p){
        password = p;
    }

    public String getPassword(){
        return password;
    }

    public boolean isPassed(){
        if(password.toLowerCase() == "password") return false;
        else if(password.length()<8) return false;
        else return true;
    }
}
