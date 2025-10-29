public class RepositorioSocios {
    private ConexionBD conexion;

    public RepositorioSocios() {
        this.conexion = ConexionBD.getInstance();
    }

    public void registrarSocio(String nombre) {
        String sql = "INSERT INTO socios(nombre) VALUES('" + nombre + "')";
        conexion.ejecutarConsulta(sql);
    }

    public void eliminarSocio(String nombre) {
        String sql = "DELETE FROM socios WHERE nombre='" + nombre + "'";
        conexion.ejecutarConsulta(sql);
    }
}

