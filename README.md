# 🚗 Sistema de Mobilidade Urbana (Ride-Sharing)

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos da Universidade de Brasília (UnB), com o objetivo de simular um sistema de corridas semelhante a aplicativos de mobilidade urbana (ex: Uber).

## 📌 Objetivo

Aplicar conceitos fundamentais de Programação Orientada a Objetos (POO), incluindo:

* Encapsulamento
* Herança
* Polimorfismo
* Associações entre classes
* Tratamento de exceções customizadas

## 🛠️ Tecnologias utilizadas

* Java
* Bibliotecas padrão:

  * java.util
  * java.time

## 🧠 Conceitos de POO aplicados

### 🔹 Encapsulamento

Uso de atributos privados com métodos getters e setters para controle de acesso e integridade dos dados.

### 🔹 Herança

Reutilização de código através de hierarquias:

* Usuario → Passageiro e Motorista
* Categoria → Comum e Luxo

### 🔹 Polimorfismo

* Método calcularPreco() definido na classe Categoria com comportamento dependente da subclasse
* Interface MetodoPagamento com múltiplas implementações (Pix, Cartão, Dinheiro)

### 🔹 Associações entre classes

* Passageiro ↔ Corrida (um para muitos)
* Motorista ↔ Veículo (relação exclusiva)
* Corrida → Categoria (definição de preço)

### 🔹 Exceções customizadas

Implementação de exceções específicas para controle de fluxo e validação de regras de negócio, como:

* NenhumMotoristaDisponivelException
* PagamentoRecusadoException
* SaldoInsuficienteException
* EstadoInvalidoDaCorridaException

## ⚙️ Funcionalidades

* Cadastro de usuários (passageiros e motoristas)
* Associação de motoristas a veículos
* Solicitação e gerenciamento de corridas
* Cálculo de preço com base na categoria e distância
* Simulação de disponibilidade de motoristas
* Processamento de pagamento com diferentes métodos
* Tratamento de erros com exceções específicas

## ▶️ Como executar

1. Clone o repositório:
   git clone https://github.com/selksi/Sistema_de_Mobilidade_Urbana.git

2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code)

3. Execute a classe principal do projeto

## 📊 Estrutura do sistema

O sistema é dividido em principais entidades:

* Usuário (Passageiro / Motorista)
* Veículo
* Corrida
* Categoria (Comum / Luxo)
* Métodos de pagamento

## 👥 Equipe

* Samuel Carvalho de Sousa
* Lucas Abdalla Nery
* Thomaz Marra Martins

## 📎 Documentação

O diagrama de classes UML está disponível na pasta docs do repositório.

## 📈 Possíveis melhorias

* Integração com API de mapas para cálculo real de distância
* Interface gráfica (GUI)
* Persistência de dados (banco de dados)
* Sistema de avaliação de motoristas e passageiros
