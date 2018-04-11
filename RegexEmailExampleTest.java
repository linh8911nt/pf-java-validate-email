public class RegexEmailExampleTest {
    private static RegexEmailExample emailExample;
    public static final String[] validEmail = new String[] { "ab@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        emailExample = new RegexEmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validateEmail(email);
            System.out.println("Email " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validateEmail(email);
            System.out.println("Email " + email +" is valid: "+ isvalid);
        }
    }
}
