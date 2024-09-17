package singleton.example.transformers;

import singleton.example.factory.LeaderFactory;
import singleton.example.model.Autobot;

public class Transformers {
    public static void main(String[] args) {
        LeaderFactory fab1 = new LeaderFactory();
        LeaderFactory fab2 = new LeaderFactory();

        Autobot autobot1 = fab1.summonAutobot("Optimus");
        System.out.println("Autobot 1:");
        autobot1.printCardAutobot();

        Autobot autobot2 = fab2.summonAutobot("Nemesis");
        System.out.println("Autobot 2:");
        autobot2.printCardAutobot();
    }
}
