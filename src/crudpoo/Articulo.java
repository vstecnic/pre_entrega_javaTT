public class Articulo extends Producto { 

private Categoria categoria; 

public Articulo(String nombre, double precio, Categoria categoria) { 
super(nombre, precio); 
this.categoria = categoria; 
}

public Categoria getCategoria() { 
return categoria;
}

public void setCategoria(Categoria categoria) { 
this.categoria = categoria;
}

@Override
public double calcularDescuento() {
return getPrecio() * 0.90; // 10% de descuento [6]
}

@Override
public String toString() { 
return super.toString() + ", categoria=" + (categoria != null ? categoria.getNombre() : "Sin categoría");
}

}