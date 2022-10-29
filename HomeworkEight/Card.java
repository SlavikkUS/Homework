package HomeworkEight;

public class Card {

    private CardType cardType;
    private Double money;
    private String pin;

    public Card(CardType cardType, Double money, String pin) {
        this.cardType = cardType;
        this.money = money;
        this.pin = pin;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}