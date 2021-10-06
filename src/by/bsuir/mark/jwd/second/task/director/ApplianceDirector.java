package by.bsuir.mark.jwd.second.task.director;

import by.bsuir.mark.jwd.second.task.dao.Dao;
import by.bsuir.mark.jwd.second.task.entity.Appliance;
import by.bsuir.mark.jwd.second.task.entity.ApplianceType;
import by.bsuir.mark.jwd.second.task.logic.ApplianceService;
import by.bsuir.mark.jwd.second.task.parsing.Parser;
import by.bsuir.mark.jwd.second.task.parsing.ParserException;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplianceDirector {
    private static final Logger LOGGER = Logger.getLogger(ApplianceDirector.class.getName());
    private static final String PATH_TO_APPLIANCES_XML = "./appliances.xml";

    private final Parser parser;
    private final ApplianceService applianceService;
    private final Dao<Appliance> applianceDao;

    public ApplianceDirector(Parser parser, ApplianceService applianceService, Dao<Appliance> applianceDao) {
        this.parser = parser;
        this.applianceService = applianceService;
        this.applianceDao = applianceDao;
    }

    public void process() {
        Map<ApplianceType, List<Appliance>> applianceMap;
        try {
            applianceMap = parser.parse(PATH_TO_APPLIANCES_XML);
            applianceDao.saveAll(applianceMap);
        } catch (ParserException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            return;
        }

        LOGGER.log(Level.INFO, "Appliances loaded: {0}\n", applianceMap);
        List<Appliance> teapots = applianceService.getAllTeapots();

        LOGGER.log(Level.INFO, "Teapots: {0}\n", teapots);
        Optional<Appliance> cheapestAppliance = applianceService.getCheapestAppliance();
        if (cheapestAppliance.isPresent()) {
            LOGGER.log(Level.INFO, "Cheapest appliance: {0}\n", cheapestAppliance.get());
            return;
        }

        LOGGER.log(Level.INFO, "No appliances found.\n");
    }
}
