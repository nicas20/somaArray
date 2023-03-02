import java.util.Arrays;

public class somaArray {

    public static int somaArray(int[] array, int indice) {
        if (indice >= array.length) {
            return 0;
        }

        return array[indice] + somaArray(array, indice+1);
    }

    public static void main(String[] args) {
        int[] meuArray = {1, 3, 5, 7, 9};
        int indiceInicial = 3;

        int soma = somaArray(meuArray, indiceInicial);
        System.out.println("Array: " + Arrays.toString(meuArray));
        System.out.println("Indice inicial: " + indiceInicial);
        System.out.println("Soma a partir do indice: " + soma);
    }
}
