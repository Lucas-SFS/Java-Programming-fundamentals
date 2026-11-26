RELATORIO DE CLIENTES
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
            double valor = alugueis[i].getVeiculo().getValorDiaria() * alugueis[i].getQtdDiarias();
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
