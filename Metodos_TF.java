//Metodos TRabalho Final Alugueis

//Insere um aluguel no vetor
public boolean adicionarAluguel (Aluguel aluguel)
{
    if (aluguel == null || qtdeAlugueis ==  aluguwis.length)
    {
        return false;
    }
    alugueis[qtdeAlugueis] = aluguel;
    qtdeAlugueis++;
    return true;
}
// Remove o primeiro aluguel do cliente e organiza o vetor
public boolean removerAluguel (String nomeCliente)
{
    int pos=-1;
    for (int i = 0; i < qtdeAlugueis; i++)
    {
        if (alugueis[i].getCLiente().getNome().equalsignoreCase(nomeCliente))
        {
            pos = i;
            break;
        }
    }
    if (pos == -1)
    {
        return false;
    }
    for (int i = pos; i <qntdeAlugueis -1; i++)
    {
        alugueis[i] = alugueis[i+1];
    }
    alugueis [qtdeAlugueis -1] = null;
    qtdeAlugueis--;
    return true;
}
//retorna um vetor com todos os alugeis do cliente
public Aluguel[] buscarAluguelCLiente(String nomeCLiente)
{
    int cont = 0;
    for (int i =0 ; i <qntdeAlugueis; i++)
    {
        if (alugueis[i].getCliente().getNome().equalsIgnoreCase(nomeCliente))
        {
            cont++;
        }
    }
    Aluguel [] doCliente= new Aluguel [cont];
    int pos= 0 ;
    for(int i = 0; i<qntdeAlugueis; i++)
    {
        if (alugueis[i].getCliente().getNome().equalsIgnoreCase(nomeCliente))
        {
            doCliente[pos]= alugueis[i];
            pos++;
        }
}
return doCliente;
}
// posição do aluguel no vetor
public int buscarPosi (Aluguel aluguel)
{
    for (int i = 0; i <qntdeAlugueis; i++)
    {
        if (alugueis [i] == aluguel)
        {
            return i;
        }
    }
    return -1;
}

//Soma o valor de todos os alugueis 
pulic double valorAlugueis()
{
    double soma=0;
    for (int i=0; i <qntdeAlugueis; i++)
    {
        soma+= alugueis[i].calcularValor();
    }
    return soma;
}
// mostra todos os alugueis
Public void mostrarAlugueis()
{
    if (qntdeAlugueis == 0)
    {
        System.out.println("Nenhum aluguel cadastrado. ");
    }
    System.outprintln("Alugueis da locadora: ");
    for (int i =0; i < qntdeAlugueis; i++)
    {
        System.out.println("Indice " +i+" | " + alugueis[i]);
    }
}
