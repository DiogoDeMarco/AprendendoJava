import java.util.Scanner;

public class Aula4desvioCondicional {

	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		exercicio7();
	}

	static void exercicio1() {
		Scanner res = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		String num = res.nextLine();
		double numR = Double.parseDouble(num);
		
		if (numR % 2 == 0) {
			System.out.print("Seu número é par!");
		} else {
			System.out.print("Seu número é impar!");
		}
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	static void exercicio2() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		String num = res.nextLine();
		double numero1 = Double.parseDouble(num);
		
		System.out.print("Digite o segundo número: ");
		String num2 = res.nextLine();
		double numero2 = Double.parseDouble(num2);
		
		if (numero1 > numero2) {
			System.out.print("O número 1 é maior que o 2!");
		} else {
			System.out.print("O numero 2 é maior!");
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio3() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o número: ");
		String num = res.nextLine();
		double numero1 = Double.parseDouble(num);
		
		
		if (numero1 < 0) {
			System.out.print("O número é negativo!");
		} else {
			System.out.print("O número é positivo!");
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	static void exercicio4() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite a nota final: ");
		String not = res.nextLine();
		double nota = Double.parseDouble(not);
		
		if (nota >= 6) {
			System.out.print("Aluno aprovado!");
		} else {
			System.out.print("Aluno reprovado!");
		}	
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio5() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		String age = res.nextLine();
		double idade = Double.parseDouble(age);
		
		if (idade >= 18) {
			System.out.print("Permissão pra votar!");
		} else {
			System.out.print("Sem permissão pra votar!");
		}	
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio6() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");      //NAO SEI
		String num = res.nextLine();
		double numero1 = Double.parseDouble(num);
		
		System.out.print("Digite o segundo número: ");		//NAO SEI
		String num2 = res.nextLine();
		double numero2 = Double.parseDouble(num2);
		
		System.out.print("Digite o terceiro número: ");  	//NAO SEI
		String num3 = res.nextLine();
		double numero3 = Double.parseDouble(num3);
		
		double maior = numero1;
	}
		
	static void exercicio7() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite sua nota: ");
		String not = res.nextLine();
		double nota = Double.parseDouble(not);
		
		if (nota <= 4) {
			System.out.print("NOTA INSUFICIENTE!");
		} else if(nota <= 6) {
			System.out.print("NOTA REGULAR");
		} else if (nota <= 8) {
			System.out.print("NOTA BOA");
		} else if (nota >= 9) {
			System.out.print("NOTA EXCELENTE");
		}
		
	}	
}
