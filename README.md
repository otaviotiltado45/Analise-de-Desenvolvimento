# Análise de Desempenho de Estruturas de Dados em Java

## Descrição do Projeto

Este projeto visa comparar o desempenho de diferentes estruturas de dados (Vetores, Árvores Binárias e Árvores AVL) em Java. A análise inclui tempos de inserção, busca e ordenação para diferentes tamanhos de dados e ordens de inserção.

## Estruturas de Dados Avaliadas

- **Vetores**
- **Árvores Binárias**
- **Árvores AVL**

## Arquivos do Projeto

- **Main.java:** Arquivo principal que executa os testes de desempenho.
- **ArvoreAVL.java:** Implementação da árvore AVL.
- **ArvoreBinaria.java:** Implementação da árvore binária.
- **OperacoesVetor.java:** Métodos para operações em vetores (inserção, busca, ordenação).

## Metodologia

Foram realizados testes com diferentes tamanhos de dados (100, 1000, 10000) e diferentes ordens de inserção (ordenado, invertido, aleatório). Os tempos de inserção, busca e ordenação foram medidos e comparados.

### Testes Realizados

#### Tamanho: 100, Ordem: Ordenado

- **Tempo de Inserção no Vetor:** 300 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 8000 ns
  - Elemento do Meio: 4000 ns
  - Elemento Aleatório: 3000 ns
  - Elemento Inexistente: 9000 ns
- **Tempo de Busca Binária:**
  - Primeiro Elemento: 200 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 200 ns
  - Elemento Inexistente: 300 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 321700 ns
  - QuickSort: 209300 ns
- **Tempo de Inserção na Árvore Binária:** 41800 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 2500 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 500 ns
- **Tempo de Inserção na Árvore AVL:** 17800 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 400 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 500 ns

#### Tamanho: 100, Ordem: Invertido

- **Tempo de Inserção no Vetor:** 300 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 8400 ns
  - Elemento do Meio: 4000 ns
  - Elemento Aleatório: 2800 ns
  - Elemento Inexistente: 9000 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 321000 ns
  - QuickSort: 211000 ns
- **Tempo de Inserção na Árvore Binária:** 39400 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 2700 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 600 ns
- **Tempo de Inserção na Árvore AVL:** 12000 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 300 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 500 ns

#### Tamanho: 100, Ordem: Aleatório

- **Tempo de Inserção no Vetor:** 300 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 9000 ns
  - Elemento do Meio: 4300 ns
  - Elemento Aleatório: 3000 ns
  - Elemento Inexistente: 9000 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 321700 ns
  - QuickSort: 209300 ns
- **Tempo de Inserção na Árvore Binária:** 39000 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 3000 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 400 ns
- **Tempo de Inserção na Árvore AVL:** 1000 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 300 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 500 ns

#### Tamanho: 1000, Ordem: Ordenado

- **Tempo de Inserção no Vetor:** 500 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 109000 ns
  - Elemento do Meio: 51000 ns
  - Elemento Aleatório: 31800 ns
  - Elemento Inexistente: 109500 ns
- **Tempo de Busca Binária:**
  - Primeiro Elemento: 300 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 300 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 160600100 ns
  - QuickSort: 134085600 ns
- **Tempo de Inserção na Árvore Binária:** 102700 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 269600 ns
  - Elemento do Meio: 59000 ns
  - Elemento Aleatório: 39700 ns
  - Elemento Inexistente: 132500 ns
- **Tempo de Inserção na Árvore AVL:** 49200 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 500 ns
  - Último Elemento: 500 ns
  - Elemento do Meio: 500 ns
  - Elemento Aleatório: 400 ns
  - Elemento Inexistente: 500 ns

#### Tamanho: 1000, Ordem: Invertido

- **Tempo de Inserção no Vetor:** 500 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 109300 ns
  - Elemento do Meio: 51000 ns
  - Elemento Aleatório: 31900 ns
  - Elemento Inexistente: 110000 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 160600100 ns
  - QuickSort: 137080300 ns
- **Tempo de Inserção na Árvore Binária:** 101000 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 264600 ns
  - Elemento do Meio: 59000 ns
  - Elemento Aleatório: 40100 ns
  - Elemento Inexistente: 131900 ns
- **Tempo de Inserção na Árvore AVL:** 49200 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 500 ns
  - Último Elemento: 500 ns
  - Elemento do Meio: 500 ns
  - Elemento Aleatório: 400 ns
  - Elemento Inexistente: 500 ns

#### Tamanho: 1000, Ordem: Aleatório

- **Tempo de Inserção no Vetor:** 500 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 109300 ns
  - Elemento do Meio: 51300 ns
  - Elemento Aleatório: 31900 ns
  - Elemento Inexistente: 110200 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 160600300 ns
  - QuickSort: 134082300 ns
- **Tempo de Inserção na Árvore Binária:** 105200 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 3000 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 300 ns
- **Tempo de Inserção na Árvore AVL:** 106900 ns
- **Tempo de Busca na Árvore AVL:

**
  - Primeiro Elemento: 500 ns
  - Último Elemento: 600 ns
  - Elemento do Meio: 500 ns
  - Elemento Aleatório: 400 ns
  - Elemento Inexistente: 600 ns

#### Tamanho: 10000, Ordem: Ordenado

- **Tempo de Inserção no Vetor:** 1600 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 113200 ns
  - Elemento do Meio: 51800 ns
  - Elemento Aleatório: 31400 ns
  - Elemento Inexistente: 114000 ns
- **Tempo de Busca Binária:**
  - Primeiro Elemento: 1600 ns
  - Elemento do Meio: 800 ns
  - Elemento Aleatório: 800 ns
  - Elemento Inexistente: 700 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 158200800 ns
  - QuickSort: 132184600 ns
- **Tempo de Inserção na Árvore Binária:** 14194200 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 300 ns
  - Último Elemento: 650200 ns
  - Elemento do Meio: 176500 ns
  - Elemento Aleatório: 92200 ns
  - Elemento Inexistente: 304000 ns
- **Tempo de Inserção na Árvore AVL:** 4892800 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 500 ns
  - Último Elemento: 800 ns
  - Elemento do Meio: 500 ns
  - Elemento Aleatório: 500 ns
  - Elemento Inexistente: 600 ns

#### Tamanho: 10000, Ordem: Invertido

- **Tempo de Inserção no Vetor:** 500 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 113000 ns
  - Elemento do Meio: 50900 ns
  - Elemento Aleatório: 31200 ns
  - Elemento Inexistente: 114300 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 158186100 ns
  - QuickSort: 152073800 ns
- **Tempo de Inserção na Árvore Binária:** 14225800 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 646000 ns
  - Elemento do Meio: 171000 ns
  - Elemento Aleatório: 88900 ns
  - Elemento Inexistente: 303000 ns
- **Tempo de Inserção na Árvore AVL:** 3220300 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 500 ns
  - Último Elemento: 500 ns
  - Elemento do Meio: 500 ns
  - Elemento Aleatório: 400 ns
  - Elemento Inexistente: 500 ns

#### Tamanho: 10000, Ordem: Aleatório

- **Tempo de Inserção no Vetor:** 500 ns
- **Tempo de Busca Sequencial:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 113000 ns
  - Elemento do Meio: 51700 ns
  - Elemento Aleatório: 31000 ns
  - Elemento Inexistente: 115000 ns
- **Tempo de Ordenação:**
  - Bubble Sort: 158201600 ns
  - QuickSort: 132175300 ns
- **Tempo de Inserção na Árvore Binária:** 100400 ns
- **Tempo de Busca na Árvore Binária:**
  - Primeiro Elemento: 400 ns
  - Último Elemento: 3800 ns
  - Elemento do Meio: 300 ns
  - Elemento Aleatório: 300 ns
  - Elemento Inexistente: 300 ns
- **Tempo de Inserção na Árvore AVL:** 197100 ns
- **Tempo de Busca na Árvore AVL:**
  - Primeiro Elemento: 500 ns
  - Último Elemento: 600 ns
  - Elemento do Meio: 500 ns
  - Elemento Aleatório: 400 ns
  - Elemento Inexistente: 600 ns

## Discussão dos Resultados

Os resultados mostram que a eficiência das operações de inserção, busca e ordenação varia significativamente entre as diferentes estruturas de dados:

- **Vetor:**
  - Inserção: Rápida, especialmente para dados já ordenados ou em ordem aleatória.
  - Busca: A busca sequencial é lenta, especialmente em vetores maiores. A busca binária é eficiente para vetores ordenados.
  - Ordenação: O QuickSort superou o Bubble Sort, especialmente para dados maiores.

- **Árvore Binária:**
  - Inserção: Desempenho inconsistente, com tempos mais altos para grandes volumes de dados, especialmente em ordens não otimizadas.
  - Busca: Lenta, especialmente quando a árvore não está balanceada.

- **Árvore AVL:**
  - Inserção: Consistentemente rápida devido ao balanceamento automático.
  - Busca: Rápida e eficiente devido ao balanceamento, superando a árvore binária e, em muitos casos, o vetor.

## Conclusão

A escolha da estrutura de dados adequada depende do tipo de operação e da natureza dos dados:

- Para buscas rápidas em grandes volumes de dados, a **Árvore AVL** é a mais eficiente.
- Para inserções rápidas em dados ordenados ou aleatórios, o **Vetor** é eficiente, desde que não seja necessário buscar frequentemente.
- Para operações de ordenação, o **QuickSort** é recomendado sobre o Bubble Sort.

Esta análise destaca a importância de considerar tanto o tipo de operação quanto a natureza dos dados ao selecionar uma estrutura de dados para um problema específico.

Este projeto foi desenvolvido para demonstrar as diferenças de desempenho entre várias estruturas de dados e ajudar na escolha da estrutura mais adequada para diferentes tipos de operações.
