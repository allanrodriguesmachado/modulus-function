# 📐 Função Modular – Simulador

## 📘 Descrição

Este projeto tem como objetivo simular o comportamento da função modular (ou valor absoluto), um conceito fundamental em diversas áreas do conhecimento, como matemática, engenharia e computação. A função modular é amplamente utilizada para garantir que um valor seja sempre positivo, independentemente de ser originalmente negativo ou positivo.

Através desta implementação, o projeto visa proporcionar uma melhor compreensão do funcionamento da função modular, especialmente para estudantes e profissionais das áreas de exatas.

---

## ⚙️ Tecnologias Utilizadas

- **Linguagem de Programação**: Java
- **Biblioteca de Testes**: JUnit 5
- **Estrutura de Build**: Maven (para gerenciamento de dependências e execução de testes)

---

## 🧠 Objetivo

O sistema simula a função modular, realizando a leitura de um número inteiro e retornando o seu valor absoluto. A lógica da função é simples:

- Se o número \( x \) for maior ou igual a zero, o resultado será \( x \).
- Se o número \( x \) for negativo, o resultado será o valor de \( -x \), tornando-o positivo.

---

## 🧪 Testes

Para garantir o funcionamento correto da função modular, foi implementada uma suíte de testes utilizando o framework **JUnit 5**. Os testes verificam:

- O comportamento da função com números negativos.
- O comportamento da função com números positivos.
- A precisão ao lidar com números grandes.

Os testes estão localizados no diretório `src/test/java` e podem ser executados através de ferramentas como Maven ou diretamente em uma IDE que suporte JUnit.

---

## 📥 Instruções de Execução

### Pré-requisitos

- **JDK 21 ou superior**: A aplicação foi desenvolvida utilizando Java 21 ou versões mais recentes.
- **Maven**: Utilizado para gerenciar dependências e executar os testes automatizados.

### Passos para execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/usuario/repositorio.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd nome-do-projeto
   ```

3. Compile o projeto utilizando Maven:

   ```bash
   mvn clean install
   ```

4. Para rodar os testes, utilize o seguinte comando:

   ```bash
   mvn test
   ```

5. Para executar o programa, utilize o seguinte comando:

   ```bash
   mvn exec:java
   ```

---

## 📑 Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

