import java.util.HashMap;

public class Bebidas {
    private HashMap<String, String> nombres;
    private HashMap<String, Double> precios;

    public Bebidas() {
        nombres = new HashMap<>();
        precios = new HashMap<>();
    }

    public void agregarBebida(String codigo, String nombre, double precio) {
        nombres.put(codigo, nombre);
        precios.put(codigo, precio);
    }

    public String getNombre(String codigo) {
        return nombres.get(codigo);
    }

    public double getPrecio(String codigo) {
        return precios.get(codigo);
    }
}
