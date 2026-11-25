
public class Locadora {

    private Aluguel[] alugueis;
    private int qtdeAlugueis;

    public Locadora(int capacidadeMaxima) {
        this.qtdeAlugueis = 0;
        this.alugueis = new Aluguel[capacidadeMaxima];
    }

    public boolean adicionarAluguel(Aluguel aluguel) {
        if (qtdeAlugueis >= alugueis.length) {
            return false;
        }
        alugueis[qtdeAlugueis] = aluguel;
        qtdeAlugueis++;
        return true;
    }

    public boolean removerAluguel(String nomeCliente) {
        for (int i = 0; i < qtdeAlugueis; i++) {
            if (alugueis[i].getCliente().getNome().equals(nomeCliente)) {
                for (int j = i; j < qtdeAlugueis - 1; j++) {
                    alugueis[j] = alugueis[j + 1];
                }
                alugueis[qtdeAlugueis - 1] = null;
                qtdeAlugueis--;
                return true;
            }
        }
        return false;
    }

    //1 buscarAluguelCliente: recebe o nome do cliente e retorna um vetor 
    //com todos os aluguéis que este cliente realizou;
    public Aluguel[] buscarAluguelCliente(String nomeCliente) {
        int cont = 0, posicao = 0;
        for (int i = 0; i < qtdeAlugueis; i++) {
            if (alugueis[i].getCliente().getNome().equals(nomeCliente)) {
                cont++;
            }
        }
        Aluguel[] alugueisClientes = new Aluguel[cont];
        for (int i = 0; i < qtdeAlugueis; i++) {
            if (alugueis[i].getCliente().getNome().equals(nomeCliente)) {
                alugueisClientes[posicao] = alugueis[i];
                posicao++;
            }
        }
        return alugueisClientes;
    }

    //2 buscarPosicao: recebe o aluguel e retorna a posição do vetor em que este aluguel está
    //armazenado. Caso não esteja armazenado, retorna o valor -1;
    public int buscarPosicao(Aluguel cliente) {
        for (int i = 0; i < qtdeAlugueis; i++) {
            if (alugueis[i].equals(cliente)) {
                return i;
            }
        }
        return -1;
    }

    //3 buscarValorAlugueis: retorna o somatório do valor de todos os aluguéis da locadora;
    public double buscarValorAlugueis() {
        double valorTotal = 0;
        for (int i = 0; i < qtdeAlugueis; i++) {
            valorTotal += alugueis[i].getVeiculo().getDiaria();
        }
        return valorTotal;
    }

    //4 mostrarAlugueis: mostra os dados dos aluguéis da locadora
    public void mostrarAlugueis() {
        if (qtdeAlugueis == 0) {
            System.out.println("Nenhum aluguel cadastrado. ");
        }
        for (int i = 0; i < qtdeAlugueis; i++) {
            System.out.println(alugueis[i].toString());
        }
    }
}
