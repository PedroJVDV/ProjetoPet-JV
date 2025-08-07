package petshop;

public enum Sala {
    CLASSICA(55.0), PREMIUM(90.0);

    private final double preco;

    Sala(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}

