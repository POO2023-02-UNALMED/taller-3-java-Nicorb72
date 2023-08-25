package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen ;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.precio = 500;
		this.volumen = 1;
		numTV++ ;	
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	public int getPrecio() {
		return this.precio;
	}
	public int getCanal() {
		return this.canal;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public Control getControl() {
		return this.control;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	public boolean getEstado () {
		return this.estado;
	}
	public void setCanal (int a) {
		if (this.estado) {
			if (a>0 && a<121) {
				this.canal = a;
			}
		}
	}

	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public void setVolumen (int v) {
		if (this.estado) {
			if (v>=0 && v<=7) {	
				this.volumen = v;
			}
		}
	}
	
	
	public void setControl (Control control) {
		this.control = control;
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
		if (this.getEstado() && this.getCanal()<120); {
			this.canal++ ;
		}
	}
	public void canalDown () {
		if (this.getEstado() && this.getCanal()>0); {
			this.setCanal(this.getCanal()-1);
		}
	}
	public void volumenUp () {
		if (this.getEstado()  && this.getVolumen()<7); {
			this.setVolumen(this.getVolumen()+1);
		}
	}
	public void volumenDown () {
		if (this.getEstado() && this.getVolumen()>=1); {
			this.setVolumen(this.getVolumen()-1);
		}
	}
	
			
}

