package br.com.pires.prototype.example;

import br.com.pires.prototype.example.model.*;

import java.util.HashMap;

public class PrototypeMain {

    public static HashMap<String, Figura> geometria = new HashMap<String, Figura>();

    public static Figura getFigura(String id) {
        Figura fig = geometria.get(id);
        fig.desenhar();
        return (Figura) fig.clone();
    }

    public static void criarFigura() {
        Quadrado quad = new Quadrado();
        quad.setId("1");
        geometria.put(quad.getId(), quad);

        Triangulo tri = new Triangulo();
        tri.setId("2");
        geometria.put(tri.getId(), tri);

        Losango los = new Losango();
        los.setId("3");
        geometria.put(los.getId(), los);

        Retangulo ret = new Retangulo();
        ret.setId("4");
        geometria.put(ret.getId(), ret);

    }

    public static void main(String[] args) {
        criarFigura();

        Figura clone1 = getFigura("1");
        System.out.println("Clone 1: " + clone1.getTipo());
        System.out.println("Area clone 1: " + clone1.getArea());

        clone1.setArea(clone1.getArea() + 5);
        geometria.put("5", clone1);
        System.out.println("Area clonada: " + clone1.getArea());

        Figura clone2 = getFigura("2");
        System.out.println("Clone 2: " + clone2.getTipo());
        System.out.println("Area clone 2: " + clone2.getArea());

        Figura cloneClone = getFigura("5");
        System.out.println("Clone clone: " + cloneClone.getTipo());
        System.out.println("Area clone clone: " + cloneClone.getArea());
    }
}
