# HuffmanProject

Implementação em Java do **Algoritmo de Compressão de Dados usando Huffman**.

Este projeto lê um texto de um arquivo, constrói a árvore de Huffman, gera códigos binários para cada caractere, codifica e decodifica o texto, demonstrando o funcionamento completo do algoritmo.

---

## ✅ Como funciona?

1. Conta a frequência de cada caractere do texto.
2. Constrói a árvore binária de Huffman.
3. Gera códigos binários otimizados para cada caractere.
4. Codifica o texto original em uma sequência de bits.
5. Decodifica a sequência de bits para recuperar o texto original.

---

## ✅ Estrutura do Projeto


- `HuffmanNode.java`: Classe que representa um nó da árvore.
- `HuffmanCoding.java`: Classe que implementa os métodos de construção da árvore, codificação e decodificação.
- `Main.java`: Classe principal que executa o programa.
- `input.txt`: Arquivo de entrada com o texto a ser comprimido.

---

## ✅ Como rodar o projeto

### ⚠️ Pré-requisitos:

- Java JDK (versão 8 ou superior, recomendado 17+).
- Visual Studio Code ou qualquer editor/IDE de sua preferência.

### ⚙️ Passos:

1. Clone ou baixe o projeto.
2. Abra o terminal na pasta `HuffmanProject`.

```bash
cd src

javac *.java

java Main

## este é um exemplo de compressão usando huffman

Códigos Huffman:
' ' : 00
'e' : 01
's' : 100
...

Texto Original:
este é um exemplo de compressão usando huffman

Texto Codificado:
010010010...

Texto Decodificado:
este é um exemplo de compressão usando huffman


