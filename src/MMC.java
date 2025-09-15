public class MMC extends Calcular
{

    public int mmc(int num1,int num2)
    {

        int m = num1 * num2;
        int resultado = m;

        for(int i = 2; i <= m; i ++)
        {
            if (i % num1 == 0 && i % num2 == 0)
            {
                resultado = i;
                return resultado;
            }
        }

        return 0;
    }
}
