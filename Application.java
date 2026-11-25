
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locadora locadora = new Locadora(100);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Aluguel");
            System.out.println("2. Remover Aluguel");
            System.out.println("3. Buscar Aluguel por Cliente");
            System.out.println("4. Buscar Posição de Aluguel");
            System.out.println("5. Buscar Valor Total de Aluguéis");
            System.out.println("6. Mostrar Todos os Aluguéis");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opçao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    // Lógica para adicionar aluguel
                    System.out.println("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Idade do cliente: ");
                    int idade = scanner.nextInt();
                    Cliente cliente = new Cliente();
                    cliente.setCliente(nome, idade);

                    System.out.println("Placa do veiculo: ");
                    String placa = scanner.nextLine();
                    System.out.println("Modelo do veiculo: ");
                    String modelo = scanner.nextLine();
                    System.out.println("Valor da diaria: ");
                    double diaria = scanner.nextDouble();
                    Veiculo veiculo = new Veiculo();
                    veiculo.setVeiculo(placa, modelo, diaria);

                    System.out.println("Quantidade de diarias: ");
                    int qtdDiarias = scanner.nextInt();
                    scanner.nextLine();

                    Aluguel aluguel = new Aluguel();
                    aluguel.setAluguel(veiculo, cliente, qtdDiarias);

                    if (locadora.adicionarAluguel(aluguel)) {
                        System.out.println("Aluguel concluido!");
                    } else {
                        System.out.println("Nao foi possivel adicionar aluguel.");
                    }
                    break;
                case 2:
                    // Lógica para remover aluguel
                    System.out.println("Digite o nome do cliente que deseja remover: ");
                    String removeCliente = scanner.nextLine();
                    if (locadora.removerAluguel(removeCliente)) {
                        System.out.println("Cliente removido com sucesso!");
                    } else {
                        System.out.println("Nao foi possivel remover este cliente");
                    }
                    break;
                case 3:
                    // Lógica para buscar aluguel por cliente
                    System.out.println("Digite o nome do cliente que deseja buscar os alugueis: ");
                    String buscaCliente = scanner.nextLine();

                    Aluguel[] clienteAlugueis = locadora.buscarAluguelCliente(buscaCliente);
                    if (clienteAlugueis.length == 0) {
                        System.out.println("Esse cliente nao possui alugueis.");
                    } else {
                        for (int i = 0; i < clienteAlugueis.length; i++) {
                            System.out.println(clienteAlugueis[i]);
                        }
                    }
                    break;
                case 4:
                    // Lógica para buscar posição de aluguel
                    System.out.println("Digite o nome do cliente que deseja encontrar os alugueis: ");
                    String nomePosicao = scanner.nextLine();

                    Aluguel[] alugueisPosicao = locadora.buscarAluguelCliente(nomePosicao);
                    if (alugueisPosicao.length == 0) {
                        System.out.println("Esse cliente nao possui alugueis.");
                    } else {
                        for (int i = 0; i < alugueisPosicao.length; i++) {
                            int pos = locadora.buscarPosicao(alugueisPosicao[i]);
                            System.out.println("Posicao " + pos + ": " + alugueisPosicao[i]);
                        }
                    }
                    break;
                case 5:
                    // Lógica para buscar valor total de aluguéis
                    System.out.println("O valor arrecadado foi: " + locadora.buscarValorAlugueis());
                    break;
                case 6:
                    locadora.mostrarAlugueis();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
