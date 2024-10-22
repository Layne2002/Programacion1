package D1;

public class Punto {

	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void imprime() {
		int x = this.x;
		int y = this.y;
		System.out.printf("(%d , %d)\n",x,y);
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void desplaza(int dx, int dy) {
		this.x +=dx;
		this.y +=dy;
	}
	public int distancia(Punto p) {
		int distancia = 0;
		
		distancia = (int)Math.sqrt((p.getX()-this.x)*(p.getX()-this.x)+(p.getY()-this.y)*(p.getY()-this.y));
		
		return distancia;
		
	}
	
}
