package by.bsuir.mark.jwd.second.task.parsing.builder;

import by.bsuir.mark.jwd.second.task.entity.ApplianceType;
import by.bsuir.mark.jwd.second.task.parsing.builder.impl.FridgeXmlBuilder;
import by.bsuir.mark.jwd.second.task.parsing.builder.impl.MicrowaveXmlBuilder;
import by.bsuir.mark.jwd.second.task.parsing.builder.impl.TeapotXmlBuilder;

public class ApplianceXmlBuilderFactory {
    private static final ApplianceXmlBuilderFactory APPLIANCE_FACTORY = new ApplianceXmlBuilderFactory();

    private ApplianceXmlBuilderFactory() {
    }

    public static ApplianceXmlBuilderFactory getInstance() {
        return APPLIANCE_FACTORY;
    }

    public ApplianceXmlBuilder getApplianceXmlBuilder(ApplianceType applianceType) {
        switch (applianceType) {
            case TEAPOT:
                return new TeapotXmlBuilder();
            case FRIDGE:
                return new FridgeXmlBuilder();
            case MICROWAVE:
                return new MicrowaveXmlBuilder();
            default:
                throw new EnumConstantNotPresentException(ApplianceType.class, applianceType.getName());
        }
    }
}
