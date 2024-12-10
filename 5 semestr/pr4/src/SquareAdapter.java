class SquareAdapter implements PaymentSystem {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void makePayment(double amount) {
        square.initiateTransaction(amount);
    }
}
