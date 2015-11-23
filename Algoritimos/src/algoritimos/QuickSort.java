
package algoritimos;


public class QuickSort {

    static void quickSort(int[]v, int ini, int fim){
        if (ini < fim) {
            int meio = particao(v, ini, fim);
            quickSort(v, ini, meio - 1);
            quickSort(v, meio + 1, fim);
        }
    }
    
    static int particao(int[]v, int ini, int fim){
        int i = ini;
        for(int j = ini +1; j <= fim; j++){
            if (v[j] < v[ini]) {
                i++;
                troca(v,i,j);
            }
        }
        troca(v,ini,i);
        return i;
    }
    
    static void troca(int[] v, int a, int b){
        int temp = v[a];
        v[a] = v[b];
        v[b] = temp;
    }
    
    static void imprimirVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    
   
    
}
