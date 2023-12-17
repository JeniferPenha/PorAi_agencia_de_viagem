package br.com.poraiviagem.model;


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
public class ReservaModel {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long idReserva;
		
		@Column(nullable = false, name ="inicioDtReserva")
		@DateTimeFormat(iso = ISO.DATE)
		private LocalDate inicioDtReserva;
		
		@Column(nullable = false, name ="finalDtReserva")
		@DateTimeFormat(iso = ISO.DATE)
		private LocalDate finalDtReserva;
		
		@ManyToOne
		@JoinColumn(name = "idCliente")
		private ClienteModel nomeCliente;
		
		@ManyToOne
		@JoinColumn(name = "idDestino")
		private DestinoModel nomeDestino;

		public long getIdReserva() {
			return idReserva;
		}

		public void setIdReserva(long idReserva) {
			this.idReserva = idReserva;
		}

		public LocalDate getInicioDtReserva() {
			return inicioDtReserva;
		}

		public void setInicioDtReserva(LocalDate inicioDtReserva) {
			this.inicioDtReserva = inicioDtReserva;
		}

		public LocalDate getFinalDtReserva() {
			return finalDtReserva;
		}

		public void setFinalDtReserva(LocalDate finalDtReserva) {
			this.finalDtReserva = finalDtReserva;
		}

		public ClienteModel getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(ClienteModel nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public DestinoModel getNomeDestino() {
			return nomeDestino;
		}

		public void setNomeDestino(DestinoModel nomeDestino) {
			this.nomeDestino = nomeDestino;
		}

		public ReservaModel() {
			super();
		}

		public ReservaModel(long idReserva, LocalDate inicioDtReserva, LocalDate finalDtReserva,
				ClienteModel nomeCliente, DestinoModel nomeDestino) {
			super();
			this.idReserva = idReserva;
			this.inicioDtReserva = inicioDtReserva;
			this.finalDtReserva = finalDtReserva;
			this.nomeCliente = nomeCliente;
			this.nomeDestino = nomeDestino;
		}

		@Override
		public int hashCode() {
			return Objects.hash(finalDtReserva, idReserva, inicioDtReserva, nomeCliente, nomeDestino);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ReservaModel other = (ReservaModel) obj;
			return Objects.equals(finalDtReserva, other.finalDtReserva) && idReserva == other.idReserva
					&& Objects.equals(inicioDtReserva, other.inicioDtReserva)
					&& Objects.equals(nomeCliente, other.nomeCliente) && Objects.equals(nomeDestino, other.nomeDestino);
		}

		@Override
		public String toString() {
			return "ReservaModel [idReserva=" + idReserva + ", inicioDtReserva=" + inicioDtReserva + ", finalDtReserva="
					+ finalDtReserva + ", nomeCliente=" + nomeCliente + ", nomeDestino=" + nomeDestino + "]";
		}

		

}