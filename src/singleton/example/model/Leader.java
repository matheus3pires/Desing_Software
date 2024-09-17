package singleton.example.model;

public class Leader extends Autobot{
    private  String nome;


    public Leader(String nome) {
        this.nome = nome;
    }


    @Override
    public void printCardAutobot() {
        System.out.println("Nome: " + this.nome);
        if (nome.equals("Optimus")){
            System.out.println(">> AUTOBOT LEADER");
        }else {
            System.out.println(">> AUTOBOT REBELDE/DECEPTICON");
        }
        System.out.println("\tAtaque: 3\n" +
                "\tDefesa: 7\n"+
                "\tEspecialidade: Estrategista de Guerra. \n");

    }
}
