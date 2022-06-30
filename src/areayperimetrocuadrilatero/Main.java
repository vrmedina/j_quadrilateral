
package areayperimetrocuadrilatero;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        AreayPerimetroCuadrilatero cuadrilatero;
        float lado1, lado2;
        System.out.println("*** Programa para calcular el perimetro y area de un cuadrilatero/cuadrado ***");
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer lado: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo lado: "));
        System.out.println("El lado1 es: "+ lado1);
        System.out.println("El lado2 es: "+ lado2);
        
        if (lado1 == lado2) {
            System.out.println("Es un cuadrado");
            cuadrilatero = new AreayPerimetroCuadrilatero(lado1);
        }else {
            System.out.println("Es un cuadrilatero");
            cuadrilatero = new AreayPerimetroCuadrilatero(lado1, lado2);
        }
        System.out.println("El perimetro es: "+ cuadrilatero.getPerimetro());
        System.out.println("El area es: "+ cuadrilatero.getArea());
    }
}
