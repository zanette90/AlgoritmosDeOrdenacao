public class Shellsort {

    public double encontraVarreduras(double n) {
        return Math.log(n + 1) / Math.log(3);
    }

    public double encontraDistancia(double k) {
         return (Math.pow(3, k) - 1) / 2;
    }


    public  int [] shellSort(int[] lista) {
        int n = lista.length;

        double k = encontraVarreduras(n);

        k = Math.round(k);

        int h = (int) encontraDistancia(k);

        while (h > 0) {
            for (int i = 0; i < n - h; i++) {
                if (lista[i] > lista[i + h]) {
                    int aux = lista[i];
                    int j = i - h;

                    while (j >= 0 && aux < lista[j]) {
                        lista[j + h] = lista[j];
                        j -= h;
                    }
                    lista[j + h] = aux;
                }
            }
            h = (h - 1) / 3;
        }
        return lista;
    }
}
