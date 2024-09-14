
/**
   * intentando hacer la curva de gilb
   * ert
   * n0 = 3
   * n1 = 13  = f(n-1)*4)+1     3*4  +1 
   * n2 = 51  = f(n-1)*4)-1     13*4 -1
   * n3 = 205 = f(n-1)*4)+1     51*4 +1
   * n4 = 819 = f(n-1)*4)-1 
  */
public class Fractal{
    
    public int Fractal(int n){  //1
       int res ;
       if(n == 0){
           return 3;
        }    
       if(n%2 == 0){
           return (Fractal(n-1)*4)-1;
        }else{
           return (Fractal(n-1)*4)+1;
       }
    }
}
   
   
    
    

