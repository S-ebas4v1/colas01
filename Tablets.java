public class Tablets {

    private String Señal;
    private double Tamaño;
    private String Marca;
    private double Precio;
    private String NombreEstudiante;
    private boolean Disponibilidad;

    public Tablets(String Señal, double Tamaño, String Marca, double Precio) {
        this.Señal = Señal;
        this.Tamaño = Tamaño;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Disponibilidad = true;
    }

    public Tablets() {
    }

    public String getSeñal() {
        return Señal;
    }

    public void setSeñal(String señal) {
        Señal = señal;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double tamaño) {
        Tamaño = tamaño;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        NombreEstudiante = nombreEstudiante;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }
}
