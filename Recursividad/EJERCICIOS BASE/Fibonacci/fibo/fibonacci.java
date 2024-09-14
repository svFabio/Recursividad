/**
 * CC: n pertenece a los Z positivos
 * PB: n = 0 ---> 0 |  n = 1 ---> 1
 * PR: n            |  fibonaci n es igual a n-2 + n-1
 */
public class fibonacci{
    
    public int fibo(int n){
        int res;
        if(n==0){
            res = 0;
        }else if(n==1){
            res = 1;
        }
        else{
            res = fibo(n-2)+fibo(n-1);
        }
        
        return res;
    
    }
}
