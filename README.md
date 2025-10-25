# 🧩 Estruturas de Dados em Java -- Listas Encadeadas

## 📘 Descrição do Projeto

Este projeto foi desenvolvido como parte da disciplina **Estrutura de
Dados** no **Centro Universitário Santo Agostinho**.\
O objetivo é implementar manualmente três tipos de **listas encadeadas**
em Java, sem o uso de coleções prontas (`ArrayList`, `LinkedList`,
etc.), aplicando os conceitos de **nós e ponteiros**.

Cada lista possui as operações básicas: - **Inserção** - **Remoção** -
**Busca** - **Listagem**

------------------------------------------------------------------------

## 🗂 Estrutura do Repositório

    /EstruturasDeDados
     ├── /ListaSimples
     │     ├── No.java
     │     ├── ListaSimples.java
     │     └── MainListaSimples.java
     │
     ├── /ListaDupla
     │     ├── NoDuplo.java
     │     ├── ListaDupla.java
     │     └── MainListaDupla.java
     │
     ├── /ListaCircular
     │     ├── NoCircular.java
     │     ├── ListaCircular.java
     │     └── MainListaCircular.java
     │
     └── README.md

------------------------------------------------------------------------

## ⚙️ Requisitos

-   Java 17 ou superior\
-   IDE de sua preferência (IntelliJ IDEA, NetBeans, Eclipse ou VS Code)

------------------------------------------------------------------------

## ▶️ Como Executar

1.  **Clone o repositório**:

    ``` bash
    git clone https://github.com/seuusuario/listas-encadeadas-java.git
    ```

2.  **Abra o projeto** na sua IDE.

3.  **Execute a classe `Main`** desejada:

    -   `ListaSimples/MainListaSimples.java`
    -   `ListaDupla/MainListaDupla.java`
    -   `ListaCircular/MainListaCircular.java`

4.  **Siga o menu interativo** no console para realizar as operações:

        1 - Inserir
        2 - Buscar
        3 - Remover
        4 - Listar
        0 - Sair

------------------------------------------------------------------------

## 🧠 Explicação das Estruturas

### 🔹 Lista Encadeada Simples

-   Cada nó aponta apenas para o **próximo**.
-   Percorrida apenas no sentido **frente → trás**.
-   Estrutura leve e fácil de implementar.

Exemplo visual:

    [10] → [20] → [30] → null

------------------------------------------------------------------------

### 🔸 Lista Duplamente Encadeada

-   Cada nó aponta para o **anterior e o próximo**.
-   Permite percorrer a lista **nos dois sentidos**.
-   Facilita inserções e remoções no meio da lista.

Exemplo visual:

    null ← [10] ↔ [20] ↔ [30] → null

------------------------------------------------------------------------

### 🔁 Lista Encadeada Circular

-   O último nó aponta novamente para o **primeiro**, formando um
    **ciclo**.
-   Ideal para listas **cíclicas** (ex: playlists ou filas circulares).

Exemplo visual:

    [10] → [20] → [30]
       ↑           ↓
       └───────────┘

------------------------------------------------------------------------

## 📊 Comparativo das Estruturas

  ------------------------------------------------------------------------
  Tipo de Lista Ligações por   Direção   Último aponta    Vantagem
                nó                       para             Principal
  ------------- -------------- --------- ---------------- ----------------
  Simples       Próximo        Frente    `null`           Estrutura
                                                          simples e leve

  Dupla         Próximo e      Ambos     `null`           Inserção e
                Anterior                                  remoção mais
                                                          fáceis

  Circular      Próximo (ou    Cíclica   Primeiro         Ideal para
                ambos)                                    ciclos contínuos
  ------------------------------------------------------------------------

------------------------------------------------------------------------

## 💬 Exemplo de Execução

    --- LISTA ENCADEADA SIMPLES ---
    1 - Inserir no início
    2 - Inserir no fim
    3 - Buscar
    4 - Remover
    5 - Listar
    0 - Sair
    Escolha: 1
    Valor: 10
    Escolha: 2
    Valor: 20
    Lista: 10 20

------------------------------------------------------------------------

## 🏗️ Desenvolvido por

**Aluno:** *\[Seu Nome\]*\
**Curso:** Engenharia de Software\
**Disciplina:** Estrutura de Dados\
**Professor:** *\[Nome do Professor\]*

------------------------------------------------------------------------

## 🎥 Vídeo Demonstrativo

🔗 Link: <https://youtu.be/seu-video-explicativo>

------------------------------------------------------------------------

## 💡 Observações

-   Nenhuma estrutura pronta da API Java foi utilizada.\
-   Todo o gerenciamento de nós foi feito manualmente com referências
    (`next` / `previous`).\
-   Código comentado e organizado conforme boas práticas de POO.

------------------------------------------------------------------------

📅 **Entrega:** até **24/10/2025**\
🏆 **Bônus:** +0,5 ponto se incluir interface gráfica (GUI)
