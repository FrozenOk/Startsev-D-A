class PayPalAdapter implements PaymentSystem {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void makePayment(double amount) {
        payPal.sendPayment(amount);
    }
}