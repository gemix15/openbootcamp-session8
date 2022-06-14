
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(30);
        persona.setNombre("Paula");
        persona.setTelefono(687234199);

        System.out.println("Datos persona");
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Telefono:" + persona.getTelefono());

    }
}