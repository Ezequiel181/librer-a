public class Main {
    public static void main(String[] args) {
        ServicioSocios servicio = new ServicioSocios();
        servicio.registrarNuevoSocio("Juan Pérez");
        servicio.registrarNuevoSocio("Ana Gómez");
        servicio.eliminarSocio("Juan Pérez");
        ConexionBD c1 = ConexionBD.getInstance();
        ConexionBD c2 = ConexionBD.getInstance();
        System.out.println("¿Es la misma instancia? " + (c1 == c2));
    }
}