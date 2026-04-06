import java.util.Scanner;

public class Aula4desvioCondicional {

	public static void main(String[] args) {
		//exercicio1();
		//exercicio2();
		//exercicio3();
		//exercicio4();
		//exercicio5();
		//exercicio6();
		//exercicio7();
		//exercicio8();
		//exercicio9();
		//exercicio10();
		//exercicio11();
		//exercicio12();
		//exercicio13();
		//exercicio14();
		//exercicio15();
		//exercicio16();
		//exercicio17();
		//exercicio18();
		//exercicio19();
		exercicio20();
		
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
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	static void exercicio8() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o tamanho primeiro lado: ");
		String l1 = res.nextLine();
		double lado1 = Double.parseDouble(l1);
		
		System.out.print("Digite o tamanho do segundo lado: ");
		String l2 = res.nextLine();
		double lado2 = Double.parseDouble(l2);
		
		System.out.print("Digite o tamanho do terceiro lado: ");
		String l3 = res.nextLine();
		double lado3 = Double.parseDouble(l3);
		
		if (lado1 + lado2 == lado3) {
			System.out.print("Isso é um TRIÃNGULO!");
		} else {
			System.out.print("Não é um TRIÂNGULO!");
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio9() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o tamanho primeiro lado: ");
		String l1 = res.nextLine();
		double lado1 = Double.parseDouble(l1);
		
		System.out.print("Digite o tamanho do segundo lado: ");
		String l2 = res.nextLine();
		double lado2 = Double.parseDouble(l2);
		
		System.out.print("Digite o tamanho do terceiro lado: ");
		String l3 = res.nextLine();
		double lado3 = Double.parseDouble(l3);
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.print("Isso é um triangulo EQUILÁTERO!");
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
			System.out.print("Triângulo ISOSCELES!");
		} else {
			System.out.print("O triângulo é ESCALENO!");
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio10() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o nome de USUARIO: ");
		String usuario = res.nextLine();
		
		System.out.print("Digite sua SENHA: ");
		String senha = res.nextLine();
		
		String usuarioC = "Diogo";
		String senhaC = "diogo123";
		
		if (usuario.equals(usuarioC) && senha.equals(senhaC)) {
			System.out.print("Login efetuado!");
		} else {
			System.out.print("Sua senha ou usuário estão incorretos!");
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	static void exercicio11() {
		System.out.print("ANO BISSEXTO OU NÃO" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Digite qual o ano: ");
		String ano = res.nextLine();
		int anoR = Integer.parseInt(ano);
		
		if (anoR % 4 == 0 && anoR % 100 != 0 || anoR % 400 == 0){
			System.out.print("O ano é bissexto!");
		} else {
			System.out.print("O ano não é bissexto!");
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio12() {
		System.out.print("CALCULADORA SIMPLES" + "\n" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		String num = res.nextLine();
		double numero = Double.parseDouble(num);
		
		System.out.print("Digite o segundo numero: ");
		String num2 = res.nextLine();
		double numero2 = Double.parseDouble(num2);
		
		System.out.print("Qual operação você quer + - * /: ");
		String op = res.nextLine();
		
		double multiplicacao = numero * numero2;
		double divisao = numero / numero2;
		double subtracao = numero - numero2;
		double adicao = numero + numero2;
		
		if (op.equals("-")) {
			System.out.print("A subtração do seus numero é: "+subtracao);
		} else if (op.equals("/")) {
			System.out.print("A divisão do seus numero é: "+divisao);
		}else if (op.equals("*")) {
			System.out.print("A subtração do seus numero é: "+multiplicacao);
		}else if (op.equals("+")) {
			System.out.print("A subtração do seus numero é: "+adicao);
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	static void exercicio13() {
		System.out.print("CALCULO IMPOSTO DE RENDA" + "\n" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Digite qual o seu salario: ");
		String sal = res.nextLine();
		double salario = Double.parseDouble(sal);
		
		double imposto = 0.15;
		double total = salario * imposto;
		
		System.out.print("Seu imposto vai ser de: " + total + "Reais");
	
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	static void exercicio14() {
		System.out.print("CALCULO DESCONTO PROGRESSIVO" + "\n" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Digite qual o valor da compra: ");
		String val = res.nextLine();
		double valor = Double.parseDouble(val);
		
		double dez = valor * 0.10;
		double vinte = valor * 0.20;
		
		if (valor <= 100) {
			System.out.print("Sem desconto!");
		} else if (valor <= 499 ) {
			System.out.print("Desconto de 10%!" + dez);
		} else if (valor >= 500 ) {
			System.out.print("Desconto de 20%!" + vinte);
	}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio15() {
		Scanner res = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		String age = res.nextLine();
		double idade = Double.parseDouble(age);
		
		if (idade <= 12) {
			System.out.print("CRIANÇA");
		} else if(idade <= 17) {
			System.out.print("ADOLECESCENTE");
		} else if (idade <= 59) {
			System.out.print("ADULTO");
		} else if (idade <= 60) {
			System.out.print("IDOSO");
		}
		
	}	
	
	static void exercicio16() {
		System.out.print("MEDIA APROVADO OU REPROVADO" + "\n" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Digite sua primeira nota: ");
		String nota1 = res.nextLine();
		double n1 = Double.parseDouble(nota1);
		
		System.out.print("Digite sua segunda nota: ");
		String nota2 = res.nextLine();
		double n2 = Double.parseDouble(nota2);
		
		System.out.print("Digite sua terceira nota: ");
		String nota3 = res.nextLine();
		double n3 = Double.parseDouble(nota3);
		
		double media = (n1 + n2 + n3)/3;
		
		if (media < 7) {
			System.out.print("Aluno reprovado até uma recuperção!");
		} else {
			System.out.print("Aluno aprovado!");
		}
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio17() {
		System.out.print("EMPRESTIMO" + "\n" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Digite o valor do empréstimo: ");
		Double emp = res.nextDouble();
		
		System.out.print("Digite o valor do seu salário: ");
		Double sal = res.nextDouble();
		
		double pag = (sal * 0.30)*24;
		
		if (pag >= emp) {
			System.out.print("Empréstimo aceito!");
		} else {
			System.out.print("Empréstimo recusado!");
		}
		

		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio18() {
		System.out.print("ADIVINHAÇÃO" + "\n" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Digite um número de 1 a 10: ");
		int palp = res.nextInt();
		
		double sec = 5;
		
		if (palp > sec) {
			System.out.print("Menor");
		}  else if (palp < sec) {
			System.out.print("Maior");
		} else {
			System.out.print("ACERTOU!");
		}
		
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio19() {
		System.out.print("IMC - INDICE MASSA CORPORAL" + "\n" + "\n" );
		Scanner res = new Scanner(System.in);
		System.out.print("Seu peso: ");
		double peso = res.nextDouble();
		
		System.out.print("Sua altura: ");
		double altura = res.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc < 18.5) {
		    System.out.print("Abaixo do peso");
		} else if (imc < 25) {
		    System.out.print("Peso normal");
		} else if (imc < 30) {
		    System.out.print("Sobrepeso");
		} else {
		    System.out.print("Obesidade");
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	static void exercicio20() {
		Scanner res = new Scanner(System.in);
		
		String usuarioC = "Diogo";
		String senhaC = "diogo123";
		
		int tentativas = 0;
		
		while (tentativas < 3) {
			System.out.print("Digite o nome de USUARIO: ");
			String usuario = res.nextLine();
			System.out.print("Digite sua SENHA: ");
			String senha = res.nextLine();
			
			if (usuario.equals(usuarioC) && senha.equals(senhaC)) {
				System.out.print("Login efetuado!");
				return;
			} else {
				tentativas ++;
				System.out.println("Dados incorretos - TENTIVAS: "+ (3 - tentativas));
			} 
		}
	}
	
	
}