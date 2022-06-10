public class Main {
    public static void main(String[] args) {
        Persona somePerson = new Persona();
        somePerson.setNombre("Armando");
        somePerson.setEdad(34);
        somePerson.setTelefono(600000000);
        System.out.println(somePerson.getNombre());
        System.out.println(somePerson.getEdad());
        System.out.println(somePerson.getTelefono());
    }
}

class Persona {

    private int edad;

    private String nombre;

    private int telefono;

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}