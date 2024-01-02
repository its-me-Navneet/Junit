package org.example;

import java.util.regex.Pattern;

public class userValidator {

     public boolean isValidfName(String fname) throws CustomException {
         String regex = "^[A-Z][A-Za-z]{2,}$";
         Pattern pattern = Pattern.compile(regex) ;
         boolean match = Pattern.matches(regex,fname) ;

         if(match == true) return match ;
         else{
             throw new CustomException("Invalid user Fname") ;
         }

     }
     public boolean isValidlName(String lname) throws  CustomException{


            String regex = "^[A-Z][A-Za-z]{2,}$";
            Pattern pattern = Pattern.compile(regex) ;
           if(Pattern.matches(regex,lname)) return true;

             throw new CustomException("Invalid user Lname") ;
     }

     public boolean isValidPassword(String password) throws CustomException {
         String regex ="(?=.*[0-9])(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$)(.){8,}" ;
         if(Pattern.matches(regex,password)) return true ;

         throw new CustomException("Invalid user password") ;
     }

     public  boolean isValidEmail(String email) throws  CustomException {
         String regex = "^[a-zA-Z0-9]+([._%+-]{0,1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
         if (Pattern.matches(regex, email)) return true ;

          throw new CustomException("Invalid user Email");
     }
     public boolean isValidPhone(String phone) throws CustomException {
         String regex ="^[9]{1}[1]{1}\\s[1-9]{1,1}[0-9]{9}$" ;
         if(Pattern.matches(regex,phone))  return true;
          throw new CustomException("Invalid user phone") ;
     }

}
