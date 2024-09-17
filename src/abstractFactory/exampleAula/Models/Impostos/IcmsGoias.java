package abstractFactory.exampleAula.Models.Impostos;

public class IcmsGoias implements ICMS{

    @Override
    public String imposto() {
        return "Imposto Goiás: 6,5%.";
    }
}
