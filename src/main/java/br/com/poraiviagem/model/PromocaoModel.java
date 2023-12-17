package br.com.poraiviagem.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class PromocaoModel {
	
		@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private long idPromocao;
	 	
	 	@Column(nullable = false)
	 	private String descricaoPromocao;
	 	
	 	@Column(precision = 10, scale = 2)
	 	private BigDecimal valorPromocao;
	 	
	 	@Column(nullable = false, name ="inicioDtPromocao")
	 	@DateTimeFormat(iso = ISO.DATE)
	 	private LocalDate inicioDTPromocao;
	 	
	 	@Column(nullable = false, name ="finalDtPromocao")
	 	@DateTimeFormat(iso = ISO.DATE)
	 	private LocalDate finalDtPromocao;
	 	
	     @ManyToOne
	     @JoinColumn(name = "idCliente")	
	     private ClienteModel nomeCliente;

	 	public long getIdPromocao() {
	 		return idPromocao;
	 	}

	 	public void setIdPromocao(long idPromocao) {
	 		this.idPromocao = idPromocao;
	 	}

	 	public String getDescricaoPromocao() {
	 		return descricaoPromocao;
	 	}

	 	public void setDescricaoPromocao(String descricaoPromocao) {
	 		this.descricaoPromocao = descricaoPromocao;
	 	}

	 	public BigDecimal getValorPromocao() {
	 		return valorPromocao;
	 	}

	 	public void setValorPromocao(BigDecimal valorPromocao) {
	 		this.valorPromocao = valorPromocao;
	 	}

	 	public LocalDate getInicioDTPromocao() {
	 		return inicioDTPromocao;
	 	}

	 	public void setInicioDTPromocao(LocalDate inicioDTPromocao) {
	 		this.inicioDTPromocao = inicioDTPromocao;
	 	}

	 	public LocalDate getFinalDtPromocao() {
	 		return finalDtPromocao;
	 	}

	 	public void setFinalDtPromocao(LocalDate finalDtPromocao) {
	 		this.finalDtPromocao = finalDtPromocao;
	 	}

	 	public ClienteModel getCliente() {
	 		return nomeCliente;
	 	}

	 	public void setCliente(ClienteModel cliente) {
	 		this.nomeCliente = cliente;
	 	}

		public PromocaoModel() {
			super();
		}

		public PromocaoModel(long idPromocao, String descricaoPromocao, BigDecimal valorPromocao,
				LocalDate inicioDTPromocao, LocalDate finalDtPromocao, ClienteModel cliente) {
			super();
			this.idPromocao = idPromocao;
			this.descricaoPromocao = descricaoPromocao;
			this.valorPromocao = valorPromocao;
			this.inicioDTPromocao = inicioDTPromocao;
			this.finalDtPromocao = finalDtPromocao;
			this.nomeCliente = cliente;
		}

		@Override
		public int hashCode() {
			return Objects.hash(nomeCliente, descricaoPromocao, finalDtPromocao, idPromocao, inicioDTPromocao,
					valorPromocao);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PromocaoModel other = (PromocaoModel) obj;
			return Objects.equals(nomeCliente, other.nomeCliente) && Objects.equals(descricaoPromocao, other.descricaoPromocao)
					&& Objects.equals(finalDtPromocao, other.finalDtPromocao) && idPromocao == other.idPromocao
					&& Objects.equals(inicioDTPromocao, other.inicioDTPromocao)
					&& Objects.equals(valorPromocao, other.valorPromocao);
		}

		@Override
		public String toString() {
			return "PromocaoModel [idPromocao=" + idPromocao + ", descricaoPromocao=" + descricaoPromocao
					+ ", valorPromocao=" + valorPromocao + ", inicioDTPromocao=" + inicioDTPromocao
					+ ", finalDtPromocao=" + finalDtPromocao + ", cliente=" + nomeCliente + "]";
		}

	

	 }



