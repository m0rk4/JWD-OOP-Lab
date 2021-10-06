package by.bsuir.mark.jwd.second.task.logic;

import by.bsuir.mark.jwd.second.task.entity.Appliance;

import java.util.List;
import java.util.Optional;

public interface ApplianceService {
    Optional<Appliance> getCheapestAppliance();

    List<Appliance> getAllTeapots();
}
