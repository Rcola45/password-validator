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

    public boolean validate(){
        if(isPassword() && isOverEight() && containsOneUpperCase()
                && containsThreeDigits() && containsDollar()) return true;
        else return false;
    }

    public boolean isPassword(){
        if(password.toLowerCase() == "password") return false;
        else return true;
    }

    public boolean isOverEight(){
        if(password.length()<8) return false;
        else return true;
    }

    public boolean containsOneUpperCase(){
        for(int i=0;i<password.length();i++){
            if((int)password.charAt(i)>=65 && (int)password.charAt(i)<=90) return true;
        }
        return false;
    }

    public boolean containsThreeDigits(){
        int count = 0;
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)>='0' && password.charAt(i)<='9') count++;
        }

        if(count<3) return false;
        else return true;
    }

    public boolean containsDollar(){
        for(int i=0;i<password.length();i++){
            if(password.charAt(i) == '$') return true;
        }
        return false;
    }
}
