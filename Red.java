package proyecto.poo;

import java.util.ArrayList;

/**
	@Author: Grupo #
	@Date: 16/08/17
	@proposito: Ser la clase que lleve el control de los pedidos y lo usuarios.

	
*/
public class Red
{
	private int pedidoActual;
	ArrayList<Producto> Productos = new ArrayList<Producto>();
	ArrayList<Pedidos> Ordenes = new ArrayList<Pedidos>();
	ArrayList<PedidosExtendido> OrdenesDetalle = new ArrayList<PedidosExtendido>();

	
	public Red()
	{
            Producto agua = new Producto(0, "Agua Pura", 7.5);
            Productos.add(agua);
            Producto panini = new Producto(1, "Panini", 22.50);
            Productos.add(panini);
            Producto cafe = new Producto(2, "Café", 13.0);
            Productos.add(cafe);
            Producto crepa = new Producto(3, "Crepa", 23.0);
            Productos.add(crepa);
            Producto limonada = new Producto(4, "Limonada", 7.0);
            Productos.add(limonada);
	}
	
	public void NuevoPedido(int refPedido, int refCarnet, String refLugarEntrega)
	{
            //Aqui asigna el valor al pedido actual sino hay ningun pedido pendiente y el usuario que los pide
            Pedidos order = new Pedidos(refPedido, refCarnet, refLugarEntrega);
           // PedidosExtendido orderExt = new PedidosExtendido(refPedido, refCarnet,  1.5);
            Ordenes.add(order);
           // OrdenesDetalle.add(order);
	}

	public PedidosExtendido MostrarProductos(int nPedidoExt){
		//devuelve los productos para llenar la tabla para consultar un pedido anterior
                for (PedidosExtendido item: OrdenesDetalle){
                    if (item.getNumeroPedido() == nPedidoExt){
                        return item;
                    }
                }
                return null;
	}
        
        public double MostrarTotal(int nPedidoExt){
		//devuelve los productos para llenar la tabla para consultar un pedido anterior
                for (PedidosExtendido item: OrdenesDetalle){
                    if (item.getNumeroPedido() == nPedidoExt){
                        return item.getPrecio();
                    }
                }
                return -1;
	}
	/**
	public String MostrarPedido(int codigoPedido){
		//no es necesario ya que en el main se completa la tabla
	}
	*/
	public void AgregarProducto(int codigoPedido, int cantidad, Producto p){
		//Agrega un nuevo producto al pedido Actual y si hay error devuelve un mensaje
                PedidosExtendido nuevo = new PedidosExtendido(codigoPedido, cantidad, p.getCode(), p.getPrecio());
                OrdenesDetalle.add(nuevo);
	}
        
        public int getCode(String name){
            for (int x=0;x<Productos.size();x++){
                Producto n = new Producto(0,"",0.00);
                n = Productos.get(x);
                if (name.equals(n.getNombre())){
                    return n.getCode();
                }
            }
            return -1;
        }
        
        public double getPrecio(String name){
            for (Producto item: Productos){
                if (item.getNombre().equals(name)){
                    return item.getPrecio();
                }
            }
            return -1;
        }
	/**
	public String QuitarProducto (int codigoProducto){
		//En esta version no lo vamos a usar
	}
	
	public void getTotal(){
		//ya no es necesario en esta version
	}
	**/

}