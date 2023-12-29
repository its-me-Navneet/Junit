package org.example;

import java.util.regex.Pattern;

public class userValidator {

     public boolean isValidfName(String fname){
         String regex = "^[A-Z][A-Za-z]{2,}$";
         Pattern pattern = Pattern.compile(regex) ;
         return Pattern.matches(regex,fname) ;
     }
     public boolean isValidlName(String lname){
         String regex = "^[A-Z][A-Za-z]{2,}$";
         Pattern pattern = Pattern.compile(regex) ;
         return Pattern.matches(regex,lname) ;
     }

     public boolean isValidPasswoord(String password){
         String regex ="(?=.*[0-9])(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(.){8,}" ;
         return Pattern.matches(regex,password) ;
     }

     public  boolean isValidEmail(String email) {
         String regex = "^[a-zA-Z0-9]+([._%+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
         return Pattern.matches(regex, email);
     }
     public boolean isValidPhone(String phone){
         String regex ="^[9]{1}[1]{1}\\s[1-9]{1,1}[0-9]{9}$" ;
         return Pattern.matches(regex,phone) ;
     }

}
