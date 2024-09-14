
//dado n = 23  y una lista de impares {5,7,9} (5*0)+(7*2)+(9*1) = 23
//resultado = {{0,2,1}{1,0,2}} 
public class CombinacionImpar
{
    public void combinar(int n, int[] impares){
        combinaciones(0,impares,new int [impares.length],n);
    }
    private void combinaciones(int i, int [] impares, int [] candidato, int n){
        if(i < impares.length){
           combinarNumeros(0,n,impares,candidato,i);
        }
    }
    private void combinarNumeros(int k, int n, int [] impares ,int [] cand, int pos){
        if(k <= n){
            if(suma(impares,cand,0) == n){
                imprimir(cand,0);
            }
            cand[pos] = k;
            combinaciones(pos+1, impares,cand,n);
            combinarNumeros(k+1,n,impares,cand,pos);
        }
    }
    private int suma(int [] impares, int [] cand, int i){
        int res = 0; //porque si no inicializa en 0 le da error
        if(i < cand.length){ //podria ser impares.length igual porque tiene mismo tamaño
            res = impares[i]*cand[i]+suma(impares,cand,i+1);
        }
        return res;
    }
    private void imprimir(int [] cand, int i){
        if(i < cand.length){ 
            System.out.print(cand[i]+" ");
            imprimir(cand,i+1); //llamada recursiva
        }else{
            System.out.println();
        }
    }
}
