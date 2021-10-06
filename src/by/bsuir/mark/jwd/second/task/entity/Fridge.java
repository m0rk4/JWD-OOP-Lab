package by.bsuir.mark.jwd.second.task.entity;

public class Fridge extends Appliance {
    private final long autonomousColdStorageTime;

    public Fridge(long price, long power, long autonomousColdStorageTime) {
        super(price, power);
        this.autonomousColdStorageTime = autonomousColdStorageTime;
    }

    public long getAutonomousColdStorageTime() {
        return autonomousColdStorageTime;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "price=" + price + ", " +
                "power=" + power + ", " +
                "autonomousColdStorageTime=" + autonomousColdStorageTime +
                "}";
    }
}
