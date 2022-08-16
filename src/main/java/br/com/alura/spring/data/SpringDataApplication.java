//teste
package br.com.alura.spring.data;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.spring.data.service.CargoService;


@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private CargoService cargoService;
	private Scanner scanner ;
	private Boolean finalizarApp = Boolean.FALSE;
	
	
	public SpringDataApplication(CargoService cargoService) {
		super();
		this.cargoService = cargoService;
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String opcao;
		while (!finalizarApp) {
			System.out.println("Digite a opção:");
			System.out.println("0-Incluir Cargo");
			System.out.println("1-Excluir cargo por descricao");
			System.out.println("2-Excluir cargo por ID");
			System.out.println("3-Atualizar por ID");
			System.out.println("4-Atualizar por nome");
			System.out.println("5-Listar Cargos");
			System.out.println("X-Sair");

			opcao=scanner.next();
			switch (opcao) {
			case "0":
				cargoService.salvar(scanner);
				break;
			case "1":
				cargoService.excluirPorDescricao(scanner);
				break;
			case "2":
				cargoService.excluirPorId(scanner);
				break;
			case "3":
				cargoService.atualizarPorId(scanner);
				break;
			case "4":
				cargoService.atualizarPorNome(scanner);
				break;
			case "5":
				cargoService.listarCargos();
				break;

				
			case "X":
				finalizarApp = Boolean.TRUE;
				break;


			default:
				System.out.println("----  OPCAO INVALIDA -------");
				break;
			}
			
		}
//		Cargo cargo = new Cargo("Desenvolvedor de Software");
//		cargorepository.save(cargo);
//
//		cargo = new Cargo("Desenvolvedor de Software 2");
//		cargorepository.save(cargo);
//
//		cargo = new Cargo("Desenvolvedor de Software 3");
//		cargorepository.save(cargo);
//
//
//		cargo = new Cargo();
//		cargo.setDescricao("Teste");
//		cargorepository.save(cargo);
//		
////		cargorepository.deleteAll();

	}

}
