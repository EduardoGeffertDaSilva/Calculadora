public class Adicao extends Calcular
{

    public double Somar(double resultado, double numero)
    {
        double resultadoFinal = resultado + numero;
        System.out.println(resultado + " + " + numero + " = "  + resultadoFinal);
        return resultadoFinal;
    }
}
