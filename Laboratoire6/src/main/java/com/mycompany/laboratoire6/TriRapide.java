
package com.mycompany.laboratoire6;


public class TriRapide extends Sujet implements IStrategieTri {
    
        
    public void trier(int[] tableau) {
        if (tableau != null && tableau.length > 0) {
            trier(tableau, 0, tableau.length - 1);
        }
    }

    private void trier(int[] tableau, int debut, int fin) {
        if (debut < fin) {
            int indexPivot = partitionner(tableau, debut, fin);
            super.signaler(tableau);
            trier(tableau, debut, indexPivot - 1);
            trier(tableau, indexPivot + 1, fin);
        }
    }

    private int partitionner(int[] tableau, int debut, int fin) {
        int pivot = tableau[fin];
        int i = debut - 1;
        for (int j = debut; j < fin; j++) {
            if (tableau[j] < pivot) {
                i++;
                int temp = tableau[i];
                tableau[i] = tableau[j];
                tableau[j] = temp;
            }
        }

        int temp = tableau[i + 1];
        tableau[i + 1] = tableau[fin];
        tableau[fin] = temp;
        return i + 1;
    }
    
}
