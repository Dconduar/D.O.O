package gt.edu.miumg;

class Granos implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Granos(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Granos de " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

class Agua implements Ingrediente {
    private int cantidad;

    public Agua(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Agua";
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

class Leche implements Ingrediente {
    private String tipo;
    private int cantidad;

    public Leche(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Leche de tipo " + tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}

class OtrosIngredientes implements Ingrediente {
    private String nombre;
    private int cantidad;

    public OtrosIngredientes(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
