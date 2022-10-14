package HomeworkEight;

public class OverdraftCard extends Service {
    public OverdraftCard(int money, String password) {
        super(money, password);
    }

    @Override
    public void enterPassword() throws InterruptedException {
        super.enterPassword();
    }

    @Override
    public int refillCard() {
        return super.refillCard();
    }

    @Override
    public void paymentProcessForOverdraftCard(int balance) {
        super.paymentProcessForOverdraftCard(balance);

    }
}