

public class Cliente {

        private String nome;
        private int idade;

        public void setCliente(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String toString() {
            return "Nome do cliente: " + nome + ", idade do cliente: " + idade + ".";
        }

    }
