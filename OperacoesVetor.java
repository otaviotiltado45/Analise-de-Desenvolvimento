import java.util.Arrays;
import java.util.Random;

public class OperacoesVetor {
    public static void inserir(int[] vetor, int[] dados) {
        System.arraycopy(dados, 0, vetor, 0, dados.length);
    }

    public static boolean buscaSequencial(int[] vetor, int x) {
        for (int i : vetor) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscaBinaria(int[] vetor, int x) {
        int l = 0, r = vetor.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (vetor[m] == x) {
                return true;
            }
            if (vetor[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
