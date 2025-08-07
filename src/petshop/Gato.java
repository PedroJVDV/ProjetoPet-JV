package petshop;

public class Gato extends Animais {

    boolean estaLimpo;
    boolean agitado;

    public Gato(String tipoAnimal, String raca, int idade, boolean importada) {
        super(tipoAnimal, raca, idade, importada);
    }

    public void verificadorDeLimpeza() {
        System.out.println(estaLimpo ? "Está limpo!" : "Está sujo!");
    }

    public void comportamentoDoGato() {
        System.out.println(agitado ? "Está agitado!" : "Está calmo!");

    }

    String idoso = "Gato idoso!";
    String adulto = "Gato adulto!";
    String jovem = "Gato jovem!";
    String filhote = "Não oferemos serviço!!";

    void verificadorDeIdade() {
        if (idade < 2) {

            System.out.println("Não oferecemos serviço!!");
        } else if (idade >= 2 && idade < 6) {
            System.out.println("Gato jovem!");
        } else if (idade >= 6 && idade < 10) {
            System.out.println("Gato adulto!");
        } else {
            System.out.println("Gato idoso!");
        }
    }


}


