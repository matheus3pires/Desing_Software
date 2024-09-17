package br.com.pires.singleton.example.factory;

import br.com.pires.singleton.example.model.Autobot;

public interface AutobotFactry {

    public Autobot summonAutobot(String robot);

    public abstract Autobot createAutobot(String robot);
}
