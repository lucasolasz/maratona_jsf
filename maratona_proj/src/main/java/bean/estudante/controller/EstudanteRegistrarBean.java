package bean.estudante.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.el.LambdaExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import bean.estudante.model.Estudante;


@ManagedBean
@ViewScoped
public class EstudanteRegistrarBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Estudante estudante = new Estudante();
	private String[] nomesArray = {"DevDojo", "eh", "legal"};
	private List<String> nomesList = Arrays.asList("Manoel", "Lucas", "Renato");
	private Set<String> nomeSet = new HashSet<>(Arrays.asList("Manoel", "Lucas", "Renato"));
	private Map<String, String> nomesMap = new HashMap<>();
	private boolean mostrarNotas;
	private boolean mostrarLink;
	
	{
		
		nomesMap.put("Goku", "O mais forte");
		nomesMap.put("One Piece", "O mais longo");
		nomesMap.put("Naruto", "O mais lenga lenga");
	}
	
	
	
	public void calcularCubo(LambdaExpression le, long value) {
		
		long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
		System.out.println(result);
	}
	
	public void executar(String param) {
		System.out.println("Fazendo busca no BD com parametro " + param);
		System.out.println("Processando dados");
		System.out.println("Exibindo Dados");
	}
	
	public String executarRetorno(String param) {
		return "Quem é o Lindao? " + param; 
	}
	
	public String proximaPag() {
		return "index2";
	}
	
	public String exibirNotas() {
		this.mostrarNotas = true;
		return "index";
		
	}
	
	public String esconderNotas() {
		this.mostrarNotas = false;
		return "index";
		
	}
	
	public String exibirLink() {
		this.mostrarLink = true;
		return "index";
		
	}
	
	public String esconderLink() {
		this.mostrarLink = false;
		return "index";
		
	}
	
	
	
	//Consulta ao banco
	public void executar() {
		System.out.println("Fazendo busca no BD");
		System.out.println("Processando dados");
		System.out.println("Exibindo Dados");
	}
	
	
	
	
	public boolean isMostrarLink() {
		return mostrarLink;
	}

	public void setMostrarLink(boolean mostrarLink) {
		this.mostrarLink = mostrarLink;
	}

	public boolean isMostrarNotas() {
		return mostrarNotas;
	}

	public void setMostrarNotas(boolean mostrarNotas) {
		this.mostrarNotas = mostrarNotas;
	}

	public String[] getNomesArray() {
		return nomesArray;
	}

	public void setNomesArray(String[] nomesArray) {
		this.nomesArray = nomesArray;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

	public List<String> getNomesList() {
		return nomesList;
	}

	public void setNomesList(List<String> nomesList) {
		this.nomesList = nomesList;
	}

	public Set<String> getNomeSet() {
		return nomeSet;
	}

	public void setNomeSet(Set<String> nomeSet) {
		this.nomeSet = nomeSet;
	}

	public Map<String, String> getNomesMap() {
		return nomesMap;
	}

	public void setNomesMap(Map<String, String> nomesMap) {
		this.nomesMap = nomesMap;
	}
	
		
	

}
