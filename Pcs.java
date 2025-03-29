public class Pcs {
    private String Señal;
    private String Marca;
    private int MemoriaRam;
    private String DiscoDuro;
    private double precio;
    private String NombreEstudiante;
    private String Carnet;
    private boolean Disponibilidad;

    public Pcs(String Señal, String Marca, int MemoriaRam, String DiscoDuro, double precio) {
        this.Señal = Señal;
        this.Marca = Marca;
        this.MemoriaRam = MemoriaRam;
        this.DiscoDuro = DiscoDuro;
        this.precio = precio;
        this.Disponibilidad = true;
    }

    public Pcs() {
    }

    public String getSeñal() {
        return Señal;
    }

    public void setSeñal(String señal) {
        Señal = señal;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getMemoriaRam() {
        return MemoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        MemoriaRam = memoriaRam;
    }

    public String getDiscoDuro() {
        return DiscoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        DiscoDuro = discoDuro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        NombreEstudiante = nombreEstudiante;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String carnet) {
        Carnet = carnet;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }
}
