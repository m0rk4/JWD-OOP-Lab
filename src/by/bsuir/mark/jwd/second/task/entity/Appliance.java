package by.bsuir.mark.jwd.second.task.entity;

public class Appliance {
    protected final long price;
    protected final long power;

    public Appliance(long price, long power) {
        this.price = price;
        this.power = power;
    }

    public long getPrice() {
        return price;
    }

    public long getPower() {
        return power;
    }
}
