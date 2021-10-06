package by.bsuir.mark.jwd.second.task.dao;

import by.bsuir.mark.jwd.second.task.entity.Appliance;
import by.bsuir.mark.jwd.second.task.entity.ApplianceType;

import java.util.*;

public class ApplianceDao implements Dao<Appliance> {

    private static final ApplianceDao APPLIANCE_DAO = new ApplianceDao();

    private final EnumMap<ApplianceType, List<Appliance>> appliances = new EnumMap<>(ApplianceType.class);

    private ApplianceDao() {
    }

    public static ApplianceDao getInstance() {
        return APPLIANCE_DAO;
    }

    @Override
    public Optional<Appliance> getMinimumElement(Comparator<Appliance> comparator) {
        return appliances.values().stream().flatMap(List::stream).min(comparator);
    }

    @Override
    public List<Appliance> getAllByType(ApplianceType applianceType) {
        return appliances.get(applianceType);
    }

    @Override
    public void saveAll(Map<ApplianceType, List<Appliance>> applianceMap) {
        applianceMap.forEach((key, value) -> {
            this.appliances.computeIfAbsent(key, k -> new ArrayList<>());
            this.appliances.get(key).addAll(value);
        });
    }
}
