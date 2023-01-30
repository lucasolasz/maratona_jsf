package bean.estudante.controller;

import java.io.Serializable;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;



@Named 
@FlowScoped(value = "registration")
public class TesteFlowBean implements Serializable{
	
	private String nome;
	private String sobrenome;
	private String endereco;
	
	public String salvar() {
		
		System.out.println("Salvando nome");
		System.out.println("Salvando sobrenome");
		System.out.println("Salvando endereco");
		
		return "exitToInicio";
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	
}
