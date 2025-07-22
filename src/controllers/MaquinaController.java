/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import models.Maquina;

/**
 *
 * @author LAB_04
 */
public class MaquinaController {
    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral ){
        Stack<Maquina> lista = new Stack<>(); 
        for(Maquina maquina: maquinas){
            if(maquina.getSubred()>umbral){
                lista.add(maquina);

            }
        }

        return lista;
    
    }
    // Actions
    public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila){
        Set<Maquina> ordenado = new TreeSet<>();
        while(!pila.isEmpty()){
            ordenado.add(pila.pop());
        
        }
        return ordenado;
        
    }

    public Map<Integer , Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas){
        TreeMap<Integer,Queue<Maquina>> mapaRiesgo = new TreeMap();
        for(Maquina maquina: maquinas){
            int riesgo= maquina.getRiesgo();
            Queue<Maquina> grupo = mapaRiesgo.computeIfAbsent( riesgo, k -> new LinkedList<>());
            grupo.add(maquina);


        }
        return mapaRiesgo;
        
    } 

   

}
