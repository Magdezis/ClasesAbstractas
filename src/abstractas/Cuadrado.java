/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractas;

/**
 *
 * @author Magno
 */
public class Cuadrado extends Figuras{

    public Cuadrado(int lado, int lado1) {
        super(lado, lado1);
    }
    
    @Override 
    public int calcularArea(){
        int area = lado * lado1;
        return area;
    };
    
}
