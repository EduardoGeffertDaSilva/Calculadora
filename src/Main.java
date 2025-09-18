
import java.util.Scanner;

public class Main
{
    static Calcular calcular = new Calcular();
    static Adicao adicao = new Adicao();
    static Subtracao subtracao = new Subtracao();
    static Multiplicacao multiplicacao = new Multiplicacao();
    static Divisao divisao = new Divisao();
    static Elevado elevado = new Elevado();
    static Radiaciacao radiaciacao = new Radiaciacao();
    static Fatorial fatorial = new Fatorial();
    static MMC mmc = new MMC();
    static MDC mdc = new MDC();
    static Modulo modulo = new Modulo();
    static Equacao_1 equacao1 = new Equacao_1();
    static Equacao_2 equacao2 = new Equacao_2();

    static String Mostrar = "  :)";
    static Scanner leia = new Scanner(System.in);

    static double resultado = 0;

    public static void main(String[] args)
    {

        System.out.println("\n\n\n\n     ===================================");
        System.out.println("     =======     CALCULADORA     =======");
        System.out.println("     ===================================");
        System.out.println("\n\n\nAqui você pode realizar diversas operações matemáticas!");

        inicio();
    }

    public static void inicio()
    {
        System.out.println("\n\nDigite:");
        System.out.println("\n1-Realizar conta");
        System.out.println("2-Sair");
        int escolha = leia.nextInt();
        leia.nextLine();

        if(escolha == 1)
        {
            System.out.println("Digite um número: ");
            resultado = leia.nextDouble();
            Mostrar = ""+resultado;
            Menu();
        }
        else if(escolha == 2)
        {
            System.out.println("Desligando . . .");
            System.exit(0);
        }
        else
        {
            System.out.println("Valor digitado incorreto!");
            inicio();
        }
    }

    public static void Menu()
    {

        for(int i = 1; i <= 50; i++)
        {
            System.out.println("");
        }

        System.out.println("\n_________________________________________________________________________");
        System.out.println("\n\n         -----------------------------------------");
        System.out.println("                 " + Mostrar  );
        System.out.println("         -----------------------------------------");
        System.out.println("\n\nDigite");
        System.out.println("\n1-Adicionar     [ + ]      2-Subtrair    [  -  ]     3-Dividir [  ÷  ]");
        System.out.println("\n4-Multiplicar   [ * ]      5-Elevar      [ (x)²]     6-Raiz    [  √  ]");
        System.out.println("\n7-Fatorial      [ ! ]      8-MMC         [ x|x ]     9-MDC     [ x|y ]");
        System.out.println("\n10-Modulo       [|x|]      11-1°Grau     [     ]     12-2°Grau [     ]");
        System.out.println("\n13-Trigonometria[   ]      14-N°Complexos[     ]     15-Sair   [  x  ]");
        System.out.println("\n                           16-Limpar [ --- ]");
        System.out.println("\n_________________________________________________________________________");
        int escolha = leia.nextInt();
        leia.nextLine();


        switch (escolha)
        {
            case 1:
            {

                System.out.println(resultado + " + ");

                System.out.println("\n\nDigite um numero: ");
                double nume = leia.nextDouble();
                leia.nextLine();

                double resultadoantigo = resultado;

                resultado = adicao.Somar(resultado,nume);

                Mostrar = resultadoantigo + " + " + nume + " = "  + resultado;

                Menu();

                break;
            }
            case 2:
            {
                System.out.println(resultado + " - " );

                System.out.println("\n\nDigite um numero: ");
                double nume = leia.nextDouble();
                leia.nextLine();

                double resultadoantigo = resultado;

                resultado = subtracao.Subtrair(resultado,nume);

                Mostrar =  resultadoantigo + " - " + nume + " = "  + resultado;

                Menu();

                break;
            }
            case 3:
            {
                System.out.println(resultado + " / " );

                System.out.println("\n\nDigite um numero: ");
                double nume = leia.nextDouble();
                leia.nextLine();

                double resultadoantigo = resultado;

                resultado = divisao.Dividir(resultado,nume);

                Mostrar = resultadoantigo + " / " + nume + " = "  + resultado;

                Menu();

                break;
            }
            case 4:
            {
                System.out.println(resultado + " * " );

                System.out.println("\n\nDigite um numero: ");
                double nume = leia.nextDouble();
                leia.nextLine();

                double resultadoantigo = resultado;

                resultado = multiplicacao.Multiplcar(resultado,nume);

                Mostrar = resultadoantigo + " * " + nume + " = "  + resultado;

                Menu();

                break;
            }
            case 5:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar uma de elevar? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Digite um numero inteiro para ser a base, o x|   x²   |: " );
                    int num1 = leia.nextInt();
                    leia.nextLine();

                    System.out.println("Digite um numero inteiro para ser o expoente, o 2|   x²  |: ");
                    int num2 = leia.nextInt();
                    leia.nextLine();

                    int resultadoElevar = elevado.Elevado(num1,num2);

                    Mostrar =  num1 + " elevado a " + num2 + " = "  + resultadoElevar;

                    System.out.println("O resultado é: " + resultadoElevar);

                    resultado = resultadoElevar;

                    Menu();
                }
                else
                {
                    Menu();
                }
            }
            case 6:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar uma de raiz? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Digite um numero inteiro para ser o indice, o 2|   ²√x   |: " );
                    int num1 = leia.nextInt();
                    leia.nextLine();

                    System.out.println("Digite um numero inteiro para ser o radicando, o x|   ²√x  |: ");
                    int num2 = leia.nextInt();
                    leia.nextLine();

                    int resultadoElevar = radiaciacao.Raiz(num1, num2);

                    Mostrar = "Indice: " + num1 + " radicando: + " + num2 + " = " + resultadoElevar;

                    resultado = resultadoElevar;

                    Menu();
                }
                else
                {
                    Menu();
                }
                break;
            }
            case 7:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar um fatorial? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Digite um numero inteiro para calcular o fatorial: " );
                    int num1 = leia.nextInt();
                    leia.nextLine();

                    int resultadoFatorial = fatorial.Fatorial(num1);

                    Mostrar = "O fatorial de " + num1 + " é " + resultadoFatorial;

                    resultado = resultadoFatorial;

                    Menu();
                }
                else
                {
                    Menu();
                }
                break;
            }
            case 8:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar um MMC? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Digite um numero inteiro para calcular o MMC: " );
                    int num1 = leia.nextInt();
                    leia.nextLine();

                    System.out.println("Digite outro numero inteiro para calcular o MMC: " );
                    int num2 = leia.nextInt();
                    leia.nextLine();

                    int resultadoFatorial = mmc.mmc(num1,num2);

                    Mostrar = "O MMC de " + num1 + " " + num2 + " é " + resultadoFatorial;

                    resultado = resultadoFatorial;

                    Menu();
                }
                else
                {
                    Menu();
                }
                break;
            }
            case 9:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar um MDC? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Digite um numero inteiro para calcular o MDC: " );
                    int num1 = leia.nextInt();
                    leia.nextLine();

                    System.out.println("Digite outro numero inteiro para calcular o MDC: " );
                    int num2 = leia.nextInt();
                    leia.nextLine();

                    int resultadoFatorial = mdc.mdc(num1,num2);

                    Mostrar = "O MDC de " + num1 + " " + num2 + " é " + resultadoFatorial;

                    resultado = resultadoFatorial;

                    Menu();
                }
                else
                {
                    Menu();
                }
                break;
            }
            case 10:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar um modulo? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Digite um numero inteiro para calcular o modulo: " );
                    int num1 = leia.nextInt();
                    leia.nextLine();

                    int resultadoModulo = modulo.modulo(num1);

                    Mostrar = "O modulo de " + num1 + " é " + resultadoModulo;

                    resultado = resultadoModulo;

                    Menu();
                }
                else
                {
                    Menu();
                }
                break;
            }
            case 11:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar uma conta de primeiro grau? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Função de Primeiro Grau!");
                    System.out.println("\n\n       aX + b = c");
                    System.out.println("\n\nDigite o valor de A: ");
                    int a = leia.nextInt();
                    leia.nextLine();

                    System.out.println("\nDigite o valor de B: ");
                    int b = leia.nextInt();
                    leia.nextLine();

                    System.out.println("\nDigite o valor de C:");
                    int c = leia.nextInt();
                    leia.nextLine();

                    int resultadoModulo = equacao1.Equacao(a,b,c);

                    if(b < 0)
                    {
                        Mostrar = a + "X - " + b + " = " + c + "       X = " + resultadoModulo ;
                    }
                    else
                    {
                        Mostrar = a + "X + " + b + " = " + c + "       X = " + resultadoModulo ;
                    }
                    resultado = resultadoModulo;

                    Menu();
                }
                else
                {
                    Menu();
                }
                break;
            }
            case 12:
            {
                System.out.println("\n\nQuer reiniciar a conta para começar uma conta de segundo grau? 1-sim");
                int escolh = leia.nextInt();
                leia.nextLine();

                if(escolh == 1)
                {
                    System.out.println("Função de Segundo Grau!");
                    System.out.println("\n\n       ax² + xb + c = 0");
                    System.out.println("\n\nDigite o valor de A: ");
                    int a = leia.nextInt();
                    leia.nextLine();

                    System.out.println("\nDigite o valor de B: ");
                    int b = leia.nextInt();
                    leia.nextLine();

                    System.out.println("\nDigite o valor de C:");
                    int c = leia.nextInt();
                    leia.nextLine();

                    int delta = (b * b) - 4 * a * c;

                    if (delta < 0)
                    {
                        System.out.println("Delta negativo, as raizes não existem :(");
                        Mostrar = "Delta = " + delta;
                    }
                    else
                    {
                        int resultadoX1 = equacao2.EquacaoX1(a,b,delta);
                        int resultadoX2 = equacao2.EquacaoX2(a,b,delta);

                        Mostrar = a + "X² + " + b + "x + " + "c = 0     x¹ = " + resultadoX1 + "  x² = " + resultadoX2;
                    }

                    Menu();
                }
                else
                {
                    Menu();
                }
                break;
            }
            case 13:
            {

            }
            case 14:
            {

            }
            case 15:
            {
                inicio();
                break;
            }
            case 16:
            {
                System.out.println("\n\nDigite um numero");
                resultado = leia.nextDouble();
                Mostrar = "" + resultado;
                Menu();
            }
            default:
            {
                System.out.println("Valor digitado incorreto: ");
                Menu();
                break;
            }
        }
    }
}