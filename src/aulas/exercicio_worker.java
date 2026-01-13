package aulas; // define o pacote onde esta classe fica

import java.text.ParseException; // excecao usada quando uma data nao pode ser lida
import java.text.SimpleDateFormat; // classe que converte texto em data e vice-versa
import java.util.Date; // representa uma data completa
import java.util.Locale; // define regras de formato de numeros e datas
import java.util.Scanner; // le dados digitados pelo usuario

import entities.Department; // classe que representa um departamento
import entities.HourContract; // classe que representa um contrato por hora
import entities.Worker; // classe que representa um trabalhador
import entities.enums.WorkerLevel; // enum com os niveis possiveis do trabalhador

public class exercicio_worker { // declara a classe principal do exercicio

	public static void main(String[] args) throws ParseException { // ponto de entrada do programa

		Locale.setDefault(Locale.US); // usa ponto como separador decimal
		Scanner sc = new Scanner(System.in); // cria o leitor do teclado
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // define o formato de data esperado
		
		System.out.print("Enter department's name: "); // pede o nome do departamento
		String departmentName = sc.nextLine(); // le o nome digitado
		System.out.println("Enter worker data:"); // informa que vai ler dados do trabalhador
		System.out.print("Name: "); // pede o nome do trabalhador
		String workerName = sc.nextLine(); // le o nome do trabalhador
		System.out.print("Level: "); // pede o nivel do trabalhador
		String workerLevel = sc.nextLine(); // le o nivel digitado como texto
		System.out.print("Base salary: "); // pede o salario base
		double baseSalary = sc.nextDouble(); // le o salario base como numero
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName)); // cria o trabalhador com seus dados
		
		System.out.print("How many contracts to this worker? "); // pergunta quantos contratos existem
		int n = sc.nextInt(); // le a quantidade de contratos
		
		for (int i = 1; i <= n; i++) { // repete o cadastro para cada contrato
			System.out.println("Enter contract #" + i + " data:"); // mostra qual contrato esta sendo lido
			System.out.print("Date (DD/MM/YYYY): "); // pede a data do contrato
			Date contractDate = sdf.parse(sc.next()); // le o texto e converte para data
			System.out.print("Value per hour: "); // pede o valor por hora
			double valuePerHour = sc.nextDouble(); // le o valor por hora
			System.out.print("Duration (hours): "); // pede a quantidade de horas
			int hours = sc.nextInt(); // le as horas trabalhadas
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); // cria um contrato com os dados
			worker.addContract(contract); // adiciona o contrato ao trabalhador
		} // fim do laco de contratos
		
		System.out.println(); // imprime uma linha em branco para separar a saida
		System.out.print("Enter month and year to calculate income (MM/YYYY): "); // pede mes e ano para calcular renda
		String monthAndYear = sc.next(); // le o mes e ano como texto
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); // pega os 2 primeiros caracteres como mes
		int year = Integer.parseInt(monthAndYear.substring(3)); // pega os ultimos 4 caracteres como ano
		System.out.println("Name: " + worker.getName()); // mostra o nome do trabalhador
		System.out.println("Department: " + worker.getDepartment().getName()); // mostra o nome do departamento
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month))); // calcula e mostra a renda do mes
		
		sc.close(); // fecha o leitor para liberar recursos
	} // fim do metodo main
} // fim da classe exercicio_worker
