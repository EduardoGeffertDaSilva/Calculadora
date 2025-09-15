public class Elevado extends Calcular
{

    public int Elevado(int resultado, int numero)
    {
        int resultadoFinal = 1;

        for (int i = numero; i >= 1; i--)
        {
            resultadoFinal = resultadoFinal * resultado;
        }

        return resultadoFinal;
    }
}