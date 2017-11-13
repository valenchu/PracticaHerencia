package escuela;

import java.util.Calendar;

public class Alumno extends Persona {

    int ingresodias = 0;
    int ingresomeses = 0;
    int ingresoanos = 0;
    Boolean becado ;

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

    public void fechaIngreso() {
        System.out.println("Ingreso el día: " + ingresodias + " del mes: " + ingresomeses + " del año: " + ingresoanos);

    }

    public void Becado() {
        if (becado == true) {
            System.out.println("El alumno: " + getNombre() + " " + getApellido() + " esta becado");
        }else{
            System.out.println("El alumno: " + getNombre() + " " + getApellido() + " no esta becado");
       

    }
    }


}
