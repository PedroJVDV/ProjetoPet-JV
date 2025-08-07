package petshop;

import java.util.ArrayList;
import java.util.List;

public class Tratamentos extends Animais {

    protected List<Produto> produtosUsados;

    double precoBaseTratamento = 100.0;
    double precoTosa = 75.0;
    TamanhoPelo tamanhoPelo;
    public double precoTotal;

    public Tratamentos(String tipoAnimal, String raca, int idade, boolean importada) {
        super(tipoAnimal, raca, idade, importada);
        this.precoTotal = 0.0;
        this.produtosUsados = new ArrayList<>();
    }

    void limpezaCompleta() {
        double pacote = precoBaseTratamento + precoTosa;
        System.out.printf("Limpeza completa, combo: R$ %.2f\n", pacote);
        precoTotal += pacote;
    }

    boolean peloEhGrande;

    void definirAlturaDoPelo(String tamanho) {
        this.peloEhGrande = tamanho.equalsIgnoreCase("grande");
    }

    void tamanhoDoPelo() {
        if (tamanhoPelo == TamanhoPelo.GRANDE) {
            System.out.println("Está grande!");
            precoBaseTratamento += 50.0;
        } else {
            System.out.println("Está Médio/Pequeno!");
            precoBaseTratamento += 25.0;
        }
    }

    // Método para adicionar produto

    public void adicionarProduto(Produto produto) {
        produtosUsados.add(produto);
    }

    // Método atualizado para mostrar produtos e calcular taxa
    public void mostrarProdutos() {
        if (produtosUsados.isEmpty()) {
            System.out.println("Nenhum produto foi utilizado.");
            return;
        }

        System.out.println("Produtos utilizados:");
        double totalProdutos = 0.0;

        for (Produto p : produtosUsados) {
            System.out.printf("- %s: R$ %.2f\n", p.getNome(), p.getPreco());
            totalProdutos += p.getPreco();
        }

        System.out.printf("Total dos produtos: R$ %.2f\n", totalProdutos);
        precoTotal += totalProdutos;
    }

    public void mostrarDetalhes() {
        System.out.printf("Valor total do atendimento: R$ %.2f\n", precoTotal);
    }
}
