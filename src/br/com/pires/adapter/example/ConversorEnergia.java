package br.com.pires.adapter.example;

public class ConversorEnergia {

    public static void main(String[] args) {
        Tomada110 tomada110 = new Tomada110();
        System.out.println("Tomada 1:" + tomada110.getEnergia());
        Ventilador ventilador1 = new Ventilador("Brastemp",tomada110);
        System.out.println("Ventilador 1:");
        System.out.println(ventilador1);

//        Tomada220 tomada220 = new Tomada220();
//        System.out.println("Tomada 2:" + tomada220.getEnergia());
//        Ventilador ventilador2= new Ventilador("Mondial",tomada220);
//        System.out.println("Ventilador 2:");
//        System.out.println(ventilador2);

        Tomada220 tomada220 = new Tomada220();
        System.out.println("Tomada 2:" + tomada220.getEnergia());
        AdapterEnergia adaptador = new AdapterEnergia(tomada220);
        Ventilador ventilador2= new Ventilador("Mondial",adaptador.getConvertido());
        System.out.println("Ventilador 2:");
        System.out.println(ventilador2);
    }
}
