# 🧵 Soma de Vetores com Multithreading em Java

Projeto desenvolvido para a disciplina de Sistemas Operacionais do curso de **Análise e Desenvolvimento de Sistemas** na **Universidade Presbiteriana Mackenzie**.

## 📝 Descrição
O objetivo deste programa é realizar a soma de todos os elementos de um vetor de **100 posições** utilizando o conceito de **Multithreading**. O trabalho é dividido entre duas threads independentes, onde cada uma processa metade do vetor, otimizando a execução.

## 🚀 Tecnologias Utilizadas
* **Java 21** (ou superior)
* **IntelliJ IDEA**
* **Git/GitHub**

## ⚙️ Como funciona
1.  O programa inicializa um vetor de inteiros com valores de 1 a 100.
2.  Duas instâncias da classe `Somador` são criadas:
    * **Thread 1:** Soma os índices de 0 a 49.
    * **Thread 2:** Soma os índices de 50 a 99.
3.  O método `join()` é utilizado para garantir que a `Main` aguarde a finalização de ambas as threads.
4.  O resultado final consolidado é exibido no console (Soma esperada: 5050).

## 👨‍💻 Autor
* **Vinicius** - Estudante de ADS no Mackenzie.
* Foco em: Cybersecurity e Dados.