package br.com.alura.spring.data.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import br.com.alura.spring.data.orm.Cargo;
import br.com.alura.spring.data.repository.CargoRepository;

@Service
public class CargoService {

	private CargoRepository cargoRepository;

	public CargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public void salvar(Scanner scanner) {
		String descricao;
		System.out.println("Informe a descricao:");
		descricao = scanner.next();
		Cargo cargo =new Cargo(descricao);
		cargoRepository.save(cargo);
	}

	public void excluirPorDescricao(Scanner scanner) {
		String descricao;
		System.out.println("Informe a descricao a excluir:");
		descricao = scanner.next();
		cargoRepository.findAll().forEach(cargo -> {
			if ( cargo.getDescricao().compareTo(descricao)==0)
				cargoRepository.delete(cargo);
		});
	}

	public void excluirPorId(Scanner scanner) {
		String id;
		Long pid;
		System.out.println("Informe o ID:");
		id = scanner.next();
		pid=Long.valueOf(id);
		System.out.println("ID INFORMADO:  " + pid);
		cargoRepository.deleteById(pid);
	}

	public void atualizarPorId(Scanner scanner) {
		String id;
		Long pid;
		System.out.println("Informe o ID:");
		id = scanner.next();
		pid=Long.valueOf(id);

		Optional<Cargo> cargo = cargoRepository.findById(pid);
		
		if (cargo.isEmpty()) {
			System.out.println("ID não encontrado !!!");
		} else
		{
			atualizar(cargo.get(), scanner);
		}
	}

	
	
	
	public void atualizarPorNome(Scanner scanner) {

		String descricao;
		System.out.println("Informe a descricao anterior :");
		descricao = scanner.next();
		Iterator<Cargo> it= cargoRepository.findAll().iterator();
		Cargo cargo;
		while (it.hasNext()) {
			cargo = it.next();
			if (cargo.getDescricao().compareToIgnoreCase(descricao)==0) {
				atualizar(cargo, scanner);
			}
			
		}
	}

	public void atualizar(Cargo cargo,Scanner scanner) {
		String descricao;
		System.out.println("Informe a nova descricao:");
		descricao = scanner.next();
		cargo.setDescricao(descricao);
		cargoRepository.save(cargo);
		
	}

	public void listarCargos() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("CARGOS CADASTRADOS");
		cargoRepository.findAll().forEach(System.out::println);
		System.out.println("---------------------------------");
		
	}
	
	
}
