public class Radiaciacao extends Calcular
{

    public int Raiz(int indice, int radicando)
    {

        for (int i = 1; i <= radicando; i++)
        {
            int resultado = 1;

            for (int j = 1; j <= indice; j++)
            {
                resultado *= i;
            }

            if (resultado == radicando)
            {
                System.out.println("A raiz " + radicando + " de " + indice + " é: " + i);
                return i;
            }
        }

        System.out.println("Essa raiz não pode ser calculada exatamente!");
        return 0;
    }
}