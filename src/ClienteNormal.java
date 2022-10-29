
public class ClienteNormal extends Cliente{
	
	protected String mail;
	protected String tarjeta;

	public ClienteNormal(int idCliente,String nombre,String mail, String tarjeta) {
		super(idCliente, nombre);
		this.mail=mail;;
		this.tarjeta=tarjeta;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClienteNormal [mail=" + mail + ", tarjeta=" + tarjeta + "]";
	}
	
	
}
