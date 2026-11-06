
public class Classes {

    public class Veiculo {

        private String placa;
        private String modelo;
        private double diaria;

        public void setVeiculo(String placa, String modelo, double diaria) {
            this.placa = placa;
            this.modelo = modelo;
            this.diaria = diaria;
        }

        public String toString() {
            return "Placa do carro: " + placa + ", modelo: " + modelo + ", diaria: " + diaria + ".";
        }
    }

    public class Cliente {

        private String nome;
        private int idade;

        public void setCliente(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String toString() {
            return "Nome do cliente: " + nome + ", idade do cliente: " + idade + ".";
        }

    }

    public class aluguel {

        private Veiculo veiculo;
        private Cliente cliente;
        private int qtdDiarias;

        public void setAluguel(Veiculo veiculo, Cliente cliente, int qtdDiarias) {
            this.veiculo = veiculo;
            this.cliente = cliente;
            this.qtdDiarias = qtdDiarias;
        }

        public String toString() {
            return "Veiculos: " + veiculo + ", clientes: " + cliente + ", quantidade de diarias: " + qtdDiarias + ".";
        }
    }
//Recebe os metodos criadoss

    public class Locadora {

        // O gerenciamento dos aluguéis deve ser feito na classe Locadora que também deve ser criada. Nesta classe, serão armazenados os aluguéis dos veículos feitos pelos clientes da locadora. Crie um construtor que recebe a quantidade de aluguéis que a locadora irá gerenciar e cria o vetor de aluguéis – você define quantos aluguéis serão gereciados. Além do construtor, esta classe deve ter os seguintes métodos:
    }
}
