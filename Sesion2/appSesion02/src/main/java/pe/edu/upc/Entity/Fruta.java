package pe.edu.upc.Entity;

public class Fruta {

	private String color;
	private String sabor;

	public static String LugarOrigen = "UPC";

	public Fruta(String color, String sabor) {
		super();
		this.color = color;
		this.sabor = sabor;
	}

	public static void SoyUnMetodoGlobal() {

	}

	public void SoyUnMetodoObjecto() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String toString() {
		return this.getColor();
	}

}
