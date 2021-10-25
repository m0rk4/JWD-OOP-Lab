package by.bsuir.mark.jwd.second.task.parsing.builder;

import by.bsuir.mark.jwd.second.task.entity.Appliance;
import org.w3c.dom.Element;

/**
 * An appliance xml builder interface.
 */
public interface ApplianceXmlBuilder {
    /**
     * Build {@link Appliance} from a xml element.
     *
     * @param element xml element that represents appliance
     * @return built appliance
     * @throws ApplianceBuilderException in case errors during building
     */
    Appliance build(Element element) throws ApplianceBuilderException;
}
