package com.lhprado.projetotcc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity()
@Table(name =  "tblrecursos")
public class tblrecursos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private String memoria_ram;
	private String cpu;
	private String disco;
	private String data_tmp;
	
	
	//Construtor vazio da Classe - com ele é possível instanciar os objetos sem jogar nada para os atributos
	public tblrecursos() {
	}

	//Construtor com os atributos - para receber e povoar os atributos: id, vl_ram, vl_cpu e vl_disco
	public tblrecursos(Integer id, String memoriaRam, String cpu, String disco) {
		super();
		this.id = id;
		this.memoria_ram = memoriaRam;
		this.cpu = cpu;
		this.disco = disco;
	}	

	//HashCode e Equals - comparar o conteudo dos objetos e não pela sua posição de memória - usar somento ID (cd_recurso)
			
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	//Equals - método que ira comparar dois objetos considerando diverssas possibilidades (nulo, etc)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tblrecursos other = (tblrecursos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemoria_ram() {
		return memoria_ram;
	}

	public void setMemoria_ram(String memoria_ram) {
		this.memoria_ram = memoria_ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public String getData_tmp() {
		return data_tmp;
	}

	public void setData_tmp(String data_tmp) {
		this.data_tmp = data_tmp;
	}

	
	

	
	
	

	
	

	
	
	

	
	
	
	
	
}
