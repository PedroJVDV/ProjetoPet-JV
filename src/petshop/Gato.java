package petshop;

public class Gato extends Animais {

    public Gato(String tipoAnimal, String raca, int idade, boolean importada) {
        super(tipoAnimal, raca, idade, importada);
    }

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


