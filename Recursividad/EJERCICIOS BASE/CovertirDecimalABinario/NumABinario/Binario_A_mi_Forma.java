
/**
 * EJERCICIO DE COVERSION A BINARIO 
 */
public class Binario_A_mi_Forma
{   
    public int bin(int n){
        return bin(n,1);
    }
    private int bin(int n, int multi){  // n = 2    N = 1
        int res;
        int residuo = n % 2;          
        n = n / 2;                    
        int sum = residuo * multi;  
         if(n > 0){
            res = sum + bin(n,multi*10);  
        } else{
            res = sum;
        }  
        return res;
    }
}
