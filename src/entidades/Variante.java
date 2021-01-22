package entidades;

public enum Variante {
    SEDAN("SEDAN"),
    FAMILIAR("FAMILIAR"),
    COUPE("COUPE");
    
    private final String nombreVariante;

    private Variante(String nombreVariante) {
        this.nombreVariante = nombreVariante;
    }
    
    public String getNombreVariante() {
        return nombreVariante;
    }
}
