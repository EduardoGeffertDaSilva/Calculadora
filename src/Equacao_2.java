public class Equacao_2 extends Calcular
{
    public double EquacaoX1(int a , int b, int delta)
    {

        double x1 ;

        x1 = (-b + Math.sqrt(delta)) / (2 * a);

        return x1;
    }

    public double EquacaoX2(int a , int b, int delta)
    {
        double x1 ;

        x1 = (-b - Math.sqrt(delta)) / (2 * a);

        return x1;
    }
}
