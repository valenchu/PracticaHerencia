package escuela;

public class EstadoAcademico {

    private int añoIngreso;
    private int añoCursadoActual;

    public EstadoAcademico(int añoIngreso, int añoCursadoActual) {

        this.añoIngreso = añoIngreso;
        this.añoCursadoActual = añoCursadoActual;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public int getAñoCursadoActual() {
        return añoCursadoActual;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public void setAñoCursadoActual(int añoCursadoActual) {
        this.añoCursadoActual = añoCursadoActual;
    }

    public void calcularPromedioAprobadas(int cantMaterias, int materiasAprob) {
        double total;

        total = ((materiasAprob * 100) / cantMaterias);

        System.out.println("Tienes un promedio de:  " + total + "% materias aprobadas");
    }

}
