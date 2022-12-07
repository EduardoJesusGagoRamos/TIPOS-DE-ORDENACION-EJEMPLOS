//ORDENACIÓN POR INTERCAMBIO
package OrdIntercambio;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        int array[] = {8, 9, 3, 5, 7, 400, 150, 633, 2, 528, 1, 321, 254, 333};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        ordIntercambio(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void ordIntercambio(int a[]) {
        int i, j;
        for (i = 0; i < a.length - 1; i++) // sitúa mínimo de a[i+1]...a[n-1] en a[i]
        {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    intercambiar(a, i, j);
                }
            }
        }
    }
}
