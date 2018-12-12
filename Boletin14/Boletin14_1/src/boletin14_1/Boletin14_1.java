package boletin14_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConversorTemperaturas conversor1 = new ConversorTemperaturas();
        
        try{
            float grados = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los grados celsius: "));
            System.out.println("Fahrenheit: " +conversor1.centigradosAFahrenheit(grados));
            System.out.println("Reamur: " +conversor1.centigradosAReamur(grados));
            
        }catch(TemperaturaErradaExcepcion e1){
            
            System.out.println(e1.getMessage());
        }



    }

}
