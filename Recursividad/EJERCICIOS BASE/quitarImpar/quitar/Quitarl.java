/**

 */
public class Quitarl
{
    public String quitarImpar(String cad){
        return quitarImpar(cad,cad.length());
    }
    private String quitarImpar(String cad, int n){
        String cadR;
        char c1,c2;
        
        if(n >= 2){
            c1 = cad.charAt(0);
            c2 = cad.charAt(1);
        }
        if(c1==c2){
            cadR = c1 + c2 + quitarImpar(cad.substring(1),n-1); 
        }else{
            cadR = quitarImpar();
        }
        
    }
}
