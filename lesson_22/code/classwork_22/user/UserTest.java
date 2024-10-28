package classwork_22.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    User user;

    final String email = "peter@mail.de"; // ideal email
    final String password = "12345Az!"; // ideal password




    @BeforeEach
    void setUp() {
        user = new User(email, password); // creat new "fresh" object user
    }

    @Test
    void testValidEmail(){
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }

    @Test
    void testValidPassword(){
        //user.setPassword(password);
        assertEquals("12345Az!", user.getPassword());
    }

// ---------------1 Validation---------------------
    @Test
    void testValidEmail_withoutAt(){
        String email = "petermail.de"; // Wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());//email did not change
    }
    @Test
    void testValidEmail_withManyAt(){
        String email = "peter@mail.d@e"; // Wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());//email did not change
    }
    //-----------------2 Validation--------------------
    @Test
    void testValidEmail_withoutPointAfterAt() {
        String email = "peter@mailde"; // Wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());//email did not change
    }

    // ---------------3 Validation-------------------
    @Test
    void testValidEmail_withPointOnWrongPlace() {
        String email = "peter@maild.e"; // Wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());//email did not change
    }
    //------------------4 Validation----------------------
    @Test
    void testValidEmail_withWrongSymbol() {
        String email = "$peter@mail.de"; // Wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());//email did not change
    }
//    @Test
//    void testValidEmail_withTwoDorts() {
//        String email = "peter@mail..de"; // Wrong email
//        user.setEmail(email);
//        assertEquals("peter@mail.de", user.getEmail());//email did not change
//        System.out.println(user.getEmail());
//    }

//    @Test
//    void testValidEmail_withAtOnWrongPlace(){
//        String email = "petermai@l.de"; // Wrong email
//        user.setEmail(email);
//        assertEquals("peter@mail.de",user.getEmail());//email did not change
//    }

//    @Test
//    void testValidEmail_withCapitalLetter() {
//        String email = "peter@mail..de"; // Wrong email
//        user.setEmail(email);
//        assertEquals("peter@mail.de", user.getEmail());//email did not change
//    }


    @Test
    void setValidPassword_Lenght(){
        user.setPassword("1234Az!"); // 7 symbols
        assertEquals("12345Az!", user.getPassword());
        user.setPassword("123456789123456789Az!"); // 21 symbol
        assertEquals("12345Az!", user.getPassword());
    }
    @Test
    void setValidPassword_MinOneDigit() {
        user.setPassword("peterAz!");
        assertEquals("12345Az!", user.getPassword());
    }
    @Test
    void setValidPassword_OneLetterUpperCase() {
        user.setPassword("12345az!");
        assertEquals("12345Az!", user.getPassword());
    }
    @Test
    void setValidPassword_OneLetterLowerCase() {
        user.setPassword("12345AZ!");
        assertEquals("12345Az!", user.getPassword());
    }
    @Test
    void setValidPassword_OneSpecialSymbol() {
        user.setPassword("12345Az"); // no special symbol
        assertEquals("12345Az!", user.getPassword());
    }
}