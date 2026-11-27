------------------------------------------------------------------------

PROJETO: Sistema de Gerenciamento de Locadora de Veículos

DISCIPLINA: Fundamentos de Programação (Turma 130)

PROFESSORA: Adriana Scherer

INSTITUIÇÃO: PUCRS - Escola Politécnica (Ciência da Computação, Ciencia de Dados e Inteligencia Artificial)

------------------------------------------------------------------------



1. AUTORES DO TRABALHO

- Nome completo: Caroline Oliveira Alves | Matrícula: 26201639

- Nome completo: Nina Laura dos Santos Monteiro | Matrícula: 25101316

- Nome completo: Lucas Samuel Fraga Santos | Matrícula: 26204063



2. LINK DO VÍDEO PITCH (YOUTUBE - NÃO LISTADO)

- URL: https://youtu.be/R-p1T-QOSmA


3. DESCRIÇÃO GERAL E FUNCIONALIDADE EXTRA (OPÇÃO 6)

O sistema gerencia locações de veículos utilizando orientação a objetos em Java (classes Veiculo, Cliente, Aluguel, Locadora e Application), armazenando os registros em um vetor estático na classe Locadora.



Funcionalidade Extra Implementada (Opção 6 - Relatório de Clientes):

Para atender ao requisito de inovação sem reutilizar os métodos das opções 1 a 5, criamos o método mostrarRelatorioClientes(). Ele percorre os aluguéis ativos, agrupa os registros por cliente (ignorando diferenças entre maiúsculas e minúsculas), contabiliza a quantidade de locações e o valor total gasto por cada um, e destaca ao final o cliente que gerou maior faturamento para a locadora.



4. FONTES DE CONSULTA E AJUDA UTILIZADAS

- Material de aula e slides da disciplina de Fundamentos de Programação, para estruturação de classes, getters/setters e manipulação de vetores de objetos.

- Monitoria / Colegas / Familiares: Não houve consulta a terceiros além do material da disciplina e da ferramenta de IA descrita abaixo.



5. USO DE INTELIGÊNCIA ARTIFICIAL (IA)

- Ferramenta utilizada: Google Gemini (https://gemini.google.com/)

- Justificativa do uso: A IA foi utilizada como ferramenta de revisão de código, depuração de erros de lógica/compilação e validação dos requisitos do enunciado após o desenvolvimento inicial da estrutura feita pelo grupo. O recurso auxiliou na identificação de falhas de leitura no buffer do teclado (Scanner), na validação de entradas inválidas sem interromper a execução do programa e no alinhamento do menu às especificações do trabalho.



- Sequência de prompts e evolução/refinos realizados:

  1) Prompt inicial: Envio da classe Aluguel solicitando revisão para o Trabalho Final.

     -> Refino: Verificação da estrutura de atributos e métodos básicos (getters, setters e toString).

  2) Segundo prompt: Envio de todas as classes criadas pelo grupo (Aluguel, Cliente, Veiculo, Locadora e Application) junto com o PDF do enunciado para verificação geral.

     -> Refino: Identificação de erro de compilação no método mostrarRelatorioClientes() (chamada de getValorDiaria() em vez de getDiaria()), correção do cálculo do valor total em buscarValorAlugueis() (multiplicando o valor da diária pela quantidade de diárias), inserção de scanner.nextLine() para evitar o salto de leitura da placa após ler a idade, e ajuste da numeração do menu (opções 1 a 6 e 99 para sair).



6. DIFICULDADES ENCONTRADAS E COMO FORAM SUPERADAS

- Manipulação e reorganização de vetores de objetos: Ao remover um aluguel no meio do vetor (método removerAluguel), foi necessário deslocar todos os elementos subsequentes uma posição para trás e anular a última posição para evitar buracos ou referências duplicadas. Superamos esse desafio desenhando os índices no papel antes de implementar o laço for aninhado.

- Agrupamento de dados sem coleções avançadas: Na funcionalidade extra (opção 6), precisávamos agrupar gastos por cliente utilizando apenas arrays tradicionais. Resolvemos criando vetores auxiliares paralelos (nomes, totais e quantidades) controlados por um contador de clientes únicos.

- Problemas de buffer e entradas inválidas no Scanner: Ao misturar nextInt() com nextLine(), o programa pulava campos de texto ou travava se o usuário digitasse letras em campos numéricos. Superamos limpando o buffer após leituras numéricas e validando o tipo de entrada com hasNextInt() e hasNextDouble().



7. LIÇÕES APRENDIDAS

- Importância da modularização e encapsulamento: Separar as responsabilidades entre as classes de modelo (Cliente, Veiculo, Aluguel), a classe gerenciadora (Locadora) e a interface com o usuário (Application) tornou o código muito mais fácil de testar e corrigir.

- Pensar na usabilidade e na prevenção de erros do usuário: Aprendemos que não basta o código funcionar apenas com entradas perfeitas; validar o que o usuário digita e exibir mensagens claras é essencial para entregar um software confiável.
