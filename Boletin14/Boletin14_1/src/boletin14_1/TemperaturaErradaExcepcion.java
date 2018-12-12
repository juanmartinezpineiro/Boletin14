package boletin14_1;

/**
 *
 * @author jmartinezpineiro
 */
public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion(){
        super("A temperatura non pode ser maior de 80º Grados");
    }
}
