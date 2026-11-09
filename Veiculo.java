
public class Veiculo {

        private String placa;
        private String modelo;
        private double diaria;

        public void setVeiculo(String placa, String modelo, double diaria) {
            this.placa = placa;
            this.modelo = modelo;
            this.diaria = diaria;
        }

        public String getPlaca() {
            return placa;
        }

        public String getModelo() {
            return modelo;
        }

        public double getDiaria() {
            return diaria;
        }

        public String toString() {
            return "Placa do carro: " + placa + ", modelo: " + modelo + ", diaria: " + diaria + ".";
        }
    }
