import org.example.CustomException;
import org.example.User;
import org.example.userValidator;
import org.junit.Test;
import static org.junit.Assert.*;

public class testFile {

    User u = new User("Navneet" , "Kumar" , "xyz@ge.com","gsfgd#Sh5","91 7258076955") ;
    userValidator userValidator = new userValidator() ;
    @Test
    public void testFname() throws CustomException {
             assertTrue(userValidator.isValidfName(u.fname)); // Example assertion

    }
    @Test
    public void testLname() throws CustomException {

        assertTrue(userValidator.isValidlName(u.lname)); // Example assertion
    }
    @Test
    public void testEmail() throws CustomException{
        assertTrue(userValidator.isValidEmail(u.email));
    }
    @Test
    public void testPassword() throws CustomException{
        assertTrue(userValidator.isValidPassword(u.password));
    }

    @Test
    public void testPhoneNo() throws CustomException {

        assertTrue(userValidator.isValidPhone(u.phoneNo));
    }
    @Test
    public void testMultipleEmailHappy() throws CustomException {

        String[] Email = {"xyz@ge.com", "xyz@1.com", "xyz@ge.com.in", "xy.ccdz@ge.com"};
        for (String e : Email) {
            assertTrue(userValidator.isValidEmail(e));
        }
    }
    @Test
    public void testMultipleEmailSad() throws CustomException {

        String[] Email = {"xyz@.com", "xyz@1.com2", "xyz@gecomin", "xy.ccdz@@ge.com"};
        for (String e : Email) {
            assertFalse(userValidator.isValidEmail(e));
        }
    }

    @Test
    public void ExpectedExceptionUserFname(){

        try {
            boolean match = userValidator.isValidfName("navneet");
            fail("Expected Exception");
        }catch (CustomException e) {
             assertEquals("Invalid user Fname",e.getMessage());
        }

    }

    @Test
    public void ExpectedExceptionUserLname(){

        try {
            boolean match = userValidator.isValidlName("kumar");
            fail("Expected Exception");
        }catch (CustomException e) {
            assertEquals("Invalid user Fname",e.getMessage());
        }

    }

    @Test
    public void ExpectedExceptionUserEmail(){

        try {
            boolean match = userValidator.isValidEmail("xyz@.com");
            fail("Expected Exception");
        }catch (CustomException e) {
            assertEquals("Invalid user Email",e.getMessage());
        }

    }

    @Test
    public void ExpectedExceptionUserMobile(){

        try {
            boolean match = userValidator.isValidPhone("kumar");
            fail("Expected Exception");
        }catch (CustomException e) {
            assertEquals("Invalid user phone",e.getMessage());
        }

    }
    @Test
    public void ExpectedExceptionUserPassword(){

        try {
            boolean match = userValidator.isValidPassword("adsffs#4");
            fail("Expected Exception");
        }catch (CustomException e) {
            assertEquals("Invalid user password",e.getMessage());
        }

    }



}
