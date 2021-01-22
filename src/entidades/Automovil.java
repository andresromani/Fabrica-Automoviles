package entidades;

public class Automovil {
    private int id;
    private double costo;
    private Variante variante;
    private Opcionales opcionales;
    
    public Automovil() {
    }

    public Automovil(Variante variante) {
        this.variante = variante;
    }
    
    public Automovil(Variante variante, Opcionales opcionales) {
        this.variante = variante;
        this.opcionales = opcionales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Opcionales getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(Opcionales opcionales) {
        this.opcionales = opcionales;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public String getVariante() {
        return variante.getNombreVariante();
    }
    
    public void setVariante(Variante variante) {
        this.variante = variante;
    }
    
    public double calcularCosto() {
        switch(variante) {
            case SEDAN:
                costo = 230000;
                break;
            case FAMILIAR:
                costo = 245000;
                break;
            case COUPE:
                costo = 270000;
                break;
        }
        
        if (opcionales != null) {
            costo += opcionales.getTechoCorredizo() == 1 ? 12000 : 0;
            costo += opcionales.getAireAcondicionado() == 1 ? 20000 : 0;
            costo += opcionales.getFrenosABS() == 1 ? 14000 : 0;
            costo += opcionales.getAirbag() == 1 ? 7000 : 0;
            costo += opcionales.getLlantasAleacion() == 1 ? 12000 : 0;
        }
        
        this.setCosto(costo);
        
        return this.getCosto();
    };
    
    @Override
    public String toString() {
        return "ID: " + id +
                "\nVariante: " + variante.getNombreVariante() +
                (opcionales != null ? "\nOpcionales: \n" + opcionales : "") +
                "\nCosto: $" + costo + "\n";
    }
}