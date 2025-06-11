import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int main = 0;
        String digito;

        int decimal = 0;
        String binario;
        String octal;
        String hexa;

        do {
            System.out.println("====================");
            System.out.println("Seja bem vindo (a) a Calculadora de Base");
            System.out.println("Para começar escolha qual base quer calcular:");
            System.out.println("====================");
            System.out.println("1- Binario");
            System.out.println("2- Decimal");
            System.out.println("3- Octal");
            System.out.println("4- Hexadecimal");
            System.out.println("0- Sair");
            System.out.println("====================");
            main = sc.nextInt();

            if (main == 1) {
                //Conversão de Binário
                System.out.print("Digite o número binário: ");
                digito = sc.next();

                binario = digito;
                decimal = Integer.parseInt(digito, 2);
                octal = Integer.toOctalString(decimal);
                hexa = Integer.toHexString(decimal);

                System.out.println("Binario: " + binario);
                System.out.println("Decimal: "+ decimal);
                System.out.println("Octal: "+ octal);
                System.out.println("Hexadecimal: " + hexa);
            }
            if (main == 2) {
                //Conversão Decimal
                System.out.print("Digite o número Decimal: ");
                digito = sc.next();

                decimal = Integer.parseInt(digito);
                binario = Integer.toBinaryString(decimal);
                octal = Integer.toOctalString(decimal);
                hexa = Integer.toHexString(decimal);

                System.out.println("Binario: "+binario);
                System.out.println("Decimal: "+decimal);
                System.out.println("Octal: "+ octal);
                System.out.println("Hexadecimal: " + hexa);
            }
            if (main == 3) {
                //Conversão Octal
                System.out.print("Digite o número Octal: ");
                digito = sc.next();

                octal = digito;
                decimal = Integer.parseInt(octal, 8);
                binario = Integer.toBinaryString(decimal);
                hexa = Integer.toHexString(decimal);

                System.out.println("Binario: "+binario);
                System.out.println("Decimal: "+decimal);
                System.out.println("Octal: "+ octal);
                System.out.println("Hexadecimal: " + hexa);
            }
            if (main == 4) {
                //Conversão Hexadecimal
                System.out.print("Digite o número  Hexadecimal: ");
                digito = sc.next();

                hexa = digito;
                decimal = Integer.parseInt(hexa, 16);
                binario = Integer.toBinaryString(decimal);
                octal = Integer.toOctalString(decimal);

                System.out.println("Binario: "+binario);
                System.out.println("Decimal: "+decimal);
                System.out.println("Octal: "+ octal);
                System.out.println("Hexadecimal: " + hexa);
            }
        }while (main != 0);
    }
}
