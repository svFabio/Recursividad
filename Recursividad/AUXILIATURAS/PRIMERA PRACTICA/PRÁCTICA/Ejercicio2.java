/**
 cantidad de flexiones:
 1 --->  0  PB : cantFlex(1) = 0
 2 --->  2  PR : cantFlex(2) = 2 + cantFlex(1)
 3 --->  6  PR : cantFlex(3) = 4 + cantFlex(2)
 4 ---> 14  PR
 5 ---> 30  PR
 */
public class Ejercicio2
{
    public int cantFlexiones(int dia){
        return cantFlexiones(dia,1,1);
    }
    private int cantFlexiones(int dia, int exp,int cont){
        int res;
        if(dia == cont){
            res = 0;
        }else{
            res = (int)(Math.pow(2,exp)) + cantFlexiones(dia,exp+1,cont+1);
        }
        return res;
    }
}


















