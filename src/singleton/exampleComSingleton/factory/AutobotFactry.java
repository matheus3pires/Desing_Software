package singleton.exampleComSingleton.factory;

import singleton.exampleComSingleton.model.Autobot;

public interface AutobotFactry {

    public abstract Autobot createAutobot(String robot);
}
