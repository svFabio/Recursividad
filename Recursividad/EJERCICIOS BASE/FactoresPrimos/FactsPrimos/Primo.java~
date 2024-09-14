public class Primo{
    
    
    
    
    
    
    
    
    
    
    
    public boolean esPrimo(int n){
        boolean res; 
        if(n == 1){
            res = false;
        }else{
            res = esPrimo(n,2);  //
        }
        return res;
    }
    private boolean esPrimo(int n, int div){
        boolean res;
        if(n == div){
            res = true;
        }else if(n % div == 0){
            res = false;
        }else{
            res = esPrimo(n,++div);    
        }
        return res;
    }
}
