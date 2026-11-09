public class Locadora {
    private Aluguel[] alugueis;
    private int qtdeAlugueis;

    public Locadora(int capacidadeMaxima) {
        this.alugueis = new Aluguel [capacidadeMaxima];
        this.qtdeAlugueis = 0;  
    }
    public boolean adicionarAluguel(Aluguel aluguel) {
        if (qtdeAlugueis >= alugueis.length) {
            return false;
        }
        alugueis[qtdeAlugueis] = aluguel;
        qtdeAlugueis++;
        return true;
    }
    public boolean removerAluguel (String nomeCliente) {
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
}
