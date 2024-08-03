package gt.edu.miumg;

class CafeColombiano extends Cafe {
    private String tipoGrano;

    public CafeColombiano(String nombre, String tamaño, double precio, String tipoGrano) {
        super(nombre, tamaño, precio);
        this.tipoGrano = tipoGrano;
    }

    @Override
    void preparar() {
        System.out.println("Preparando Café Colombiano con granos de tipo: " + tipoGrano);
    }
}

class EspressoItaliano extends Cafe {
    private String intensidad;

    public EspressoItaliano(String nombre, String tamaño, double precio, String intensidad) {
        super(nombre, tamaño, precio);
        this.intensidad = intensidad;
    }

    @Override
    void preparar() {
        System.out.println("Preparando Espresso Italiano con intensidad: " + intensidad);
    }
}
