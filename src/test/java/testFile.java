import org.example.User;
import org.example.userValidator;
import org.junit.Test;
import static org.junit.Assert.*;

public class testFile {

    User u = new User("Navneet" , "Kumar" , "xyz@ge.com","gsfgd#Sh5","91 7258076955") ;
     userValidator userValidator = new userValidator() ;
    @Test
    public void testFname() {

        assertTrue(userValidator.isValidfName(u.fname)); // Example assertion
    }
    @Test
    public void testLname() {

        assertTrue(userValidator.isValidfName(u.lname)); // Example assertion
    }
    @Test
    public void testEmail(){
        assertTrue(userValidator.isValidEmail(u.email));
    }
    @Test
    public void testPassword(){
        assertTrue(userValidator.isValidPasswoord(u.password));
    }

    @Test
    public void testPhoneNo(){

        assertTrue(userValidator.isValidPhone(u.phoneNo));
    }

}
