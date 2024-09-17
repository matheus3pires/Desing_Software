package br.com.pires.singleton.example.factory;

import br.com.pires.singleton.example.model.Autobot;
import br.com.pires.singleton.example.model.Leader;

public class LeaderFactory implements AutobotFactry {

    @Override
    public Autobot summonAutobot(String robot) {
        Autobot roboAutobot = null;
        roboAutobot = createAutobot(robot);
        roboAutobot.AssembleAutobot();
        return roboAutobot;
    }

    @Override
    public Autobot createAutobot(String robot) {
        if (robot.equals("Optimus")){
            return new Leader("Optimus");
        } else if (robot.equals("Nemesis")){
            return new Leader("Nemesis");
        }
        return null;
    }
}
