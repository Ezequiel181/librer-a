public class ServicioSocios {
    private RepositorioSocios repositorio;

    public ServicioSocios() {
        this.repositorio = new RepositorioSocios();
    }

    public void registrarNuevoSocio(String nombre) {
        System.out.println("Validando datos del socio...");
        repositorio.registrarSocio(nombre);
        System.out.println("Socio registrado correctamente: " + nombre);
    }

    public void eliminarSocio(String nombre) {
        System.out.println("Buscando socio...");
        repositorio.eliminarSocio(nombre);
        System.out.println("Socio eliminado: " + nombre);
    }
}

