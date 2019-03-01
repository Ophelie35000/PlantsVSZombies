
public class Noix extends Entite{
	
	private static final double SIZE = 0.1;
	private int sante;
	
	public Noix(double x, double y) {
		super(x, y);
		this.sante = 1500;
	}

	public double getX() {
		return super.getX();
	}
	
	public double getY() {
		return super.getY();
	}
	
	public void setPosition(Position p){
		super.setPosition(p);
	}

	public int getSante() {
		return this.sante;
	}
	
	public void enleverSante(int n) {
		this.sante -= n;
	}
	
	// met a jour l'entite : déplacement, effectuer une action
	public void step() {};
	
	// dessine l'entite, aux bonnes coordonnees
	public void dessine() {
		StdDraw.picture(this.getX(), this.getY(), "/images/noix2.png", SIZE, 2*SIZE);
	}
}
