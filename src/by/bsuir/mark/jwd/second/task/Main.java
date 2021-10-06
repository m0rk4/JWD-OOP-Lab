package by.bsuir.mark.jwd.second.task;

import by.bsuir.mark.jwd.second.task.dao.ApplianceDao;
import by.bsuir.mark.jwd.second.task.dao.Dao;
import by.bsuir.mark.jwd.second.task.director.ApplianceDirector;
import by.bsuir.mark.jwd.second.task.entity.Appliance;
import by.bsuir.mark.jwd.second.task.logic.ApplianceService;
import by.bsuir.mark.jwd.second.task.logic.impl.ApplianceServiceImpl;
import by.bsuir.mark.jwd.second.task.parsing.ApplianceDomParser;
import by.bsuir.mark.jwd.second.task.parsing.Parser;

public class Main {
    public static void main(String[] args) {
        Dao<Appliance> dao = ApplianceDao.getInstance();
        ApplianceService service = new ApplianceServiceImpl(dao);
        Parser parser = new ApplianceDomParser();

        ApplianceDirector director = new ApplianceDirector(parser, service, dao);
        director.process();
    }
}
