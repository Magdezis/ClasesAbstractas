package abstractas;


public class Abstractas {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuadrado cuadrado = new Cuadrado(3,6);
        
        Carro carro1 = new Wolswagen();
        Carro carro2 = new Mazda();
        
        
        System.out.println(cuadrado.calcularArea() + " el area es");
        System.out.println("tu carro es un: " + carro1.encendervehiculo());
        System.out.println("tu carro es un:" + carro2.encendervehiculo());
        
        int a = 1, x = 0;
        for(int r = 0 ; r < 200; r ++){
          r = a + x;
          x = a;
          a = r;
           
            System.out.println("fibonacci " + r);
        }
    }
    
}
