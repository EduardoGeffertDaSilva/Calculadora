public class Numeros_Complexos extends Calcular
{

    public int Modulo(int a, int b)
    {
        double m;

        m = (a * a) + (b * b);

        m = Math.sqrt(m);

        return (int) m;
    }

}