import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 09/04/2023 */

public class App{
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);


        System.out.println("Quando você ganha por hora?");
        double vlSal = scan.nextDouble();

        System.out.println("Quantas horas por mês você trabalha?");
        double qntHora = scan.nextDouble();

        double salarioBruto = vlSal * qntHora;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;


        System.out.println("+ Salário Bruto:  R$" + salarioBruto);
        System.out.println("- IR: R$" +  ir);
        System.out.println("- INSS: R$" +  inss);
        System.out.println("- Sindicato: R$" +  sindicato);
        System.out.println("- Salário bruto: R$" +  (salarioBruto - (ir + inss + sindicato)));

        scan.close();
    }
}
