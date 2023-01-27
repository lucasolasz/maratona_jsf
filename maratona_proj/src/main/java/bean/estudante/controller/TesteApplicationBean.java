package bean.estudante.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable{
	
	
	private List<String> categoriaList;
	
	@PostConstruct
	public void init() {
		System.out.println("Entrou no PostConstruct do ApplicationScoped");
		categoriaList = Arrays.asList("RPG", "SCI-FI", "Terror");
	}
	
	public void mudarLista() {
		categoriaList = Arrays.asList("RPG", "SCI-FI", "Terror", "WARNING");
	}
	

	public List<String> getCategoriaList() {
		return categoriaList;
	}

	public void setCategoriaList(List<String> categoriaList) {
		this.categoriaList = categoriaList;
	}
	
	
	
	
}
