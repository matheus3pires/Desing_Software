package singleton.exampleComSingleton.transformers;

import singleton.exampleComSingleton.factory.LeaderFactory;
import singleton.exampleComSingleton.model.Autobot;

public class Transformers {
    public static void main(String[] args) {
//        LeaderFactory fab1 = new LeaderFactory();
//        LeaderFactory fab2 = new LeaderFactory();
//
//        Autobot autobot1 = fab1.summonAutobot("Optimus");
//        System.out.println("Autobot 1:");
//        autobot1.printCardAutobot();
//
//        Autobot autobot2 = fab2.summonAutobot("Nemesis");
//        System.out.println("Autobot 2:");
//        autobot2.printCardAutobot();
        System.out.println("Autobot 1:");
        LeaderFactory fab1 = LeaderFactory.getInstance("Optimus");
        System.out.println("Hashcode: " + fab1.hashCode());

        Autobot autobot2 = fab1.createAutobot("Nemesis");
        autobot2.AssembleAutobot();
        autobot2.printCardAutobot();

//        System.out.println("Autobot 1:");
//        LeaderFactory fab2 = LeaderFactory.getInstance("Nemesis");
//        Autobot autobot2 = fab2.createAutobot("Nemesis");
//        autobot2.printCardAutobot();

        System.out.println("Hashcode: " + fab1.hashCode());
    }
}
