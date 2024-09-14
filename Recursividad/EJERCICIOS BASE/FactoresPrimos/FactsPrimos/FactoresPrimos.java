import java.util.ArrayList;
public class FactoresPrimos
{
    
    public ArrayList<Integer> factoresPrimosR(int n){
        ArrayList<Integer> res = new ArrayList<Integer>();
        factoresPrimosR(n, 2, res);
        return res;
    }
    
    public boolean esPrimoR(int n){
        return esPrimoR(2, n, 0);
    }
    
    private boolean esPrimoR(int divisorActual, int n, int cantDiv){
        boolean res;
        if(cantDiv > 0){  //4   Divisores = 4,|2|,1
            res = false;
        } else if(divisorActual > n/2) {
            res = true;
        } else {
            if(n%divisorActual == 0){
                cantDiv++;
            }
            res = esPrimoR(divisorActual+1, n, cantDiv);
        }
        return res;
    }
    
    private void factoresPrimosR(int n, int d, ArrayList<Integer> factores){
        if(d<=n){
            if(n%d==0 && esPrimoR(d)){
                factores.add(d);
            }
            factoresPrimosR(n, d+1, factores);
        }
    }
    
    
    
    
   
    
    /*
    public boolean esPrimo(int n){
        int divs = 0;
        int d = 2;
        while(d <= n/2 && divs == 0){
            if(n%d == 0){
                divs++;
            }
            d++;
        }
        return divs == 0;
    }*/
    /*private int primerDivPrimo(int n, int d){
        int res = n;
        if(d<=n){
            if(n%d == 0 && esPrimo(d)){
                res = d;
            }else{
                res = primerDivPrimo(n, d+1);
            }
        }
        return res;
    }*/
    
    /*
    public ArrayList<Integer> factoresPrimos(int n){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int d = 2; d<=n; d++){
            if(n%d == 0 && esPrimo(d)){
                res.add(d);
            }
        }
        return res;
    }*/
    /*public ArrayList<Integer> factoresPrimosUltra(int n){
        ArrayList<Integer> res;
        if(n == 1){
            res = new ArrayList<Integer>(); // {}
        }else{
            int k = primerDivPrimo(n, 2);
            res = factoresPrimosUltra(n/k);
            res.add(k);
        }
        return res;
    }*/
}