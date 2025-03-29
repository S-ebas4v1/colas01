public class prestamo {
    private String canetEstudiante;
    private String nombreEstudiante;
    private String Dispositivo;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public prestamo(String canetEstudiante, String nombreEstudiante, 
    String dispositivo, String fechaPrestamo, String fechaDevolucion) {
        this.canetEstudiante = canetEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.Dispositivo = dispositivo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public prestamo() {
    }

    public String getCanetEstudiante() {
        return canetEstudiante;
    }

    public void setCanetEstudiante(String canetEstudiante) {
        this.canetEstudiante = canetEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getDispositivo() {
        return Dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        Dispositivo = dispositivo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    

}
