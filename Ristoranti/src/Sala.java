

  public class Sala {

	private String NomeSala;
	private int Capienza;
	private enum TipodiSala {INGRESSO, ADULTI, RAGAZZI, BAMBINI};
	private boolean AngoloRistoro;
	private enum Design {CLASSICO, RUSTICO, MODERNO, ELEGANTE, ANTICO};
	
	private Ristorante AppartienealRistorante;

	
	public Sala(String NomeSala) {
		this.setNomeSala(NomeSala);
	

		
	}
	
	
	public void stampa(){
		System.out.println("Sala "+this.NomeSala);
	}
	
	
	public Ristorante getAppartienealRistorante() {
		return AppartienealRistorante;
	}

	public void setAppartienealRistorante(Ristorante AppartienealRistorante) {
		if(AppartienealRistorante==null){
			throw new IllegalArgumentException("La Sala non appartiene a nessun ristorante");
		}
		this.setAppartienealRistorante(AppartienealRistorante);
	}



	public String getNomeSala() {
		return NomeSala;
	}



	public void setNomeSala(String nomeSala) {
		NomeSala = nomeSala;
	}
}

  


