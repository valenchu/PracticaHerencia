package escuela;

public class Profesor extends Persona {

    private int numeroLegajo;
    private Boolean esTitular;

    public Profesor(String nombre, String apellido, int dia, int mes, int ano, int numeroLegajo, Boolean esTitular) {
        super(nombre, apellido, dia, mes, ano);
        this.numeroLegajo = numeroLegajo;
        this.esTitular = esTitular;
        

    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    public void setEsTitular(Boolean esTitular) {
        this.esTitular = esTitular;
    }

}
