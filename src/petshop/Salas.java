package petshop;

public class Salas extends Tratamentos {

    private Sala salaEscolhida;

    public void setSalaEscolhida(Sala salaEscolhida) {
        this.salaEscolhida = salaEscolhida;
    }

    public Salas(String tipoAnimal, String raca, int idade, boolean importada, Sala salaEscolhida) {
        super(tipoAnimal, raca, idade, importada);
        this.tipoAnimal = tipoAnimal;
        this.raca = raca;
        this.idade = idade;
        this.importada = importada;
        this.salaEscolhida = salaEscolhida;
        this.precoTotal += salaEscolhida.getPreco();
    }

    public void mostrarDetalhes() {
        System.out.println("Animal: " + tipoAnimal + " | Raça: " + raca + " | Idade: " + idade + " anos");
        System.out.println("Sala escolhida: " + salaEscolhida + " (R$ " + salaEscolhida.getPreco() + ")");
        System.out.println("Pelo é grande? " + (peloEhGrande ? "Sim" : "Não"));
        mostrarProdutos();
        System.out.println("Preço base tratamento: R$ " + precoBaseTratamento);
        System.out.println("Preço tosa: R$ " + precoTosa);
        System.out.println("Preço total: R$ " + precoTotal);
        System.out.println("----------------------------");
    }

}
