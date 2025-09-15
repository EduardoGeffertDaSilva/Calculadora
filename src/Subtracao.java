public class Subtracao extends Calcular
{
    public double Subtrair(double resultado, double numero)
    {
        double resultadoFinal = resultado - numero;
        System.out.println(resultado + " - " + numero + " = "  + resultadoFinal);

        return resultadoFinal;
    }
}
