
public class Tournesol extends Entite {
	
	private static final double SIZE = 0.08;
	private int sante;
	private Timer timer;
	
	public Tournesol(double x, double y) {
		super(x, y);
		this.sante = 300;
		timer = new Timer(24000); // pour produire un tournesol toutes les 24 secondes
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
	
	public boolean timerFini() {
		return timer.hasFinished();
	}
	
	public void timerReset() {
		timer.restart();
	}
	
	// met a jour l'entite : deplacement, effectuer une action
	public void step() {};
	
	// dessine l'entite, aux bonnes coordonnees
	public void dessine() {
		StdDraw.picture(this.getX(), this.getY(), "/images/tournesol.png", SIZE, 2*SIZE);
	}
}
