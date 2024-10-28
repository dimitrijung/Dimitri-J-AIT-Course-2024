package classwork_21.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void setPassword() {
    }
}