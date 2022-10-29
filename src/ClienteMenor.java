
public class ClienteMenor extends Cliente {
	protected int edad;
	protected ClienteNormal responsable;
	
	public ClienteMenor(int idCliente,String nombre,int edad, ClienteNormal responsable) {
		super(idCliente,nombre);
		this.edad=edad;
		this.responsable=responsable;
		
	}

	@Override
	public String toString() {
		return "ClienteMenor [edad=" + edad + ", responsable=" + responsable + "]";
	}
	
	

	
}
