/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratoire6;

import java.util.Scanner;

/**
 *
 * @author Drahkor
 */
public class Laboratoire6 {

    public static void main(String[] args) {
       
        IObservateur obs = new ObservateurConsole();
        ContextTri context = new ContextTri();
        Scanner cin = new Scanner(System.in);
        afficherTableau();
        System.out.print("Entrer votre de choix d'algorithme: ");
        context.setStrategie(assemblerAlgo(cin.nextLine(), obs));
        System.out.print("Entrer la grandeur du tableau a trier: ");
        int[] tableau = new int[getEtendu(cin.nextLine())];
        remplirAleatoire(tableau);
        context.trier(tableau);
    }
    
    public static void afficher(int[] tableau)
    {
        for(int i : tableau)
        {
            System.out.print(i + ", ");
        }
        System.out.println("");
    }
    
    public static void afficherTableau()
    {
        System.out.println("     =============================");
        System.out.println("     |     Algorithme de tri     |");
        System.out.println("     =============================");
        System.out.println("     | 1. Le Tri-Bulle           |");
        System.out.println("     | 2. Le Tri Rapide          |");
        System.out.println("     =============================\n");
    }
    
    public static IStrategieTri assemblerAlgo(String choix, IObservateur obs)
    {
        IStrategieTri algo;
        switch(choix.charAt(0))
        {
            case '1':
                TriBulle  tri = new TriBulle();
                tri.ajouter(obs);
                algo = tri;
                break;
            default:
                TriRapide tri2 = new TriRapide();
                tri2.ajouter(obs);
                algo = tri2;                      
        }
        return algo;
    }
    
    public static int getEtendu(String valeur)
    {    
        try 
        {
            return Integer.parseInt(valeur);
        } 
        catch (NumberFormatException e) 
        {
            int defaut = 1000;
            return defaut;
        }
    }
    
    // methode voler au prof 
    public static void remplirAleatoire( int[] nombres )
    {
        for( int i = 0; i < nombres.length; ++i )
        { nombres[i] = (int)Math.floor(Math.random() * 1000); }
    }
}
