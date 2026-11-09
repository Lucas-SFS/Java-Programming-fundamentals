

public class Aluguel {

        private Veiculo veiculo;
        private Cliente cliente;
        private int qtdDiarias;

        public void setAluguel(Veiculo veiculo, Cliente cliente, int qtdDiarias) {
            this.veiculo = veiculo;
            this.cliente = cliente;
            this.qtdDiarias = qtdDiarias;
        }

        public Veiculo getVeiculo() {
            return veiculo;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public int getQtdDiarias() {
            return qtdDiarias;
        }

        public String toString() {
            return "Veiculos: " + veiculo + ", clientes: " + cliente + ", quantidade de diarias: " + qtdDiarias + ".";
        }
    }
