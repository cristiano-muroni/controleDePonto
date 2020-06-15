import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class GerenciarControlePonto {

	public static void main(String[] args) throws InterruptedException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Gerente> gerentes = new ArrayList<Gerente>();
		List<Secretaria> secretarias = new ArrayList<Secretaria>();
		List<Operador> operadores = new ArrayList<Operador>();
		List<RegistroPonto> registrandoPontos = new ArrayList<RegistroPonto>();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		Gerente gerente = null;
		Secretaria secretaria = null;
		Operador operador = null;
		// Funcionario funcionario = null;

		for (int i = 1; i <= 1; i++) {

			gerente = new Gerente();// inicio da captura de dados do gerente
			System.out.println("digite o id do gerente");
			gerente.setIdFunc(Integer.parseInt(sc.nextLine()));
			System.out.println("digite o nome do gerente");
			gerente.setNome(sc.nextLine());
			System.out.println("digite o email do gerente");
			gerente.setEmail(sc.nextLine());
			System.out.println("digite o CPF do gerente");
			gerente.setDocumento(sc.nextLine());
			System.out.println("digite o login do gerente-->" + "o login é: gerentebravo");
			gerente.setLogin(sc.nextLine());// obs o login é gerentebravo
			System.out.println("digite a senha do gerente" + "a senha é: maiseleegentefina");
			gerente.setSenha(sc.nextLine());// obs o login é maiseleegentefina

			gerentes.add(gerente);// add na lista de gerentes
			funcionarios.add(gerente);

			secretaria = new Secretaria();// inicio da captura de dados da secretaria
			System.out.println("Digite o Id da secretaria");
			secretaria.setIdFunc(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite o nome da secretaria");
			secretaria.setNome(sc.nextLine());
			System.out.println("Digite o email da secretaria");
			secretaria.setEmail(sc.nextLine());
			System.out.println("Digite o cpf da secretaria");
			secretaria.setDocumento(sc.nextLine());
			System.out.println("Digite o telefone da secretaria");
			secretaria.setTelefone(sc.nextLine());
			System.out.println("Digite o ramal");
			secretaria.setRamal(sc.nextLine());

			secretarias.add(secretaria);// add na lista de secretarias
			funcionarios.add(secretaria);

			operador = new Operador();// inicio da captura dos dados dos operadores
			System.out.println("digite o id do operador");
			operador.setIdFunc(Integer.parseInt(sc.nextLine()));
			System.out.println("Digite o nome do operador");
			operador.setNome(sc.nextLine());
			System.out.println("Digite o email do operador");
			operador.setEmail(sc.nextLine());
			System.out.println("Digite o CPF do operador");
			operador.setDocumento(sc.nextLine());
			System.out.println("digite o valor hora do operador");
			operador.setValorHora(Double.parseDouble(sc.nextLine()));

			operadores.add(operador);// add operadores na lista
			funcionarios.add(operador);
			// logo abaixo iremos seguir registrando os pontos de ambos
			RegistroPonto registroponto1 = new RegistroPonto();
			registroponto1.setDataRegistro(java.time.LocalDate.now());
			registroponto1.setHoraEntrada(java.time.LocalDateTime.now());
			Thread.sleep(8000);
			registroponto1.setHoraSaida(java.time.LocalDateTime.now());

			RegistroPonto registroponto2 = new RegistroPonto();
			registroponto2.setDataRegistro(java.time.LocalDate.now());
			registroponto2.setHoraEntrada(java.time.LocalDateTime.now());
			Thread.sleep(8000);
			registroponto2.setHoraSaida(java.time.LocalDateTime.now());

			RegistroPonto registroponto3 = new RegistroPonto();
			registroponto3.setDataRegistro(java.time.LocalDate.now());
			registroponto3.setHoraEntrada(java.time.LocalDateTime.now());
			Thread.sleep(8000);
			registroponto3.setHoraSaida(java.time.LocalDateTime.now());

			registrandoPontos.add(registroponto1);
			registrandoPontos.add(registroponto2);
			registrandoPontos.add(registroponto3);

		}

		for (RegistroPonto run : registrandoPontos) {
			run.apresentarRegistroPonto();

		}

		sc.close();
	}

}
