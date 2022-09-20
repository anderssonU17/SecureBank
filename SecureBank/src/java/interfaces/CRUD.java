
package interfaces;

import java.util.List;
import model.Prestamo;

public interface CRUD {
    public List listar();
    public Prestamo Listar(int id);
    public boolean Agregar(Prestamo Pres);
    public boolean Editar(Prestamo Pres);
    public boolean Eliminar(int id);
}
