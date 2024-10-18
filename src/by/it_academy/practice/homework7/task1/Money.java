package by.it_academy.practice.homework7.task1;


public class Money {
    private int rubles;
    private int coins;

    public Money(int rubles, int coins) {
        this.rubles = rubles;
        this.coins = coins;
        if (coins > 99) {
            this.rubles += coins / 100;
            this.coins = coins % 100;
        }
    }

    public Money addSum(Money money) {
        rubles += money.getRubles();
        coins += money.getCoins();
        if (coins > 99) {
            rubles += coins / 100;
            coins = coins % 100;
        }
        return this;
    }

    public Money addDifference(Money money) {
        rubles -= money.getRubles();
        coins -= money.getCoins();
        if (coins < 0) {
            rubles -= rubles / 100;
            coins = rubles * 100 + coins;
        }
        return this;
    }

    public void checkBiggerObject(Money money) {
        int sum;
        int sum2;
        sum = this.rubles * 100 + this.coins;
        sum2 = money.rubles * 100 + money.coins;
        if (sum < sum2) {
            System.out.println("Второй объект больше");
        } else if (sum == sum2) {
            System.out.println("Равны");
        } else {
            System.out.println("Первый объект больше");
        }
    }

    public int getRubles() {
        return rubles;
    }

    public int getCoins() {
        return coins;
    }

    @Override
    public String toString() {
        return this.rubles + " руб " + this.coins + " копеек ";
    }
}