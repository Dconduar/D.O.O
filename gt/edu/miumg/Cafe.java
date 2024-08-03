package gt.edu.miumg;

abstract class Cafe {
    protected String nombre;
    protected String tamaño;
    protected double precio;

    public Cafe(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    abstract void preparar();

    public void servir() {
        System.out.println("Sirviendo el café: " + nombre);
    }
}
