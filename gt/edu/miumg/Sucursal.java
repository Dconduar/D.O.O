package gt.edu.miumg;

class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + " está trabajando en el puesto de " + puesto);
    }

    public void tomarOrden() {
        System.out.println(nombre + " está tomando una orden");
    }
}

class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo el equipo: " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando el equipo: " + tipo);
    }

    public void reparar() {
        System.out.println("Reparando el equipo: " + tipo);
    }
}

class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados;
    private List<Ingrediente> ingredientes;
    private List<Equipo> equipos;
    private List<Cafe> especialidades;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Cafe cafe) {
        especialidades.add(cafe);
    }
}
