
package objetos2;

import javax.swing.JOptionPane;

public class Operacion {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //metodos
    //ingrese los numeros
    public void leerNumero(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero :"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero : "));
    }
    public void sumar(){
        suma = numero1+numero2;
    }
    public void resta (){
        resta =numero1-numero2;
    }
    public void multiplicacion (){
        multiplicacion =numero1*numero2;
    }
    public void division (){
        division =numero1/numero2;
    }
    public void mostrarResultado(){
        System.out.println(" La suma es :"+suma);
        System.out.println("la resta es :"+resta);
        System.out.println("la multiplicacion es : "+multiplicacion);
        System.out.println("la division es : "+division);
    }
}
