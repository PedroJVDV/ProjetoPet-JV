package petshop;

public class Animais {

    protected String raca;
    protected double idade;
    protected String tipoAnimal;
    protected boolean importada;

    public Animais(String tipoAnimal, String raca, int idade, boolean importada) {
        this.tipoAnimal = tipoAnimal.toLowerCase();
        this.raca = raca;
        this.idade = idade;
        this.importada = importada;
    }


    }


