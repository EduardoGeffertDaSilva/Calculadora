public class Equacao_2
{
    public int EquacaoX1(int a , int b, int delta)
    {

        int x1 ;

        x1 = (-b + delta) / (2 * a);

        return x1;
    }

    public int EquacaoX2(int a , int b, int delta)
    {
        int x1 ;

        x1 = (-b - delta) / (2 * a);

        return x1;
    }
}
