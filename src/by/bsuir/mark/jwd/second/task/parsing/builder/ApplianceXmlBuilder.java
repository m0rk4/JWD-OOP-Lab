package by.bsuir.mark.jwd.second.task.parsing.builder;

import by.bsuir.mark.jwd.second.task.entity.Appliance;
import org.w3c.dom.Element;

public interface ApplianceXmlBuilder {
    Appliance build(Element element) throws ApplianceBuilderException;
}
