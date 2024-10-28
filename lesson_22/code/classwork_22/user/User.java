package classwork_22.user;

public class User {

    private String email;
    private String password;


    //constructor
    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){
            this.email = email;
        }else {
            System.out.println(email + " is NOT valid!");
        }

    }

    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf('@'); // index where @ placed
        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){ // есть ли @ в Email. Не больше одного @
            return false;
        }
        if(email.indexOf('.', indexAt) == -1){   // есть ли точка после @
            return false;
        }
        if(email.lastIndexOf('.') >= email.length() - 2) { // стоит ли точка на растояние двуч символов от конца длинны Email
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка являются ли символы Email - буквами, цыфрами и спец-символами
            char c = email.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isPasswordValid(password)){
            this.password = password;
        }else {
            System.out.println( password + " is NOT valid!");
        }
    }

// 1) length >= 8 length <20
// 2) min one digit
// 3) min one symbol in upperCase
// 4) min one symbol in lowerCase
// 5) min one special symbol (!%@$&)

    private boolean isPasswordValid(String password) {
        boolean[] res = new boolean[5];
        if (password.length() >= 8 && password.length() < 20){
            res[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isDigit(ch)){
                res[1] = true;
            }
            if (Character.isUpperCase(ch)){
                res[2] = true;
            }
            if (Character.isLowerCase(ch)){
                res[3] = true;
            }
            if ("!%@$&".indexOf(ch) >= 0){
                res[4] = true;
            }

            if (res[0] && res[1] && res[2] && res[3] && res[4]){
                return true;
            }
        }
        return false;
    }

}// end of class
