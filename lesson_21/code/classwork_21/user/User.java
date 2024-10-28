package classwork_21.user;

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
        if(email.lastIndexOf('.') >= email.length() - 2) { // стоит ли точка на растояние двух символов от конца длинны Email
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
        this.password = password;
    }
}// end of class
