package com.lhprado.projetotcc.domain;

import java.io.Serializable;

public class tb_recursos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer cd_recurso;
	private String vl_ram;
	private String vl_cpu;
	private String vl_disco;
	
	
	//Contrutor vazio da Classe - com ele é possível instanciar os objetos sem jogar nada para os atributos
	public tb_recursos() {	
	}

	//Construtor com os atributos - para receber e povoar os atributos: id, vl_ram, vl_cpu e vl_disco
	public tb_recursos(Integer cd_recurso, String vl_ram, String vl_cpu, String vl_disco) {
		super();
		this.cd_recurso = cd_recurso;
		this.vl_ram = vl_ram;
		this.vl_cpu = vl_cpu;
		this.vl_disco = vl_disco;
	}
	
	
	//Getters e Setters - métodos de acessos para os atributos privados
	public Integer getCd_recurso() {
		return cd_recurso;
	}

	public void setCd_recurso(Integer cd_recurso) {
		this.cd_recurso = cd_recurso;
	}

	public String getVl_ram() {
		return vl_ram;
	}

	public void setVl_ram(String vl_ram) {
		this.vl_ram = vl_ram;
	}

	public String getVl_cpu() {
		return vl_cpu;
	}

	public void setVl_cpu(String vl_cpu) {
		this.vl_cpu = vl_cpu;
	}

	public String getVl_disco() {
		return vl_disco;
	}

	public void setVl_disco(String vl_disco) {
		this.vl_disco = vl_disco;
	}
	
	//Geramento dos HashCode e Equals - para comparar o conteudo dos objetos e não pela sua posição de memória - usar somento ID (cd_recurso)
	
	//HashCode - Gerando um código para cada Objeto
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cd_recurso == null) ? 0 : cd_recurso.hashCode());
		return result;
	}
	
	
	//Equals - método que ira comparar dois objetos considerandos diverssas possibilidades (nulo, etc)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tb_recursos other = (tb_recursos) obj;
		if (cd_recurso == null) {
			if (other.cd_recurso != null)
				return false;
		} else if (!cd_recurso.equals(other.cd_recurso))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
