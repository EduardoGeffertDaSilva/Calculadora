public class Divisao extends Calcular
{

    public double Dividir(double resultado, double numero)
    {
        double resultadoFinal = resultado / numero;
        System.out.println(resultado + " / " + numero + " = "  + resultadoFinal);

        return resultadoFinal;
    }
}
