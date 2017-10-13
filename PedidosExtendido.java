package proyecto.poo;

/**
	@Author: Grupo #1
	@Date: 16/08/17
	@proposito: Guardar la información extendida del pedido (los productos y las cantidades del mismo)


	
*/
public class PedidosExtendido
{
	private int numeroPedido;
	private int producto;
	private int cantidad;
	private double PrecioUnitario;
	//Agrega producto a un pedido
	public PedidosExtendido(int pedido, int cant ,int Producto, double Precio)
	{
		numeroPedido = pedido;
		producto = Producto;
		cantidad = cant;
		PrecioUnitario = Precio;
	}
        
        public int getNumeroPedido(){
            return this.numeroPedido;
        }
        
        public int getCanitdad(){
            return this.cantidad;
        }
        
        public int getProducto(){
            return this.producto;
        }
        
        public double getPrecio(){
            return this.PrecioUnitario;
        }

}