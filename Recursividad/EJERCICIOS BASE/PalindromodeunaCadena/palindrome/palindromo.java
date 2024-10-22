
/**

 */
public class palindromo
{
    public boolean esPalindromo(String palabra){
        boolean res;
        res = esPalindromo(palabra,0,palabra.length()-1); //-1 porque se pasaria
        return res;
    }
    
    
    private boolean esPalindromo(String palabra, int i, int k){
        boolean res;
        if(k-i == 0 || k-i ==1){
            if(palabra.charAt(i) == ' ' && palabra.charAt(k) != ' '){
                res = (palabra.charAt(i+1) == palabra.charAt(k)); //solo para un espacio
            }else if(palabra.charAt(i) != ' ' && palabra.charAt(k) == ' '){
                res = (palabra.charAt(i) == palabra.charAt(k-1));
            }else{
                res = (palabra.charAt(i) == palabra.charAt(k));
            }
        }else{
            
            if(palabra.charAt(i) == ' ' && palabra.charAt(k) != ' '){
                res = (palabra.charAt(i+1) == palabra.charAt(k)) && esPalindromo(palabra,i+2,k-1); //solo para un espacio
            }else if(palabra.charAt(i) != ' ' && palabra.charAt(k) == ' '){
                res = (palabra.charAt(i) == palabra.charAt(k-1)) && esPalindromo(palabra,i+1,k-2);
            }else{
                res = (palabra.charAt(i) == palabra.charAt(k)) && esPalindromo(palabra,i+1,k-1);
            }
         }
        return res;
    }
}
