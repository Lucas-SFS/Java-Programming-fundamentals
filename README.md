# JAVA-Programming-fundamentals
Programming fundamentals final project | First semester at Pontifícia Universidade Católica do Rio Grande do Sul (PUCRS university).

# Curso: 
Ciência da Computação
# Disciplina: 
Fundamentos de Programação TF – Trabalho Final
# Turma: 
130
# Profª 
Adriana Scherer
# Alunos:
Lucas Samuel Fraga Santos, Caroline Oliveira Alves, 

Uma locadora de veículos contratou sua empresa de desenvolvimento de software para
desenvolver o software que fará o gerenciamento das locações.

Para tanto, criar uma classe chamada Veículo que terá os seguintes atributos: placa (String), modelo (String) e valor diária (double). Crie os métodos básicos para a classe.
 Criar, também, uma classe Cliente que terá os seguintes atributos: nome (String) e idade (int).  Crie os métodos básicos para a classe.

   O Aluguel será uma classe que terá os seguintes atributos: veiculo (Veiculo), cliente (Cliente) e quantidade de diárias (int). Crie os métodos básicos para a classe.

O gerenciamento dos aluguéis deve ser feito na classe Locadora que também deve ser criada. Nesta classe, serão armazenados os aluguéis dos veículos feitos pelos clientes da locadora. Crie um construtor que recebe a quantidade de aluguéis que a locadora irá gerenciar e cria o vetor de aluguéis – você define quantos aluguéis serão gereciados. Além do construtor, esta classe deve ter os seguintes métodos:

A. adicionarAluguel: insere um objeto aluguel no vetor da locadora e para isto, recebe o objeto aluguel e retorna true se a inserção pode ser realizada ou false se a inserção não foi possível;

B. removerAluguel: recebe o nome do cliente e, caso ele tenha um aluguel realizado, o remove do vetor de aluguéis, reorganiza os objetos e retorna true se a remoção foi realizada com sucesso ou false se a remoção não foi possível;

C. buscarAluguelCliente: recebe o nome do cliente e retorna um vetor com todos os aluguéis que este cliente realizou;

D. buscarPosicao: recebe o aluguel e retorna a posição do vetor em que este aluguel está
armazenado. Caso não esteja armazenado, retorna o valor -1;

E. buscarValorAlugueis: retorna o somatório do valor de todos os aluguéis da locadora;

F. mostrarAlugueis: mostra os dados dos aluguéis da locadora.

Crie uma classe Application que deverá ter o método main com as seguintes funcionalidades que deverão acionar o(s) métodos adequados para a realização da operação escolhida.
1 – Adicionar aluguel
2 – Remover aluguel
3 – Mostrar aluguéis de um cliente

Curso: Ciência da Computação
Disciplina: Fundamentos de Programação TF – Trabalho Final
Turma: 130
Alunos: Profª Adriana Scherer
4 – Mostrar valor arrecado com os aluguéis
5 – Mostrar aluguéis
6 – VOCÊ DEFINE E IMPLEMENTA ESTA FUNCIONALIDADE
99 – Sair do programa
Considerações gerais:
1) Seu programa deve executar enquanto a opção de saída (opção 99) não for informada.
2) As opções 1 e 2 (Adicionar/Remover aluguel da locadora) deve mostrar mensagem informando
se a inserção/remoção foi feita com sucesso ou se a inserção/remoção não pode ser efetuada.
3) A opção 2 (Remover aluguel da locadora) remove sempre o primeiro aluguel encontrado, caso
exista;
4) As opções 3 e 4 mostram as consultas, conforme a funcionalidade, caso o critério de busca não
exista (para a opção 3), mostrar mensagem adequada.
5) A opção 6 deve chamar e executar corretamente a funcionalidade que o grupo implementou.
Tenham em mente que a professora não irá abrir o código para entender, portanto, a
usabilidade deve ser levada em consideração. Para esta implementação, não utilizem as
funcionalidades já implementadas nos itens de 1 a 5 do menu. Aproveitem para criar soluções
criativas para este cenário!
