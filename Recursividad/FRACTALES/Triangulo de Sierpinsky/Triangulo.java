
/** 
 *  n = 0     1
 *  n = 1     5  
 *  n = 2     17
 *  n = 3     53
 *  n = 4     161
 *  
 */
public class Triangulo{
    
    public int Triangulo(int n){
        return Triangulo(n,0);
    }
    private int Triangulo(int n, int pow){ //2
        int res;
        if(n==0){
            res = 1;
        }else{
            res = Triangulo(n-1,pow+1) + 4 * (int)Math.pow(3,pow);   //
        }
        return res;
    }   
}
