package JavaProject2;
/*Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also, valid password cannot contain
userName.
 */

class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Please use a Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            if (password == null || !password.contains(userName)) {
                this.userName = userName;
                System.out.println("Username set successfully.");
            } else {
                System.out.println("Invalid username. Username cannot be part of the password.");
            }
        } else {
            System.out.println("Invalid username. Username should be non-empty and have a length larger than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6) {
            if (userName == null || !password.contains(userName)) {
                this.password = password;
                System.out.println("Password set successfully.");
            } else {
                System.out.println("Invalid password. Password cannot contain the username.");
            }
        } else {
            System.out.println("Invalid password. Password should be non-empty and have a length larger than 6 characters.");
        }
    }
}

 class Task9 {
    public static void main(String[] args) {
        Registration registration = new Registration();

        registration.setEmail("Jinny@yahoo.com");
        registration.setUserName("Jinny1");
        registration.setPassword("abcd12345");
    }
}
