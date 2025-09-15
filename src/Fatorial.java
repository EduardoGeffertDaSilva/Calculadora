public class Fatorial extends Calcular
{

    public int Fatorial(int numero)
    {
        int resultado = 1;
        for(int i = numero; i > 1; i --)
        {
            resultado = resultado * i;
        }

        return resultado;
    }
}
