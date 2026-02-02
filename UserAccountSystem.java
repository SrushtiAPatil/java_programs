class User {
    private String username;
    private String password;
    private String email;

    // Constructor
    User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }

    void showProfile() {
        System.out.println("\n--- USER PROFILE ---");
        System.out.println("Username: " + username);
        System.out.println("Email   : " + email);
    }

    boolean isStrongPassword() {
        return password.length() >= 8 && password.contains("@");
    }
}

public class UserAccountSystem {
    public static void main(String[] args) {

       
        User user = new User(
                "admin",
                "Admin@123",
                "admin@gmail.com"
        );

        System.out.println("User Registered Successfully");

       
        String inputUser = "admin";
        String inputPass = "Admin@123";

        if (user.login(inputUser, inputPass)) {
            System.out.println("\nLogin Successful");

           
            if (user.isStrongPassword()) {
                System.out.println("Password Strength: Strong");
            } else {
                System.out.println("Password Strength: Weak");
            }

            
            user.showProfile();

            System.out.println("\nLogout Successful");
        } else {
            System.out.println("Invalid Login Details");
        }
    }
}
