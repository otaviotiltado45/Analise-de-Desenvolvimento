public class ArvoreAVL {
    static class No {
        int chave, altura;
        No esquerda, direita;

        No(int d) {
            chave = d;
            altura = 1;
        }
    }

    No raiz;

    int altura(No N) {
        if (N == null) {
            return 0;
        }
        return N.altura;
    }

    No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    int getBalance(No N) {
        if (N == null) {
            return 0;
        }
        return altura(N.esquerda) - altura(N.direita);
    }

    void inserir(int chave) {
        raiz = inserirRec(raiz, chave);
    }

    No inserirRec(No no, int chave) {
        if (no == null) {
            return new No(chave);
        }

        if (chave < no.chave) {
            no.esquerda = inserirRec(no.esquerda, chave);
        } else if (chave > no.chave) {
            no.direita = inserirRec(no.direita, chave);
        } else {
            return no;
        }

        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int balance = getBalance(no);

        if (balance > 1 && chave < no.esquerda.chave) {
            return rotacaoDireita(no);
        }

        if (balance < -1 && chave > no.direita.chave) {
            return rotacaoEsquerda(no);
        }

        if (balance > 1 && chave > no.esquerda.chave) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (balance < -1 && chave < no.direita.chave) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
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
