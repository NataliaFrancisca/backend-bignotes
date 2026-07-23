# Tipos de Dados

as variáveis são espaços na memória do computador usados para armazenar valores.

## primitivos

- as **variáveis do tipo primitivos são as mais básicas da linguagem**;
- elas não são objetos;
- são tipos de dados que armazenam um valor simples diretamente na memória.

os tipos são: `byte`, `short`, `int`, `long`, `float`, `double`, `char` e `boolean`.

## mudança do tipo

depois que você declara uma variável com um tipo, você não pode alterar esse tipo

```java
    int num = 5;
    num = "hi";

    String text = "Hello"
    text = 2026;
```

### BOOLEAN
não é um valor numérico, só admite os valores `true` ou `false`.

```java
    boolean isMine = true;
    isMine = false;
```

### CHAR
usa o código `UNICODE` e ocupa cada caractere 16 bits

```java
    char letter = 'A';
    letter = 'B';
```

### INTEIROS
diferem nas precisões e podem ser positivos ou negativos.
- `byte`: 1 byte
- `short`: 2 bytes
- `int`: 4 bytes
- `long`: 8 bytes

```java
        byte phoneB = 123;
        short phoneS = 12345;
        int phoneI = 1234567890;
        long phoneL = 12345678998765432L;
```

### REAIS EM PONTO FLUTUANTE
igual que os inteiros também diferem nas precisões e podem ser positivos ou negativos.

- `float`: 4 bytes
- `double`: 8 bytes

```java
        float priceF = 20.30f;
        double priceD = 200.40;
```
