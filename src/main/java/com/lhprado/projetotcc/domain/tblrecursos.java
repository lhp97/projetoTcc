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
	private String vlram;
	private String vlcpu;
	private String vldisco;
	private String datatmp;
	
	
	//Construtor vazio da Classe - com ele é possível instanciar os objetos sem jogar nada para os atributos
	public tblrecursos() {
	}

	//Construtor com os atributos - para receber e povoar os atributos: id, vl_ram, vl_cpu e vl_disco
	public tblrecursos(Integer id, String vlRam, String vlCpu, String vlDisco) {
		super();
		this.id = id;
		this.vlram = vlRam;
		this.vlcpu = vlCpu;
		this.vldisco = vlDisco;
	}
	
	//Getters e Setters - métodos de acessos para os atributos privados
	

	//Geramento dos HashCode e Equals - para comparar o conteudo dos objetos e não pela sua posição de memória - usar somento ID (cd_recurso)
	
	//HashCode - Gerando um código para cada Objeto
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		tblrecursos other = (tblrecursos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVlram() {
		return vlram;
	}

	public void setVlram(String vlram) {
		this.vlram = vlram;
	}

	public String getVlcpu() {
		return vlcpu;
	}

	public void setVlcpu(String vlcpu) {
		this.vlcpu = vlcpu;
	}

	public String getVldisco() {
		return vldisco;
	}

	public void setVldisco(String vldisco) {
		this.vldisco = vldisco;
	}

	public String getDatatmp() {
		return datatmp;
	}

	public void setDatatmp(String datatmp) {
		this.datatmp = datatmp;
	}

	

	
	
	

	
	

	
	
	

	
	
	
	
	
}
