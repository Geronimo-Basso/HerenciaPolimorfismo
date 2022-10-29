
public class Cliente {
	
	protected int idCliente;
	protected String nombre;

	public Cliente(int idCliente, String nombre) {
		checkCliente(idCliente);
		this.nombre=nombre;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Cliente: " + (idCliente + 1)  ; //No se si esta bien el +1
	}
	
	
	private boolean checkCliente(int idCliente) {
		boolean devolucion= false;
		
		if(idCliente<=0) {
			devolucion=true;
			this.idCliente=idCliente;
		}
		
		return devolucion;
		
	}

}
