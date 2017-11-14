
package escuela;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MateriaAprobada {

    
    
    
    private String nombre;
    private double nota;
    private String fechaExamen ;
   
       
    public MateriaAprobada(String nombre, double nota, String fechaExamen) {
        
        this.nombre = nombre;
        this.nota = nota;
        this.fechaExamen = fechaExamen;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getFechaExamen() {
        
      
        return fechaExamen;
    }

    public void setFechaExamen(String fechaExamen) {
        this.fechaExamen = fechaExamen;
    }
    
}
