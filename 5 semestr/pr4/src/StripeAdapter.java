class StripeAdapter implements PaymentSystem {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void makePayment(double amount) {
        stripe.processPayment(amount);
    }
}
