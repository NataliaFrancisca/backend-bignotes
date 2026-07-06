# JAVA BIGNOTES

repositórios dos meus estudos de java

|🚨esse roadmap de estudos foi gerado por IA.

## 🐤 fundamentos do java

### sintaxe básica e tipos de dados

- [ ] tipos primitivos (int, double, boolean, char, etc.) vs. Tipos de referência (Strings, Arrays, Objetos).
- [ ]  declaração de variáveis e inferência de tipo (`var` a partir do Java 10).
- [ ]  operadores matemáticos, lógicos e relacionais.

### estruturas de controle de fluxo

- [ ]  condicionais: `if`, `else if`, `else`, `switch` (incluindo o novo *switch expressions*).
- [ ]  estruturas de repetição: `for`, `while`, `do-while` e `enhanced for` (for-each).

### programação orientada a objetos (POO) - base

- [ ]  definição de Classes e Objetos.
- [ ]  atributos e Métodos (comportamentos).
- [ ]  construtores (padrão e sobrecarregados).
- [ ]  modificadores de Acesso (`public`, `private`, `protected`, `default`).
- [ ]  encapsulamento (Getters e Setters).

### programação orientada a objetos (POO) - avançado

- [ ]  herança (palavra-chave `extends`).
- [ ]  polimorfismo (Sobrecarga e Sobrescrita - `@Override`).
- [ ]  classes Abstratas e Interfaces (`implements`).
- [ ]  diferença entre associação, agregação e composição.

### gerenciamento de memória e ciclo de vida

- [ ]  como o Java gerencia a memória: Entendendo a diferença entre a **Stack** (pilha de execução) e o **Heap** (onde os objetos vivem).
- [ ]  o funcionamento básico do Garbage Collector (como o Java limpa objetos sem referência para liberar memória).

### gerenciamento de memória e ciclo de vida

- [ ]  a hierarquia de erros (`Throwable`, `Error`, `Exception`).
- [ ]  a diferença prática e teórica entre **Checked Exceptions** (exceções checadas em tempo de compilação) e **Unchecked Exceptions** (erros de tempo de execução).
- [ ]  como usar blocos `try`, `catch` e `finally`.
- [ ]  a palavra-chave `throws` na assinatura de métodos e como lançar suas próprias exceções (`throw new...`).
- [ ]  uso do *Try-with-resources* para fechamento automático de recursos.

### coleções e manipulação de dados
- [ ]  arrays nativos (vetores e matrizes).
- [ ]  a API de *Collections*: Diferenças entre `List`, `Set` e `Map`.
- [ ]  implementações mais comuns (`ArrayList`, `HashSet`, `HashMap`).



## 🐤 atividades e exercícios

### exercício 1 → sintaxe e fluxo

**o desafio:** Crie um programa de terminal que simule um caixa eletrônico simples.

**requisitos:** O programa deve começar com um saldo inicial. O usuário pode escolher em um menu (usando `switch`) se deseja ver o saldo, sacar, depositar ou sair. Use `while` para manter o programa rodando até o usuário escolher sair. Valide para não permitir saques maiores que o saldo (usando `if/else`).


### exercício 2 → poo e memória

**o desafio:** Crie um sistema de gestão para um time esportivo.

**requisitos:** Crie classes para `Jogador`, `Time` e `Treinador`. Pratique o encapsulamento tornando os atributos privados e criando métodos para, por exemplo, transferir um jogador de um time para outro. Crie vários objetos dessas classes e observe como eles interagem. Tente entender como essas instâncias estão sendo alocadas no *Heap*.

### exercício 3 → checked exceptions e leitura/escrita

**o desafio:** Desenvolva um programa que tente ler um arquivo `.txt` contendo logs fictícios de um sistema.

**requisitos:** Aqui você deve provocar e tratar ativamente as *checked exceptions*. Tente abrir um arquivo que não existe para forçar uma `FileNotFoundException`. Depois, leia um arquivo válido linha por linha usando classes como `BufferedReader` ou `Scanner`. O objetivo é encapsular a lógica de leitura dentro de um bloco `try-with-resources` para garantir que o arquivo seja fechado adequadamente, lidando com a `IOException` que o compilador do Java te obriga a tratar.