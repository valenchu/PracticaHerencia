package escuela;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Escuela {

    public static void main(String[] args) {
        
        Persona per = new Persona("Valentin", "Cassino", 29, 8, 1992);
         // per.nombreCompleto();
        // per.calcularEdad();
        Alumno alu = new Alumno("Valentin","Cassino",29,8,1992,5,8,2005,true);
        alu.nombreCompleto();
        alu.calcularEdad();
        EstadoAcademico estado = new EstadoAcademico(2013, 2017);
        estado.calcularPromedioAprobadas(30, 10);
        MateriaAprobada mat = new MateriaAprobada("Valentin Cassino", 5, "29/8/1992");
        System.out.println(mat.getFechaExamen());
    }

}
