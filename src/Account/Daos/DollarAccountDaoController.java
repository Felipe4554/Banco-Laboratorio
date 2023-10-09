package Account.Daos;

import Controller.Controller;
import Views.View;
import java.util.List;

public class DollarAccountDaoController implements Controller<DollarAccountDaoList> {
    
    private View view;
    private DollarAccountDaoList list;
    
    public DollarAccountDaoController(View view, DollarAccountDaoList list) {
        this.view = view;
        this.list = list;
    }

    @Override
    public boolean create(DollarAccountDaoList obj) {

        return false;
    }

    @Override
    public DollarAccountDaoList read(String id) {
        return null;
    }

    @Override
    public List<DollarAccountDaoList> readAll() {
        return null;
    }

    @Override
    public boolean update(DollarAccountDaoList obj) {
        return false;
    }

    @Override
    public boolean delete(DollarAccountDaoList obj) {
        return false;
    }
    
}
