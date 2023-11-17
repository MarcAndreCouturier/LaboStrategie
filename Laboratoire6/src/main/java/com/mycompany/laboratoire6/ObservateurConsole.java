/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratoire6;

/**
 *
 * @author Drahkor
 */
public class ObservateurConsole implements IObservateur {
    
    @Override
    public void signaler(int[] tableau)
    {
        System.out.print("\n");
        for(int i : tableau)
        {
            System.out.print( "[" + i + "]");
        }
    }
    
}
