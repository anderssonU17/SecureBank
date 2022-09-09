
package interfaces;

import java.util.List;
import modelo.pagoservicio;

public interface CRUD {
    public List listar();
    public pagoservicio list(int id0);
    public boolean add(pagoservicio per);
    public boolean edit(pagoservicio per0);
    public boolean eliminar(int id);
    
}
