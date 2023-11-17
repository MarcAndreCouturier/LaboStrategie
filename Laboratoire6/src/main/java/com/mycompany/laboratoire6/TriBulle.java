package com.mycompany.laboratoire6;

public class TriBulle extends Sujet implements IStrategieTri {

    public void trier(int[] tableau) {
        if (tableau != null) {
            int n = tableau.length;
            boolean echanger = true;
            super.signaler(tableau);
            for (int i = 0; i < n - 1 && echanger; i++) {
                echanger = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (tableau[j] > tableau[j + 1]) {
                        int temp = tableau[j];
                        tableau[j] = tableau[j + 1];
                        tableau[j + 1] = temp;
                        echanger = true;
                        
                    }
                }
                super.signaler(tableau);
            }
        }
    }
    
    public void signaler(int[] tableau)
    {
        
    }
}
