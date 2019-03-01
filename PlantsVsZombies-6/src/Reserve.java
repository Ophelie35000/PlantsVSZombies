
public class Reserve {
	
	private int unites;
	
	public Reserve() {
		this.unites = 50;
	}

	public int getReserve() {
		return this.unites;
	}
	
	public void ajouterReserve(int n) {
		this.unites += n;
	}
	
	public void enleverReserve(int n) {
		this.unites -= n;
	}
	
	public String toString() {
		return "Vous avez " + this.unites + " unites de soleil dans votre reserve.";
	}
}
