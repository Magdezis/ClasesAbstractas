/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractas;

/**
 *
 * @author Magno
 */
public abstract class Figuras {
    
    protected int lado;
    protected int lado1;
    
    public Figuras(int lado, int lado1){
        this.lado = lado;
        this.lado1 = lado1;
   
    };
    
    public abstract int calcularArea();
    
}
