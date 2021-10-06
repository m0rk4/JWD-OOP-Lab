package by.bsuir.mark.jwd.second.task.entity;

public class Microwave extends Appliance {
    private final boolean hasTimer;

    public Microwave(long price, long power, boolean hasTimer) {
        super(price, power);
        this.hasTimer = hasTimer;
    }

    public boolean isHasTimer() {
        return hasTimer;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "price=" + price + ", " +
                "power=" + power + ", " +
                "hasTimer=" + hasTimer +
                "}";
    }
}
