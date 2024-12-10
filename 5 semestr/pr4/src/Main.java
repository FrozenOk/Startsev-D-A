public class Main {
    public static void main(String[] args) {
        PaymentSystem payPalPayment = new PayPalAdapter(new PayPal());
        PaymentSystem stripePayment = new StripeAdapter(new Stripe());
        PaymentSystem squarePayment = new SquareAdapter(new Square());

        payPalPayment.makePayment(100.0);
        stripePayment.makePayment(200.0);
        squarePayment.makePayment(300.0);
    }
}
