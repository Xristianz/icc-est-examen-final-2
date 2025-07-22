/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package models;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author LAB_04
 */
public class Maquina {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;
    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        
    }
    


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getIp() {
        return ip;
    }


    public void setIp(String ip) {
        this.ip = ip;
    }


    public List<Integer> getCodigos() {
        return codigos;
    }


    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }


    public int getSubred() {
        return subred;
    }


    public void setSubred(int subred) {
        this.subred = subred;
    }


    public int getRiesgo() {
        return riesgo;
    }


    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    private int calcularSubred(){
        String[] numero=ip.split("\\.");
        

        return subred=Integer.parseInt(numero[2]);

    }
    private int calcularRiesgo(){
        int cont=0;
        Set<Character> caracteresUnicos= new LinkedHashSet<>();

        for (char c : nombre.toCharArray()) {
            caracteresUnicos.add(c);
            cont++;
            
        }
        int suma=0;
        for(int codigo: codigos){
            if(codigo%5==0){
                suma+=codigo;
                        
        
            }
        


        }
       

        return riesgo=suma*cont;

    }
    
    


}
