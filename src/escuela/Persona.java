package escuela;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.time.Year;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import static javax.swing.UIManager.get;

public class Persona {

    private String nombre = "No ingreso nombre";
    private String apellido = "No ingreso apellido";
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;

    public Persona(String nombre, String apellido, int dia, int mes, int ano) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int dia() {
        return dia;
    }

    public int mes() {
        return mes;
    }

    public int ano() {
        return ano;
    }

    protected void nombreCompleto() {
        System.out.println(nombre + " " + apellido);

    }

    protected void calcularEdad() {
        Calendar anno = Calendar.getInstance();
        int años = 0;
        //Saco el día actual
        int D = anno.get(Calendar.DATE);
        //Resto día dado a el día actual
        D = D - dia;
        //Saco mes actual
        int M = anno.get(Calendar.MONTH);
        //Resto mes edad de la persona a mes actual
        M = M - mes;
        //Saco año actual
        int A = anno.get(Calendar.YEAR);
        //Resto año de la persona a año actual
        A = A - ano;
        //Saco que si el día o mes es negativo se me reste un año para dar
        //la edad correcta aunque estemos en el año de cambio de edad pero 
        //al no estar en el mes o día se le resta su edad.
        if (D < 0 || M < 0) {
            años = A--;
        } else {
            años = A;
        }
        System.out.println("Edad final de la persona: " + años);
    }
}
