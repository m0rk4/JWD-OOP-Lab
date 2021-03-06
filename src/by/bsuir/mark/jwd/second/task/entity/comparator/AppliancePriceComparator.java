package by.bsuir.mark.jwd.second.task.entity.comparator;

import by.bsuir.mark.jwd.second.task.entity.Appliance;

import java.util.Comparator;

/**
 * A price {@link Comparator} for appliances.
 */
public class AppliancePriceComparator implements Comparator<Appliance> {
    @Override
    public int compare(Appliance firstAppliance, Appliance secondAppliance) {
        return Comparator.comparing(Appliance::getPrice).compare(firstAppliance, secondAppliance);
    }
}
