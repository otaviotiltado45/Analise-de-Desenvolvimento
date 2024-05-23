public class ArvoreBinaria {
    static class No {
        int chave;
        No esquerda, direita;

        public No(int item) {
            chave = item;
            esquerda = direita = null;
        }
    }

    No raiz;

    ArvoreBinaria() {
        raiz = null;
    }

    void inserir(int chave) {
        raiz = inserirRec(raiz, chave);
    }

    No inserirRec(No raiz, int chave) {
        if (raiz == null) {
            raiz = new No(chave);
            return raiz;
        }
        if (chave < raiz.chave) {
            raiz.esquerda = inserirRec(raiz.esquerda, chave);
        } else if (chave > raiz.chave) {
            raiz.direita = inserirRec(raiz.direita, chave);
        }
        return raiz;
    }

    boolean buscar(int chave) {
        return buscarRec(raiz, chave) != null;
    }

    No buscarRec(No raiz, int chave) {
        if (raiz == null || raiz.chave == chave) {
            return raiz;
        }
        if (raiz.chave > chave) {
            return buscarRec(raiz.esquerda, chave);
        }
        return buscarRec(raiz.direita, chave);
    }
}
