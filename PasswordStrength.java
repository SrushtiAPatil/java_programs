class PasswordStrength {
    public static void main(String[] args) {
        String password = "Java@123";
        boolean hasUpper = false, hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        if (password.length() >= 8 && hasUpper && hasDigit) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
