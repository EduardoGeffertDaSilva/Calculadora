public class MDC extends Calcular
{

    public int mdc(int num1,int num2)
    {
        int maior;
        int mdc = 1;

        if(num1 > num2)
        {
            maior = num1;
        }
        else
        {
            maior = num2;
        }

        for(int i = 2; i <= maior; i ++ )
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                mdc = i;
            }
        }
        return mdc;
    }
}
