package by.it_academy.practice.homework9;


public enum Item {
    REFRIGERATOR(23),
    TV(34),
    PLAY_STATION(11),
    BALL(5);

    private Integer price;

    Item(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
