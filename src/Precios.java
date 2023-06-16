import java.util.HashMap;

public class Precios extends Bebidas{
    private HashMap<String, Double> precios;

    public Precios() {
        precios = new HashMap<>();
    }

    public void agregarPrecio(String codigo, double precio) {
        precios.put(codigo, precio);
    }

    public double getPrecio(String codigo) {
        return precios.get(codigo);
    }
}

