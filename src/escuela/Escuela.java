package escuela;

public class Escuela {

    public static void main(String[] args) {;
        Persona per = new Persona("Valentin", "Cassino", 29, 8, 1992);
         // per.nombreCompleto();
        // per.calcularEdad();
        Alumno alu = new Alumno("Valentin","Cassino",29,8,1992,5,8,2005,true);
        alu.nombreCompleto();
        alu.calcularEdad();
        alu.fechaIngreso();
        alu.Becado();
        
        
    }

}
