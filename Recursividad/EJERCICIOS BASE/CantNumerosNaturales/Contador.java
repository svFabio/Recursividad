/**
 * PARTE RECURSIVA DE 11,13
 * PARTE BÁSICA n = [1,9] PARA QUE SEA SOLO UN DIGITO 
 */
public class Contador{
    public int ContarDigito(int n){
        int res = 0;
          if(n>0){  
            if(n<10){
              res = 1;
            }else if(n>=10 ){
              n = n/10;  //12/10  2
              res = 1 + ContarDigito(n);
            }
        }   
        return res;                   
    }
}
