
public class ClientePremium extends ClienteNormal{
	
	protected double descuento;

	public ClientePremium(int idCliente, String nombre, String mail, String tarjeta, double descuento) {
		super(idCliente, nombre, mail, tarjeta);
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "ClientePremium [descuento=" + descuento + "]";
	}

	
	
}
