import java.util.Arrays;

public class somaArray {

    public static int somaArray(int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }

        return array[index] + somaArray(array, index+1);
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
