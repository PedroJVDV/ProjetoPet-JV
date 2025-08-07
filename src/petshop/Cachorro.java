package petshop;

public class Cachorro extends Animais {

    boolean estaLimpo;
    boolean agitado;

    public Cachorro(String tipoAnimal, String raca, int idade, boolean importada) {
        super(tipoAnimal, raca, idade, importada);
    }

    public void verificadorDeLimpeza() {
        System.out.println(estaLimpo ? "Está limpo!" : "Está sujo!");
    }

    public void comportamentoDoCachorro() {
        System.out.println(agitado ? "Está agitado!" : "Está calmo!");

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
