
/**
 * "a" es un numero que va a sumarse "b" veces 
 */
public class ProductoSuc{
    public int Productode(int a, int b){
        int res = 1;
        if(a == 0 || b == 0){
            res = 0;
        }else if( a == 1 ){
                return b;
              }else if( b == 1 ){
                      return a; 
                    }else{
                        res = a + Productode(a,b-1); 
                    }
        return res;
    }
}
