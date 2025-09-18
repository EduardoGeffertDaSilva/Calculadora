public class Equacao_1 extends Calcular
{

    public int Equacao(int a , int b, int c)
    {

        int x ;

        if(b < 0)
        {
            x = c + b ;
            x = x / a;
            return x;
        }
        else
        {
            x = c - b;
            x = x / a;
            return x;
        }
    }
}
