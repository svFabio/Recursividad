/**
 *  como CC: n debe permanecer a Z positivos
 */
public class Factorial
{
    public int factorialCalc(int n){
        int res = 1;
        //Parte Basica
        if(n==0 || n==1){
           return res;
        }
        //parte Recursiva
        if(n > 1){
            res = n * factorialCalc(n-1);
            n--;
        }
        return res;
    }
    
}
