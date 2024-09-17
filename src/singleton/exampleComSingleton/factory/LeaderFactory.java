package singleton.exampleComSingleton.factory;

import singleton.exampleComSingleton.model.Autobot;
import singleton.exampleComSingleton.model.Leader;

public class LeaderFactory implements AutobotFactry {

    private static LeaderFactory singleton;
    private Autobot robotAutobot;

    // TODO nao precisa mandar algo como parametro pode ser apenas a instancia da fab
    public static LeaderFactory getInstance(String robot){
        if (singleton == null){
            singleton = new LeaderFactory(robot);
        }
        // TODO se ele ja foi instanciado ele retorna a fabrica ja criada.
        return singleton;
    }

    private LeaderFactory(String robot) {
        this.robotAutobot = null;
        robotAutobot = createAutobot(robot);
        robotAutobot.AssembleAutobot();
        robotAutobot.printCardAutobot();
    }

    // TODO assim ficaria se nao fosse criar um objeto na instancia da fabrica
    // TODO para criar o objeto precisaria chamar os outros métodos.
//    public static LeaderFactory getInstance(){
//        if (singleton == null){
//            singleton = new LeaderFactory();
//        }
//        return singleton;
//    }
//
//    private LeaderFactory() {
//        this.robotAutobot = null;
//    }

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
