package escuela;

import java.util.Calendar;

public class Alumno extends Persona {

    private int ingresodias;
    private int ingresomeses;
    private int ingresoanos;
    private Boolean becado;

    public Alumno(String nombre, String apellido, int dia, int mes, int ano, int ingresodias, int ingresomeses,
            int ingresoanos, boolean becado) {
        super(nombre, apellido, dia, mes, ano);
        this.ingresoanos = ingresoanos;
        this.ingresomeses = ingresomeses;
        this.ingresodias = ingresodias;
        this.becado = becado;

    }

    public int getDias() {
        return ingresodias;
    }

    public int getMeses() {
        return ingresomeses;
    }

    public int getAnos() {
        return ingresoanos;
    }

    public boolean getBecado() {
        return becado;
    }

    public void setIngresodias(int ingresodias) {
        this.ingresodias = ingresodias;
    }

    public void setIngresomeses(int ingresomeses) {
        this.ingresomeses = ingresomeses;
    }

    public void setIngresoanos(int ingresoanos) {
        this.ingresoanos = ingresoanos;
    }

    public void setBecado(Boolean becado) {
        this.becado = becado;
    }

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
            int total;
            total = materiasAprob / cantMaterias;
            System.out.println(total);
            total = (materiasAprob * total) / cantMaterias;
            System.out.println("Tienes un promedio de:  " + total + "% materias aprobadas");
        }

    }

}
