package dealership;

public class Till {

    private int money;

    public Till(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    public void takeMoney(int number) {
        this.money -= number;
    }
}
