public class Multiplicacao extends Calcular
{

    public double Multiplcar(double resultado, double numero)
    {
        double resultadoFinal = resultado * numero;
        System.out.println(resultado + " * " + numero + " = "  + resultadoFinal);

        return resultadoFinal;
    }
}
