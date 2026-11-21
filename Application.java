import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locadora locadora = new Locadora();
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
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    // Lógica para adicionar aluguel
                    break;
                case 2:
                    // Lógica para remover aluguel
                    break;
                case 3:
                    // Lógica para buscar aluguel por cliente
                    break;
                case 4:
                    // Lógica para buscar posição de aluguel
                    break;
                case 5:
                    // Lógica para buscar valor total de aluguéis
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
