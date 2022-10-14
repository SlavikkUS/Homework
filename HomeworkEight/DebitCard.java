package HomeworkEight;

public class DebitCard extends Service {

    public DebitCard(int money, String password) {
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
    public void paymentProcessForDebitCard(int balance) {
        super.paymentProcessForDebitCard(balance);
    }


}