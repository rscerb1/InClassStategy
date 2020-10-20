// Reggie Scerbo, Matt Cole, Delano Powell

public class PaypalStrategy implements PaymentStrategy{
    private String emailID, password;

    public PaypalStrategy(String emailID, String password){
        this.emailID = emailID;
        this.password = password;
    }

    @Override
    public void pay(int amount){
        System.out.println("Paying " + amount + " with Paypal");
    }

}
