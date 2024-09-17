package br.com.pires.singleton.exampleComSingleton.factory;

import br.com.pires.singleton.exampleComSingleton.model.Autobot;

public interface AutobotFactry {

    public abstract Autobot createAutobot(String robot);
}
