
public class Soleil extends Entite  {

	private static final double SIZE = 0.07;
	private Timer timer;
	
	public Soleil(double x, double y) {
		super(x, y);
		timer = new Timer(20000); // pour disparaitre apres 20 secondes
	}

	public double getX() {
		return super.getX();
	}

	public double getY() {
		return super.getY();
	}

	public void setPosition(Position p) {
		super.setPosition(p);
	}
	
	public boolean timerFini() {
		return timer.hasFinished();
	}

	// met a jour l'entite : deplacement, effectuer une action
	public void step() {};

	// dessine l'entite, aux bonnes coordonnees
	public void dessine() {
		StdDraw.picture(this.getX(), this.getY(), "/images/soleil.png", SIZE, 2*SIZE);
	}

}
