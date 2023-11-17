/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratoire6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Drahkor
 */
public class Sujet {
    
    protected List<IObservateur> observateurs_ = new ArrayList<>();
    
    public void ajouter(IObservateur observateur)
    {
        observateurs_.add(observateur);
    }
    
    public void retirer(IObservateur observateur)
    {
        observateurs_.remove(observateur);
    }
    
    protected void signaler(int[] tableau)
    {
        for(IObservateur obs : observateurs_)
        {
            obs.signaler(tableau);
        }
    }
    
}
