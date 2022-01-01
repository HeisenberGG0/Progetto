
public class Ristorante {
  
  import java.util.LinkedList;
	import java.util.List;

	public class Ristorante {

		private int CodiceRistorante;
		private String Nome;
		private String Indirizzo;
		private String SitoWeb;
		private int NumeroTelefono;
		private int NumeroCellulare;
		private String Email;
		
		private List<Sala> ContieneSale;
		
		public Ristorante(String Nome, List<Sala> sale) {
			
			this.setNome(Nome);
			
			if(sale==null || sale.isEmpty()){
				
				throw new IllegalArgumentException("Il ristorante non ha sale ed è in fase di costruzione.");
			}
			this.setContieneSale(sale);
			
		}
		
		
		
		
		public void stampa(){
			System.out.println("Dettagli del Ristorante: " +this.getNome());
			for(Sala s: ContieneSale) {
				s.stampa();
			}
		
		}
		
		

		
		
		
		
		

		public int getCodiceRistorante() {
			return CodiceRistorante;
		}

		public void setCodiceRistorante(int codiceRistorante) {
			CodiceRistorante = codiceRistorante;
		}

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public String getIndirizzo() {
			return Indirizzo;
		}

		public void setIndirizzo(String indirizzo) {
			Indirizzo = indirizzo;
		}

		public String getSitoWeb() {
			return SitoWeb;
		}

		public void setSitoWeb(String sitoWeb) {
			SitoWeb = sitoWeb;
		}

		public int getNumeroTelefono() {
			return NumeroTelefono;
		}

		public void setNumeroTelefono(int numeroTelefono) {
			NumeroTelefono = numeroTelefono;
		}

		public int getNumeroCellulare() {
			return NumeroCellulare;
		}

		public void setNumeroCellulare(int numeroCellulare) {
			NumeroCellulare = numeroCellulare;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}











		public List<Sala> getContieneSale() {
			return ContieneSale;
		}






		public void setContieneSale(List<Sala> contieneSale) {
      	if(contieneSale==null || contieneSale.isEmpty()){
				
				throw new IllegalArgumentException("Il ristorante non ha sale ed è in fase di costruzione.");
			}
			
		}
		
	}




}
