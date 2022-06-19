public class Main {
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        miCliente.setEdad(18);
        miCliente.setNombre("Christian");
        miCliente.setTelefono("+593111111111");
        miCliente.setCredito(1500);
        System.out.println("El cliente "+ miCliente.getNombre());
        System.out.println("Tiene " + miCliente.getEdad() + " años");
        System.out.println("y su telefono es: " + miCliente.getTelefono());
        System.out.println("Dispone de un crédito de: $" + miCliente.getCredito());

        Trabajador miTrabajador = new Trabajador();
        miTrabajador.setEdad(28);
        miTrabajador.setNombre("Paul");
        miTrabajador.setTelefono("+593111111111");
        miTrabajador.setSalario(1200);
        System.out.println("\nEl trabajador "+ miTrabajador.getNombre());
        System.out.println("Tiene " + miTrabajador.getEdad() + " años");
        System.out.println("y su telefono es: " + miTrabajador.getTelefono());
        System.out.println("Recibe un salario de: $" + miTrabajador.getSalario());

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona{
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}