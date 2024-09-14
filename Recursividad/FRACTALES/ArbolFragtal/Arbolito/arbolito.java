/**
 * n0 = 1
 * n1 = 5
 * n2 = 21
 * n3 = 85 
 */
public class arbolito
{
    public int palitos(int n){
       int res;
        if(n == 0){
                   res = 1;
            
       }else{
                   res = palitos(n-1)+(int)Math.pow(4,n);
       }
       return res;
    }
}
