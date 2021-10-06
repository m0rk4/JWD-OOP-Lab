package by.bsuir.mark.jwd.second.task.dao;

import by.bsuir.mark.jwd.second.task.entity.Appliance;
import by.bsuir.mark.jwd.second.task.entity.ApplianceType;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Dao<T> {
    Optional<T> getMinimumElement(Comparator<T> comparator);

    List<T> getAllByType(ApplianceType applianceType);

    void saveAll(Map<ApplianceType, List<Appliance>> values);
}
