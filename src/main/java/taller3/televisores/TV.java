package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++ ;	
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal (int canal) {
		this.canal = canal;
	}
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	public int getvolumen() {
		return this.volumen;
	}
	
	public void setVolumen (int volumen) {
		this.volumen = volumen;
	}
	public Control getControl() {
		return this.control;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	public void turnOn() {
		if (this.estado != true);{
			this.estado = true;
		}	
	}
	public void turnOff() {
		if (this.estado != false);{
			this.estado = false;
		}	
	}
	public void canalUp () {
		if (this.estado == true && this.canal < 120); {
			this.canal++ ;
		}
	}
	public void canalDown () {
		if (this.estado == true && this.canal > 1); {
			this.canal-- ;
		}
	}
	public void volumenlUp () {
		if (this.estado == true && this.volumen < 7); {
			this.volumen++ ;
		}
	}
	public void volumenDown () {
		if (this.estado == true && this.volumen > 0); {
			this.volumen-- ;
		}
	}
	
			
}

