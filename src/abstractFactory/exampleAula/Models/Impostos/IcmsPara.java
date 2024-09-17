package abstractFactory.exampleAula.Models.Impostos;

public class IcmsPara implements ICMS{

    @Override
    public String imposto() {
        return "Imposto Goiás: 2,7%.";
    }
}
