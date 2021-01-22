package entidades;

public class Opcionales {
    private int id;
    private int techoCorredizo;
    private int aireAcondicionado;
    private int frenosABS;
    private int airbag;
    private int llantasAleacion;
    
    public Opcionales() {
    }

    public Opcionales(int techoCorredizo, int aireAcondicionado, int frenosABS, int airbag, int llantasAleacion) {
        this.techoCorredizo = techoCorredizo;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosABS = frenosABS;
        this.airbag = airbag;
        this.llantasAleacion = llantasAleacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTechoCorredizo() {
        return techoCorredizo;
    }

    public void setTechoCorredizo(int techoCorredizo) {
        this.techoCorredizo = techoCorredizo;
    }

    public int getAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(int aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getFrenosABS() {
        return frenosABS;
    }

    public void setFrenosABS(int frenosABS) {
        this.frenosABS = frenosABS;
    }

    public int getAirbag() {
        return airbag;
    }

    public void setAirbag(int airbag) {
        this.airbag = airbag;
    }

    public int getLlantasAleacion() {
        return llantasAleacion;
    }

    public void setLlantasAleacion(int llantasAleacion) {
        this.llantasAleacion = llantasAleacion;
    }
    
    @Override
    public String toString() {
        return "Techo corredizo: " + (techoCorredizo == 1 ? "Si" : "No") +
                "\nAire acondicionado: " + (aireAcondicionado == 1 ? "Si" : "No") +
                "\nFrenos ABS: " + (frenosABS == 1 ? "Si" : "No") +
                "\nAirbag: " + (airbag == 1 ? "Si" : "No") +
                "\nLlantas aleación: " + (llantasAleacion == 1 ? "Si" : "No");
    }
}