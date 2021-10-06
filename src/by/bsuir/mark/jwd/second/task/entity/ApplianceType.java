package by.bsuir.mark.jwd.second.task.entity;

public enum ApplianceType {
    TEAPOT("teapot"),
    FRIDGE("fridge"),
    MICROWAVE("microwave");

    private final String name;

    ApplianceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
