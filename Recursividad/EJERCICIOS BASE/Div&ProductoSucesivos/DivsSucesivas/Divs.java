
/**
 *  
 */
public class Divs
{
    public int Division(int dividendo, int divisor){
        int res;
        if( dividendo < divisor){
            res = 0;
        }else{
            dividendo = dividendo - divisor;
                      
            res = 1 + Division(dividendo,divisor); 
        }
        return res;
    }
}
