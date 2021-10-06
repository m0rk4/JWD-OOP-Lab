package by.bsuir.mark.jwd.second.task.entity;

public class Teapot extends Appliance {
    private final long volume;

    public Teapot(long price, long power, long volume) {
        super(price, power);
        this.volume = volume;
    }

    public long getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "price=" + price + ", " +
                "power=" + power + ", " +
                "volume=" + volume +
                "}";
    }
}
