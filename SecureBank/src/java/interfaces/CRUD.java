
package interfaces;

import java.util.List;
import modelo.pagoServicio;

public interface CRUD {
    public List listar();
    public pagoServicio list(int id0);
    public boolean add(pagoServicio per);
    public boolean edit(pagoServicio per0);
    public boolean eliminar(int id);
    
}
