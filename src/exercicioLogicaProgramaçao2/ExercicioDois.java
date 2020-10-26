package exercicioLogicaProgramaçao2;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o salario: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Informe o percentual de reajuste: ");
		double reajuste = scanner.nextInt();
		
		double salarioAjustado = salario + (salario * reajuste / 100);
		System.out.println("Novo Salario: " + salarioAjustado);
		
		scanner.close();
	}

}
