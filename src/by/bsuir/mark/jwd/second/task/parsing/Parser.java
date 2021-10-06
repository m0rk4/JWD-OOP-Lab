package by.bsuir.mark.jwd.second.task.parsing;

import by.bsuir.mark.jwd.second.task.entity.Appliance;
import by.bsuir.mark.jwd.second.task.entity.ApplianceType;

import java.util.List;
import java.util.Map;

public interface Parser {
    Map<ApplianceType, List<Appliance>> parse(String path) throws ParserException;
}
