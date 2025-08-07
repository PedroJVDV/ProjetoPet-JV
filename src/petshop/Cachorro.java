package petshop;

public class Cachorro extends Animais {

    public Cachorro(String tipoAnimal, String raca, int idade, boolean importada) {
        super(tipoAnimal, raca, idade, importada);
    }


    void verificadorDeIdade(){
        if (this.idade < 1) {
            System.out.println("Não oferecemos serviço!!");
        } else if (this.idade == 1) {
            System.out.println("Cachorro jovem!");
        } else if (this.idade >= 2 && this.idade < 7) {
            System.out.println("Cachorro adulto!");
        } else {
            System.out.println("Cachorro idoso!");
        }
    }
}
