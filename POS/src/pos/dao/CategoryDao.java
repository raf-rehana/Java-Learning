
package pos.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import pos.model.Category;
import pos.service.Dao;

public class CategoryDao implements Dao <Category> {
    PreparedStatement ps;
    
    @Override
    public void save(Category e) {
        
    }


    @Override
    public void update(Category e) {
       
    }

    @Override
    public void delete(int id) {
    }
    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> cList = new ArrayList<>();
        String sql = "Select * from  category";
        
    
        return null;
    }

  
   
    
}
