
public class Zombie extends Entite {

	private static final double MOVE_X = 0.0005;
	private static final double SIZE = 0.09;
	private int sante;
	private double hasardBlindage; // pour determiner si zombie blinde ou non
	private double typeBlinde; // pour choisir l'apparence
	private Timer coupsTimer; // pour 1 coup par seconde
	private Timer attaqueTimer; // pour s'arreter lorsque devant un ennemi
	
	public Zombie(double x, double y) {
		super(x, y);
		coupsTimer = new Timer(1000);
		attaqueTimer = new Timer(0);
		hasardBlindage = 20*Math.random();
		if (hasardBlindage < 19 ) { // une chance sur 2 d'etre un zombie blinde
			this.sante = 200;
			typeBlinde = 2;
		}
		else {
			this.sante = 560;
			typeBlinde = 2*Math.random();
		}
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
	
	public void attaquePlante(Entite n) {
		if (n instanceof Tournesol) {
			int santeEnnemi = ((Tournesol) n).getSante();
			if (santeEnnemi > 0) {
				attaqueTimer = new Timer( (santeEnnemi / 30) * 1000);
				if (coupsTimer.hasFinished()) {
					((Tournesol) n).enleverSante(30);
					coupsTimer.restart();
				}
			}
		}
		else if (n instanceof Noix) {
			int santeEnnemi = ((Noix) n).getSante();
			if (santeEnnemi > 0) {
				attaqueTimer = new Timer( (santeEnnemi / 30) * 1000);
				if (coupsTimer.hasFinished()) {
					((Noix) n).enleverSante(30);
					coupsTimer.restart();
				}
			}
		}
		else if (n instanceof TirePois) {
			int santeEnnemi = ((TirePois) n).getSante();
			if (santeEnnemi > 0) {
				attaqueTimer = new Timer( (santeEnnemi / 30) * 1000);
				if (coupsTimer.hasFinished()) {
					((TirePois) n).enleverSante(30);
					coupsTimer.restart();
				}
			}
		} 
	}
	
	// met a jour l'entite : deplacement, effectuer une action
	public void step() {
		if (attaqueTimer.hasFinished()) this.position.setX(this.position.getX() - MOVE_X);
	}
	
	// dessine l'entite, aux bonnes coordonnees
	public void dessine() {
		if (typeBlinde == 2) StdDraw.picture(this.getX(), this.getY(), "/images/zombie1.png", SIZE, 2*SIZE);
		else if (typeBlinde < 2 && typeBlinde >= 1) StdDraw.picture(this.getX(), this.getY(), "/images/zombie2.png", SIZE, 2*SIZE);
		else StdDraw.picture(this.getX(), this.getY(), "/images/zombie3.png", SIZE, 2*SIZE);
	}
}
