
public class contador2
{
    public int Condig(int n){
        int res;
        if(n<10){
            res = 1;
        }else{
            res = 1 + Condig(n/10);
        }
        return res;
    }
}
