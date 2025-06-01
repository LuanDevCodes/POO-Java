# Projeto de Demonstração de Programação Orientada a Objetos (POO) - Zoológico

Este projeto em Java foi feito em sala com o objetivo de demonstrar e reforçar os principais pilares da Programação Orientada a Objetos (POO), como Herança, Polimorfismo, Abstração (Interfaces e Classes Abstratas) e Encapsulamento, através de um cenário simples de um zoológico.

---

## 🎯 Conceitos de POO Demonstrados:

* **Abstração (Interfaces e Classes Abstratas):**
    * `Animal.java`: Define a interface `Animal`, que estabelece um "contrato" com os comportamentos básicos `emitirSom()` e `mover()` que todo animal deve possuir.
    * `AnimalBase.java`: É uma classe abstrata `AnimalBase` que implementa a interface `Animal`. Ela serve como a base para todos os animais, gerenciando atributos comuns como `nome` e `idade` de forma encapsulada, e fornecendo um método `exibirInformacoes()`. Os métodos `emitirSom()` e `mover()` são deixados abstratos para que as subclasses os implementem.

* **Encapsulamento:**
    * A classe `AnimalBase` utiliza atributos `private` (`nome` e `idade`) para proteger os dados, expondo eles apenas através do construtor e do método `public void exibirInformacoes()`.

* **Herança (`extends`):**
    * As classes `Cachorro`, `Gato` e `Passaro` **herdam** de `AnimalBase`, reutilizando a estrutura e os atributos definidos na classe base. Isso é indicado por `extends`.

* **Polimorfismo (Sobrescrita de Métodos e Listas):**
    * Cada subclasse (`Cachorro`, `Gato`, `Passaro`) **sobrescreve** os métodos `emitirSom()` e `mover()` definidos em `AnimalBase` (que vêm da interface `Animal`), fornecendo implementações específicas para cada tipo de animal.
    * A classe `Zoologico` demonstra o polimorfismo ao interagir com uma `List<AnimalBase>`. Ela pode chamar `emitirSom()` e `mover()` em qualquer objeto `AnimalBase` na lista, e o comportamento correto (latir, miar, cantar) é executado, dependendo do tipo do objeto (se é um `Cachorro`, `Gato` ou `Passaro`).
    * O uso de `List<AnimalBase>` em `Teste.java` e `Zoologico.java` ilustra como objetos de diferentes subclasses podem ser tratados de forma uniforme através de sua superclasse comum.

---

## 📂 Como funciona a estrutura do projeto:

* `Animal.java`: Interface que define o comportamento básico de um animal.
* `AnimalBase.java`: Classe abstrata que implementa `Animal`, gerencia atributos comuns e serve como base para animais específicos.
* `Cachorro.java`: Implementação de um cachorro, estendendo `AnimalBase`.
* `Gato.java`: Implementação de um gato, estendendo `AnimalBase`.
* `Passaro.java`: Implementação de um pássaro, estendendo `AnimalBase`.
* `Zoologico.java`: Classe responsável por interagir com uma coleção de animais e mostrar seus comportamentos.
* `Teste.java`: Classe principal com o método `main` para demonstrar a criação dos animais e a interação com o `Zoologico`.

---

## 🛠️ Tecnologias Utilizadas:

* **Java**
* **Programação Orientada a Objetos (POO)**

---
