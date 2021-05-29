import java.util.*;

public class rettangolo implements figuraDis, Figura {

  public rettangolo(float b, float a, String colore, float pos_x, float pos_y) {
		this.base = b;
		this.altezza = a;
		this.colore=colore;
		this.pos_x=pos_x;
		this.pos_y=pos_y;
	}

    private float base;
	private String colore;
    private float altezza;
    private float pos_x, pos_y;

    public void setColore(String colore) {
        this.colore=colore;
    }

    public String getColore() {
        return colore;
    }

    public void setPosition(float x, float y) {
    	this.pos_x=x;
    	this.pos_y=y;
    }

    public float calcolaArea() {
        return base*altezza;
    }

	public String toString() {
		return "rettangolo [base=" + base + ", colore=" + colore + ", altezza=" + altezza + ", pos_x=" + pos_x
				+ ", pos_y=" + pos_y + "]";
	}

	public float calcolaPerimetro() {
        return 2+(base*altezza);
    }
}