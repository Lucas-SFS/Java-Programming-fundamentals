import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locadora locadora = new Locadora(100);
        String opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar aluguel");
            System.out.println("2 - Remover aluguel");
            System.out.println("3 - Mostrar alugueis de um cliente");
            System.out.println("4 - Mostrar valor arrecado com os alugueis");
            System.out.println("5 - Mostrar alugueis");
            System.out.println("6 - Relatorio de clientes");
            System.out.println("99 - Sair do programa");
            System.out.print("Escolha uma opçao: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.println("Idade do cliente: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Digite apenas numeros inteiros para a idade: ");
                        scanner.nextLine();
                    }
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    Cliente cliente = new Cliente();
                    cliente.setCliente(nome, idade);

                    System.out.println("Placa do veiculo: ");
                    String placa = scanner.nextLine();
                    System.out.println("Modelo do veiculo: ");
                    String modelo = scanner.nextLine();

                    System.out.println("Valor da diaria: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Digite apenas numeros para a diaria: ");
                        scanner.nextLine();
                    }
                    double diaria = scanner.nextDouble();
                    scanner.nextLine();

                    Veiculo veiculo = new Veiculo();
                    veiculo.setVeiculo(placa, modelo, diaria);

                    System.out.println("Quantidade de diarias: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Digite apenas numeros inteiros para as diarias: ");
                        scanner.nextLine();
                    }
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
                case "2":
                    System.out.println("Digite o nome do cliente que deseja remover: ");
                    String removeCliente = scanner.nextLine();
                    if (locadora.removerAluguel(removeCliente)) {
                        System.out.println("Cliente removido com sucesso!");
                    } else {
                        System.out.println("Nao foi possivel remover este cliente");
                    }
                    break;
                case "3":
                    System.out.println("Digite o nome do cliente que deseja buscar os alugueis: ");
                    String buscaCliente = scanner.nextLine();

                    Aluguel[] clienteAlugueis = locadora.buscarAluguelCliente(buscaCliente);
                    if (clienteAlugueis.length == 0) {
                        System.out.println("Esse cliente nao possui alugueis.");
                    } else {
                        for (int i = 0; i < clienteAlugueis.length; i++) {
                            int pos = locadora.buscarPosicao(clienteAlugueis[i]);
                            System.out.println("Posicao " + pos + ": " + clienteAlugueis[i]);
                        }
                    }
                    break;
                case "4":
                    System.out.println("O valor arrecadado foi: " + locadora.buscarValorAlugueis());
                    break;
                case "5":
                    locadora.mostrarAlugueis();
                    break;
                case "6":
                    locadora.mostrarRelatorioClientes();
                    break;
                case "99":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("99"));
        scanner.close();
    }
}
