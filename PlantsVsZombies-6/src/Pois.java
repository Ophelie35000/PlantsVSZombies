
public class Pois extends Entite {
	private static final double MOVE_X = 0.001;
	private static final double SIZE = 0.01;
	
	public Pois(double x, double y) {
		super(x, y);
	}

	public void step() {
		this.position.setX(this.position.getX() + MOVE_X);
	}

	public void dessine() {
		StdDraw.picture(this.getX()+0.02, this.getY()+0.02, "/images/pois.png", 2*SIZE, 4*SIZE);
	}
}
