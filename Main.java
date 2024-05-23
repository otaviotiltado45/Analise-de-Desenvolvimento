import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tamanhos = {100, 1000, 10000};
        String[] ordens = {"Ordenado", "Invertido", "Aleatorio"};
        
        for (int tamanho : tamanhos) {
            for (String ordem : ordens) {
                int[] dados = gerarDados(tamanho, ordem);
                System.out.println(" ");
                System.out.println("Tamanho: " + tamanho + ", Ordem: " + ordem);
                
                medirDesempenhoVetor(dados);
                medirDesempenhoArvoreBinaria(dados);
                medirDesempenhoArvoreAVL(dados);
                
                System.out.println();
            }
        }
    }

    private static int[] gerarDados(int tamanho, String ordem) {
        int[] dados = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            dados[i] = i;
        }
        
        if (ordem.equals("Invertido")) {
            for (int i = 0; i < tamanho / 2; i++) {
                int temp = dados[i];
                dados[i] = dados[tamanho - i - 1];
                dados[tamanho - i - 1] = temp;
            }
        } else if (ordem.equals("Aleatorio")) {
            Random rand = new Random();
            for (int i = 0; i < tamanho; i++) {
                int indiceAleatorio = rand.nextInt(tamanho);
                int temp = dados[indiceAleatorio];
                dados[indiceAleatorio] = dados[i];
                dados[i] = temp;
            }
        }
        
        return dados;
    }

    private static void medirDesempenhoVetor(int[] dados) {
        int[] vetor = new int[dados.length];
        
        // Inserção
        long tempoInicial = System.nanoTime();
        OperacoesVetor.inserir(vetor, dados);
        long tempoFinal = System.nanoTime();
        System.out.println(" ");
        System.out.println("Tempo de Insercao no Vetor: " + (tempoFinal - tempoInicial) + " ns");
        
        // Busca
        medirTemposDeBusca(vetor);
        
        // Ordenação
        int[] vetorCopia = Arrays.copyOf(vetor, vetor.length);

        // Bubble Sort
        tempoInicial = System.nanoTime();
        OperacoesVetor.bubbleSort(vetorCopia);
        tempoFinal = System.nanoTime();
        System.out.println(" ");
        System.out.println("Tempo de Ordenacao (Bubble Sort): " + (tempoFinal - tempoInicial) + " ns");

        // QuickSort
        vetorCopia = Arrays.copyOf(vetor, vetor.length);
        tempoInicial = System.nanoTime();
        OperacoesVetor.quickSort(vetorCopia, 0, vetorCopia.length - 1);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Ordenacao (QuickSort): " + (tempoFinal - tempoInicial) + " ns");
    }

    private static void medirTemposDeBusca(int[] dados) {
        int primeiroElemento = dados[0];
        int ultimoElemento = dados[dados.length - 1];
        int elementoDoMeio = dados[dados.length / 2];
        Random rand = new Random();
        int elementoAleatorio = dados[rand.nextInt(dados.length)];
        int elementoInexistente = -1;

        long tempoInicial, tempoFinal;

        // Busca Sequencial
        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaSequencial(dados, primeiroElemento);
        tempoFinal = System.nanoTime();
        System.out.println(" ");
        System.out.println("Tempo de Busca Sequencial (Primeiro Elemento): " + (tempoFinal - tempoInicial) + " ns");

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaSequencial(dados, ultimoElemento);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca Sequencial (Ultimo Elemento): " + (tempoFinal - tempoInicial) + " ns");

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaSequencial(dados, elementoDoMeio);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca Sequencial (Elemento do Meio): " + (tempoFinal - tempoInicial) + " ns");

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaSequencial(dados, elementoAleatorio);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca Sequencial (Elemento Aleatorio): " + (tempoFinal - tempoInicial) + " ns");

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaSequencial(dados, elementoInexistente);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca Sequencial (Elemento Inexistente): " + (tempoFinal - tempoInicial) + " ns");

        // Busca Binária (somente para vetores ordenados)
        Arrays.sort(dados); // Certificando que o vetor está ordenado

        // Para dados aleatórios e invertidos, exibir resultados nulos na busca binária
        if (dados[0] != primeiroElemento || dados[dados.length - 1] != ultimoElemento) {
            System.out.println("Tempo de Busca Binaria (Primeiro/Ultimo/Elemento Inexistente): Nulo");
            return;
        }

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaBinaria(dados, primeiroElemento);
        tempoFinal = System.nanoTime();
        System.out.println(" ");
        System.out.println("Tempo de Busca Binaria (Primeiro Elemento): " + (tempoFinal - tempoInicial) + " ns");

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaBinaria(dados, elementoDoMeio);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca Binaria (Elemento do Meio): " + (tempoFinal - tempoInicial) + " ns");

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaBinaria(dados, elementoAleatorio);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca Binaria (Elemento Aleatorio): " + (tempoFinal - tempoInicial) + " ns");

        tempoInicial = System.nanoTime();
        OperacoesVetor.buscaBinaria(dados, elementoInexistente);
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca Binaria (Elemento Inexistente): " + (tempoFinal - tempoInicial) + " ns");
    }

    private static void medirDesempenhoArvoreBinaria(int[] dados) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Inserção
        long tempoInicial = System.nanoTime();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long tempoFinal = System.nanoTime();
        System.out.println(" ");
        System.out.println("Tempo de Insercao na Arvore Binaria: " + (tempoFinal - tempoInicial) + " ns");

        // Busca
        medirTemposDeBuscaNaArvore(arvore, dados);
    }

    private static void medirDesempenhoArvoreAVL(int[] dados) {
        ArvoreAVL arvore = new ArvoreAVL();

        // Inserção
        long tempoInicial = System.nanoTime();
        for (int valor : dados) {
            arvore.inserir(valor);
        }
        long tempoFinal = System.nanoTime();
        System.out.println(" ");
        System.out.println("Tempo de Insercao na Arvore AVL: " + (tempoFinal - tempoInicial) + " ns");

        // Busca
        medirTemposDeBuscaNaArvore(arvore, dados);
    }

    private static void medirTemposDeBuscaNaArvore(Object arvore, int[] dados) {
        int primeiroElemento = dados[0];
        int ultimoElemento = dados[dados.length - 1];
        int elementoDoMeio = dados[dados.length / 2];
        Random rand = new Random();
        int elementoAleatorio = dados[rand.nextInt(dados.length)];
        int elementoInexistente = -1;

        long tempoInicial, tempoFinal;

        // Busca do primeiro elemento
        tempoInicial = System.nanoTime();
        if (arvore instanceof ArvoreBinaria) {
            ((ArvoreBinaria) arvore).buscar(primeiroElemento);
        } else if (arvore instanceof ArvoreAVL) {
            ((ArvoreAVL) arvore).buscar(primeiroElemento);
        }
        tempoFinal = System.nanoTime();
        System.out.println(" ");
        System.out.println("Tempo de Busca na Arvore (Primeiro Elemento): " + (tempoFinal - tempoInicial) + " ns");

        // Busca do último elemento
        tempoInicial = System.nanoTime();
        if (arvore instanceof ArvoreBinaria) {
            ((ArvoreBinaria) arvore).buscar(ultimoElemento);
        } else if (arvore instanceof ArvoreAVL) {
            ((ArvoreAVL) arvore).buscar(ultimoElemento);
        }
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca na Arvore (Ultimo Elemento): " + (tempoFinal - tempoInicial) + " ns");

        // Busca do elemento do meio
        tempoInicial = System.nanoTime();
        if (arvore instanceof ArvoreBinaria) {
            ((ArvoreBinaria) arvore).buscar(elementoDoMeio);
        } else if (arvore instanceof ArvoreAVL) {
            ((ArvoreAVL) arvore).buscar(elementoDoMeio);
        }
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca na Arvore (Elemento do Meio): " + (tempoFinal - tempoInicial) + " ns");

        // Busca de um elemento aleatório
        tempoInicial = System.nanoTime();
        if (arvore instanceof ArvoreBinaria) {
            ((ArvoreBinaria) arvore).buscar(elementoAleatorio);
        } else if (arvore instanceof ArvoreAVL) {
            ((ArvoreAVL) arvore).buscar(elementoAleatorio);
        }
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca na Arvore (Elemento Aleatorio): " + (tempoFinal - tempoInicial) + " ns");

        // Busca de um elemento inexistente
        tempoInicial = System.nanoTime();
        if (arvore instanceof ArvoreBinaria) {
            ((ArvoreBinaria) arvore).buscar(elementoInexistente);
        } else if (arvore instanceof ArvoreAVL) {
            ((ArvoreAVL) arvore).buscar(elementoInexistente);
        }
        tempoFinal = System.nanoTime();
        System.out.println("Tempo de Busca na Arvore (Elemento Inexistente): " + (tempoFinal - tempoInicial) + " ns");
    }
}
