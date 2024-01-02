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
    @Test
    public void testMultipleEmailHappy() {

        String[] Email = {"xyz@ge.com", "xyz@1.com", "xyz@ge.com.in", "xy.ccdz@ge.com"};
        for (String e : Email) {
            assertTrue(userValidator.isValidEmail(e));
        }
    }
    @Test
    public void testMultipleEmailSad() {

        String[] Email = {"xyz@.com", "xyz@1.com2", "xyz@gecomin", "xy.ccdz@@ge.com"};
        for (String e : Email) {
            assertFalse(userValidator.isValidEmail(e));
        }
    }

}
