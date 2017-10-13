package proyecto.poo;

/**
	@Author: Grupo #1
	@Date: 16/08/17
	@proposito: Guardar la información básica del pedido

	
*/
public class Pedidos
{
	private int numeroPedido;
	private int carnet;
	private double total;
	private String Entrega;
	//Create a new Order
	public Pedidos(int pedido, int Carnet, String LugarEntrega)
	{
		numeroPedido = pedido;
		carnet = Carnet;
		Entrega = LugarEntrega;
	}
}