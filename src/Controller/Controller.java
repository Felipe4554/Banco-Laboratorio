
package Controller;
        
import Crud.Crud;
import java.util.List;

public interface Controller<Class> extends Crud<Class> {
    public boolean create(Class obj);
    public Class read(String id);
    public List<Class> readAll();
    public boolean update(Class obj);
    public boolean delete(Class obj);
}
