
/**
 * si n = 12345 y r = 1
 * 12345 % 10 = 5  y 12345/10 = 1234
 * res = 51234
   si nos dan n = x  y  r = 0  devolver mismo numero
            
 */
public class Rotacion
{
    public int rotarNumero(int numero, int rotaciones){
        int mult = potencia(10,contar(numero)-1);
        return rotarNumero(numero,rotaciones, mult);
    }
    
    
    private  int rotarNumero(int numero, int rotaciones, int mult){
        if(rotaciones == 0){
            return numero;
        }else{
            numero = rotarDigito(numero, mult); //////
            return rotarNumero(numero, rotaciones-1, mult);
        }
    }
    
    private int rotarDigito(int numero, int mult){ //metodo NUCLEO, EL METODO QUE SERA RECURSIVO
        int  dig = numero % 10;  //13 ---> 3 
        numero = numero / 10;    //13 ---> 1
        int aux = dig * mult;    //30
        numero = aux + numero;   //30 + 1 = 31
        return numero;
    }
    //contar los digitos
    
    private int contar(int n){
        if(n<10){
             return 1; 
         }else{
            return 1 + contar(n/10);
         }
    }
    
    private int potencia(int a, int b){
        if(b == 1){
            return a;
        }
        if(b == 0){
            return 
            1;
        }else{
            return a * potencia(a,b-1);  
        }
        
    }
}
