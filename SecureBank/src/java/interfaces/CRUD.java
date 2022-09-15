
package interfaces;

import java.util.List;
import modelo.PagoServicio;

public interface CRUD {
    public List listar();
    public PagoServicio list(int id0);
    public boolean add(PagoServicio per);
    public boolean eliminar(int id);
    
}
