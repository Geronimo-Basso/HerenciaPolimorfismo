import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		Vector<Cliente> clientes=new Vector<>();
//		List<Cliente> listaClientes=new ArrayList<>();
		
		
		
		/*
		 RECORDAR EL TEMA DE LOS OBJETOS LOS PUEDO PONER COMO CLIENTE O COMO CLIENTENORMAL
		 ES MEJOR USARLOS COMO CLIENTE PORQUE CUALQUIER COSA QUE PRECISE LO PUEDO CASTAER DESPUES
		 SI FUERA ALREVES NO PUEDO CASTEAR DE CLIENTEMENOR A CLIENTE, OSEA SI PUEDO PERO ES PELIGORO
		 * 
		 * 
		 */
		
		Cliente cliente= new ClienteNormal(1,"nombreCliente1", "mail1","trajeta1");
		clientes.add(cliente);
		clientes.add(new Cliente(2,"nombreCliente"));
		clientes.add(new ClienteMenor(3,"nombreClienteMenor3",3,(ClienteNormal)cliente)); //hago el casteo a cliente normal para tererlo igual que la clase
		clientes.add(new ClientePremium(4,"nombreClientePremium4","mail2", "tarjeta2", 0.2 ));
		
		for(int i=0;i<clientes.size();i++) {
			System.out.println(clientes.get(i));
		}
	}

}
