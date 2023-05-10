/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jonathan
 */
public class Cliente extends Externo{
    
    private int idCliente;
    private String primerApellido;
     public Cliente(){

    }
     public Cliente(int idCliente, String primerApellido){
        this.idCliente = idCliente;
        this.primerApellido = primerApellido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }

    @Override
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
 public String toString(){
        
        return this.primerApellido; 
    }
    
}
