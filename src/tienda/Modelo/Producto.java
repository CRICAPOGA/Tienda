package tienda.Modelo;

public class Producto {
    private String nombre;
    private int id;
    private double valor;
    
    
//    Constructores
    public Producto(String nombre, int id, double valor) {
        this.nombre = nombre;
        this.id = id;
        this.valor = valor;
    }
    
//    Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}