public class Modulo extends Calcular
{

    public int modulo(int num1)
    {
        int modulo;

        if(num1 < 0)
        {
            modulo = num1 - (2 * num1);
        }
        else
        {
            modulo = num1;
        }
       return modulo;
    }
}
