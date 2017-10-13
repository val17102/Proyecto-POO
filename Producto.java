package proyecto.poo;

/**
	@Author: Grupo #1
	@Date: 16/08/17
	@proposito: Guardar la información de una comida disponible


	
*/
public class Producto
{
	private int Code;
	private String Name;
	private double Price;
	//Create a new Product
	public Producto(int Codigo, String Nombre, double Precio)
	{
		this.Code = Codigo;
		this.Name = Nombre;
		this.Price = Precio;
	}
        
        public int getCode(){
            return this.Code;
        }
        
        public String getNombre(){
            return this.Name;
        }
        
        public double getPrecio(){
            return this.Price;
        }
}