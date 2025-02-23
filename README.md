# Jogo da Velha em Java

## 📖 Sobre
Este projeto é uma implementação simples do clássico **Jogo da Velha** em Java. Ele foi desenvolvido como um exercício de lógica de programação, Programação Orientada a Objetos (POO), tratamento de exceções e boas práticas na linguagem Java.


## ✅ Pré-requisitos
Antes de executar o projeto, certifique-se de ter instalado:
- **Java JDK 11 ou superior**.
- **Um terminal ou IDE compatível (VS Code, IntelliJ, Eclipse, etc.)**.

## 🚀 Como Executar o Projeto
### 🔹 No Git Bash
   1. Clone este repositório:
      ```sh
      git clone https://github.com/RanieleFeitosa/Jogo-da-velha.git
      ```
   2. Acesse o diretório do projeto:
      ```sh
      cd Jogo-da-velha
      cd src
      ```
   3. Compile o código-fonte:
      ```sh
      javac jogo/Programa.java
      ```
   4. Execute o programa:
      ```sh
      java jogo.Programa
      ```
### 🔹 Caso prefira rodar o projeto em uma IDE como **IntelliJ IDEA** ou **Eclipse**:  

1. **Importe o projeto** na sua IDE preferida.  
2. **Certifique-se de que o JDK 17 está configurado corretamente.**  

3. **Execute a classe `Programa.java` diretamente na IDE.**  


## 📌 Funcionalidades
- O jogo utiliza uma matriz 3x3 para representar o tabuleiro.
- Cada posição é determinada por um número de 1 a 9 (posições disponíveis).
- O jogo permite que dois jogadores se enfrentem alternadamente, marcando as posições com "X" ou "O".
- O jogo verifica automaticamente a cada rodada se houve um vencedor ou empate.
- O jogo controla erros para garantir que as jogadas sejam válidas.


## 🎮 Exemplo de execução:


Insira os números correspondentes às posições do tabuleiro quando solicitado.


```
================
| 1  | 2  | 3  |
| 4  | 5  | 6  |
| 7  | 8  | 9  |
================
Tentativa X: 5
================
| 1  | 2  | 3  |
| 4  | X  | 6  |
| 7  | 8  | 9  |
================
Tentativa O: 7
================
| 1  | 2  | 3  |
| 4  | X  | 6  |
| O  | 8  | 9  |
================
```

E assim por diante, até que haja um vencedor ou empate.


