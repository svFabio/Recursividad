/**
 * n = 2341675 --> (5 + 6+ 4 + 2)- (7 + 3 + 3)
 *                 pos par         menos por par
*/
public class Divisible{
    public boolean esDivisible11(int n){
        boolean esDivisible;
        if(n < 20){
            if(n == 11 || n == 0){
                esDivisible = true;
            }else{
                esDivisible = false;
            }
        }else{
            int suma = suma(n,-1,0);
            if(suma<20){
                if(suma == 11 || suma == 0){
                    esDivisible = true;
                }else{
                    esDivisible = false;
                }
            }else{
                esDivisible = esDivisible11(suma); 
            }
        }
        return esDivisible;
    }
    private int suma(int n, int i, int sumador){
        int res;
        if(n<10){
            i = i*-1;
            res = sumador + i*n;
        }else{
            i = i*-1;
            int dig = n % 10;
            res = suma(n/10,i,sumador+i*dig);
        }
        return res;
    } 
}
