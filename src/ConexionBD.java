public class ConexionBD {
    private static volatile ConexionBD instancia;

    private ConexionBD() {
        System.out.println(" Conexión establecida a la base de datos.");
    }
    public static ConexionBD getInstance() {
        if (instancia == null) {
            synchronized (ConexionBD.class) {
                if (instancia == null) {
                    instancia = new ConexionBD();
                }
            }
        }
        return instancia;
    }
    public void ejecutarConsulta(String sql) {
        System.out.println("Ejecutando: " + sql);
    }
}
