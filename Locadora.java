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
            if (alugueis[i].getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
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

    public Aluguel[] buscarAluguelCliente(String nomeCliente) {
        int cont = 0, posicao = 0;
        for (int i = 0; i < qtdeAlugueis; i++) {
            if (alugueis[i].getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                cont++;
            }
        }
        Aluguel[] alugueisClientes = new Aluguel[cont];
        for (int i = 0; i < qtdeAlugueis; i++) {
            if (alugueis[i].getCliente().getNome().equalsIgnoreCase(nomeCliente)) {
                alugueisClientes[posicao] = alugueis[i];
                posicao++;
            }
        }
        return alugueisClientes;
    }

    public int buscarPosicao(Aluguel aluguel) {
        for (int i = 0; i < qtdeAlugueis; i++) {
            if (alugueis[i].equals(aluguel)) {
                return i;
            }
        }
        return -1;
    }

    public double buscarValorAlugueis() {
        double valorTotal = 0;
        for (int i = 0; i < qtdeAlugueis; i++) {
            valorTotal += alugueis[i].getVeiculo().getDiaria() * alugueis[i].getQtdDiarias();
        }
        return valorTotal;
    }

    public void mostrarAlugueis() {
        if (qtdeAlugueis == 0) {
            System.out.println("Nenhum aluguel cadastrado. ");
        }
        for (int i = 0; i < qtdeAlugueis; i++) {
            System.out.println(alugueis[i].toString());
        }
    }
    
    public void mostrarRelatorioClientes() {
        if (qtdeAlugueis == 0) {
            System.out.println("Nenhum aluguel cadastrado.");
            return;
        }
        String[] nomes = new String[qtdeAlugueis];
        double[] totais = new double[qtdeAlugueis];
        int[] qtdAlugueis = new int[qtdeAlugueis];
        int qtdClientes = 0;
        for (int i = 0; i < qtdeAlugueis; i++) {
            String nome = alugueis[i].getCliente().getNome();
            double valor = alugueis[i].getVeiculo().getDiaria() * alugueis[i].getQtdDiarias();
            int pos = -1;
            for (int j = 0; j < qtdClientes; j++) {
                if (nomes[j].equalsIgnoreCase(nome)) {
                    pos = j;
                    break; 
                }
            }
            if (pos == -1) {
                nomes[qtdClientes] = nome;
                totais[qtdClientes] = valor;
                qtdAlugueis[qtdClientes] = 1;
                qtdClientes++;
            } else {
                totais[pos] += valor;
                qtdAlugueis[pos]++;
            }
        }
        System.out.println("\n===== RELATORIO DE CLIENTES =====");
        int indiceMaior = 0;

        for (int i = 0; i < qtdClientes; i++) {
            System.out.println((i + 1) + ") " + nomes[i] + " | " + qtdAlugueis[i]
                    + " aluguel(eis) | Total gasto: R$ " + totais[i]);
            if (totais[i] > totais[indiceMaior]) {
                indiceMaior = i;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Cliente que mais gastou: " + nomes[indiceMaior]
            + " (R$ " + totais[indiceMaior] + ")");
    }
}
