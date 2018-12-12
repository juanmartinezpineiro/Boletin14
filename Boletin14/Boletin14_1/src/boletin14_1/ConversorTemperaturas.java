package boletin14_1;

/**
 *
 * @author jmartinezpineiro
 */
public class ConversorTemperaturas {
    
    final float grados = 80;
    
    public float centigradosAFahrenheit (float centigrados) throws TemperaturaErradaExcepcion{
        
        float fahrenheit;
        
        if (centigrados > 80){
            throw new TemperaturaErradaExcepcion();
        }else{
            fahrenheit = (float) (9.0 / 5.0 * centigrados + 32.4);
            return fahrenheit;
        }
    }
    
     public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
    
        float reamur = 0;
            
        if(centigrados > 80){
            
            throw new TemperaturaErradaExcepcion();
        } else {
            
            reamur = (float) (4.0 / 5.0 * centigrados);
            return reamur;
        }   
        
    }

}
