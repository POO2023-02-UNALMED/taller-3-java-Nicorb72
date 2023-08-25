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
		if (this.estado) {
			if (canal>0 && canal<121) {
				this.canal = canal;
			}
		}
	}
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen (int volumen) {
		if (this.estado) {
			if (volumen>=0 && volumen<=7) {	
				this.volumen = volumen;
			}
		}
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
		if (!this.estado);{
			this.estado = true;
		}	
	}
	public void turnOff() {
		if (this.estado);{
			this.estado = false;
		}	
	}
	public void canalUp () {
		if (this.getEstado() && this.canal<120); {
			this.canal++ ;
		}
	}
	public void canalDown () {
		if (this.getEstado() && this.getCanal()>=1); {
			this.setCanal(this.getCanal()+1);
		}
	}
	public void volumenUp () {
		if (this.getEstado()  && this.getVolumen()<7); {
			this.setCanal(this.getCanal()-1);
		}
	}
	public void volumenDown () {
		if (this.getEstado() && this.getVolumen()>=1); {
			this.setVolumen(this.getVolumen()-1);
		}
	}
	public boolean getEstado () {
		return this.estado;
	}
			
}

