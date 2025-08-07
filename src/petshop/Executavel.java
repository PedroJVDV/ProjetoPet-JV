package petshop;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA PETSHOP ===");

        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();

        System.out.print("Tipo do animal (gato ou cachorro):  ");
        String tipo = scanner.nextLine();

        System.out.print("Raça: ");
        String raca = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Qual o tamanho do pelo do animal? (grande/médio/pequeno): ");
        String tamanho = scanner.nextLine();

        System.out.print("O animal é importado? (sim/nao): ");
        String imp = scanner.nextLine();
        boolean importado = imp.equalsIgnoreCase("sim");


        System.out.println("Sala desejada:\n1 - Clássica (R$55.0)\n2 - Premium (R$90.0)");
        Sala sala = (scanner.nextInt() == 2) ? Sala.PREMIUM : Sala.CLASSICA;

        Salas tratamento = new Salas(tipo, raca, idade, importado, sala);

        System.out.println("\n=== DETALHES DO ATENDIMENTO ===");
        System.out.printf("Nome: %s\nTipo: %s\nRaça: %s\nIdade: %d anos\nImportado: %s\nSala: %s\n",
                nome, tipo, raca, idade, importado ? "Sim" : "Não", sala);


        if (tipo.equalsIgnoreCase("gato")) {
            Gato gato = new Gato(tipo, raca, idade, importado);
            gato.verificadorDeIdade();

            if (idade < 2) {
                System.out.println("Atendimento encerrado.");
                return;
            }

        } else if (tipo.equalsIgnoreCase("cachorro")) {
            Cachorro cachorro = new Cachorro(tipo, raca, idade, importado);
            cachorro.verificadorDeIdade();

            if (idade < 2) {
                System.out.println("Não oferecemos serviços para FILHOTES!");
                return;
            }

        } else {
            System.out.println("Tipo de animal inválido.");
            return;
        }

            tratamento.definirAlturaDoPelo(tamanho);
            tratamento.tamanhoDoPelo();

            // Exemplo de produtos
            tratamento.adicionarProduto(new Produto("Shampoo Antipulgas", 20.0));
            tratamento.adicionarProduto(new Produto("Sabonete Neutro", 10.0));
            tratamento.adicionarProduto(new Produto("Perfume Pet", 15.0));

            // Mostrar produtos usados e atualizar o total

            tratamento.mostrarProdutos();
            tratamento.limpezaCompleta();
            tratamento.mostrarDetalhes();

            scanner.close();

    }
}
