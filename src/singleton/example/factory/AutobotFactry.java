package singleton.example.factory;

import singleton.example.model.Autobot;

public interface AutobotFactry {

    public Autobot summonAutobot(String robot);

    public abstract Autobot createAutobot(String robot);
}
