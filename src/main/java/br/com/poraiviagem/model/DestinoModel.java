package br.com.poraiviagem.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class DestinoModel {	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long idDestino;
		
		@Column(nullable = false)	
		private String nomeDestino;
		
		@Column(nullable = false)	
		private String descricaoDestino;
		
		@Column(nullable = false)
		private String cidadeDestino	;
		
		@Column(nullable = false)
		private String estadoDestino;
		
		@Column(precision = 10, scale = 2)
		private BigDecimal valorDestino;

		public long getIdDestino() {
			return idDestino;
		}

		public void setIdDestino(long idDestino) {
			this.idDestino = idDestino;
		}

		public String getNomeDestino() {
			return nomeDestino;
		}

		public void setNomeDestino(String nomeDestino) {
			this.nomeDestino = nomeDestino;
		}

		public String getDescricaoDestino() {
			return descricaoDestino;
		}

		public void setDescricaoDestino(String descricaoDestino) {
			this.descricaoDestino = descricaoDestino;
		}

		public String getCidadeDestino() {
			return cidadeDestino;
		}

		public void setCidadeDestino(String cidadeDestino) {
			this.cidadeDestino = cidadeDestino;
		}

		public String getEstadoDestino() {
			return estadoDestino;
		}

		public void setEstadoDestino(String estadoDestino) {
			this.estadoDestino = estadoDestino;
		}

		public BigDecimal getValorDestino() {
			return valorDestino;
		}

		public void setValorDestino(BigDecimal valorDestino) {
			this.valorDestino = valorDestino;
		}

		public DestinoModel() {
			super();
		}

		public DestinoModel(long idDestino, String nomeDestino, String descricaoDestino, String cidadeDestino,
				String estadoDestino, BigDecimal valorDestino) {
			super();
			this.idDestino = idDestino;
			this.nomeDestino = nomeDestino;
			this.descricaoDestino = descricaoDestino;
			this.cidadeDestino = cidadeDestino;
			this.estadoDestino = estadoDestino;
			this.valorDestino = valorDestino;
		}

		@Override
		public int hashCode() {
			return Objects.hash(cidadeDestino, descricaoDestino, estadoDestino, idDestino, nomeDestino, valorDestino);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DestinoModel other = (DestinoModel) obj;
			return Objects.equals(cidadeDestino, other.cidadeDestino)
					&& Objects.equals(descricaoDestino, other.descricaoDestino)
					&& Objects.equals(estadoDestino, other.estadoDestino) && idDestino == other.idDestino
					&& Objects.equals(nomeDestino, other.nomeDestino)
					&& Objects.equals(valorDestino, other.valorDestino);
		}

		@Override
		public String toString() {
			return "DestinoModel [idDestino=" + idDestino + ", nomeDestino=" + nomeDestino + ", descricaoDestino="
					+ descricaoDestino + ", cidadeDestino=" + cidadeDestino + ", estadoDestino=" + estadoDestino
					+ ", valorDestino=" + valorDestino + "]";
		}

	
	

	}



