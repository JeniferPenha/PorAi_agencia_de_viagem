package br.com.poraiviagem.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ClienteModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long idCliente;
		
		@Column(nullable = false)
		private String nomeCliente;
		
		@Column(nullable = false)
		private String cpfCliente;
		
		@Column(nullable = false)
		private String emailCliente;
		
		@Column(nullable = false)
		private String telefoneCliente;
		
		public long getIdCliente() {
			return idCliente;		
			
		}
		public void setIdCliente(long idCliente) {
			this.idCliente = idCliente;
		}
		public String getNome() {
			return nomeCliente;
		}
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		public void setNome(String nome) {
			this.nomeCliente = nome;
		}
		public String getCpfCliente() {
			return cpfCliente;
		}
		public void setCpfCliente(String cpfCliente) {
			this.cpfCliente = cpfCliente;
		}
		public String getEmailCliente() {
			return emailCliente;
		}
		public void setEmailCliente(String emailCliente) {
			this.emailCliente = emailCliente;
		}
		public String getTelefoneCliente() {
			return telefoneCliente;
		}
		public void setTelefoneCliente(String telefoneCliente) {
			this.telefoneCliente = telefoneCliente;
		}
		public ClienteModel() {
			super();
		}
		public ClienteModel(long idCliente, String nomeCliente, String cpfCliente, String emailCliente, String telefoneCliente) {
			super();
			this.idCliente = idCliente;
			this.nomeCliente = nomeCliente;
			this.cpfCliente = cpfCliente;
			this.emailCliente = emailCliente;
			this.telefoneCliente = telefoneCliente;
		}
		@Override
		public int hashCode() {
			return Objects.hash(nomeCliente, cpfCliente, emailCliente, idCliente, telefoneCliente);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ClienteModel other = (ClienteModel) obj;
			return Objects.equals(cpfCliente, other.cpfCliente) && Objects.equals(emailCliente, other.emailCliente)
					&& idCliente == other.idCliente && Objects.equals(nomeCliente, other.nomeCliente)
					&& Objects.equals(telefoneCliente, other.telefoneCliente);
		}
		@Override
		public String toString() {
			return "ClienteModel [idCliente=" + idCliente + ", nome=" + nomeCliente + ", cpfCliente=" + cpfCliente
					+ ", emailCliente=" + emailCliente + ", telefoneCliente=" + telefoneCliente + "]";
		}
		
		
	}


