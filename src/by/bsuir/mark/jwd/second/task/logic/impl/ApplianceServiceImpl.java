package by.bsuir.mark.jwd.second.task.logic.impl;

import by.bsuir.mark.jwd.second.task.dao.Dao;
import by.bsuir.mark.jwd.second.task.entity.Appliance;
import by.bsuir.mark.jwd.second.task.entity.ApplianceType;
import by.bsuir.mark.jwd.second.task.entity.comparator.AppliancePriceComparator;
import by.bsuir.mark.jwd.second.task.logic.ApplianceService;

import java.util.List;
import java.util.Optional;

public class ApplianceServiceImpl implements ApplianceService {
    private final Dao<Appliance> applianceDao;

    public ApplianceServiceImpl(Dao<Appliance> applianceDao) {
        this.applianceDao = applianceDao;
    }

    @Override
    public Optional<Appliance> getCheapestAppliance() {
        return applianceDao.getMinimumElement(new AppliancePriceComparator());
    }

    @Override
    public List<Appliance> getAllTeapots() {
        return applianceDao.getAllByType(ApplianceType.TEAPOT);
    }
}
