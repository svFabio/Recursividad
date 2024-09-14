/**
 * Cantidad de numeros primos en un rango a y b.
 * Crear un metodo boolean que identifique un numero primo
 * a = 2 
 * b = 10
 * --> 2,3,5,7
 * desde a con limite b
 */
public class CantDePrimos{
    public int cantPrimos(int a, int b){
        int res;
        if(a > b){ //caso base cuando a supere el limite b
            res = 0;
        }else if(Verificar(a,2)){
              res = 1 + cantPrimos(a+1,b);  
              }else{
              res = cantPrimos(a+1,b);
        }
        return res;
    }
    private boolean Verificar(int a, int div){
        boolean res;
        if(a==1){ 
           res = false;
        }else
        if(a == div){
            res = true;
        }else if(a % div == 0){
              res = false;
              }else{
              res = Verificar(a,++div);    
        }
        return res;
     }
       
}