/**
 * NUMERO PERFECTO.-  Ejemplo N = 6
 * 
 *               6 ---> 1 , 2 , 3 ----> 1 + 2 + 3 = 6 //
 * 
 * NUMERO DEFECTIVO.- Ejemplo N = 15
 *                    
 *               15 ---> 1,3,5 ---> 1+3+5 = 9 ---> 9 < 15 //
 * 
 * NUMERO ABUNDANTE.- Ejemplo N = 12
 * 
 *               12 ---> 1,2,3,4,6 ---> 1+2+3+4+6 = 16 --> 16 > 12 //
 */

public class Identificadora
{
    public String Identificar(int n){
        String res = "";
        int sum = Sumar(n,1);
        if(sum == n){ //perfecto
            res = "Perfecto";
        }
        if(sum > n){ //abundante
            res = "Abundante";
        }
        if(sum < n ){ //defectivo
            res = "Defectivo";
        }
        return res;
    }
    
    private int Sumar(int n,int divisor){ //metodo recursivo
        int res;
        if(n == divisor || n == 1){
            res = 0; //defectivo 
        }else{
             int aux = 0; 
             if(n % divisor == 0 ){//&& n!=divisor)
                 aux = divisor; //llamada recursiva
             }
             res = aux + Sumar(n,divisor+1);
        } 
        return res;
    }
}




