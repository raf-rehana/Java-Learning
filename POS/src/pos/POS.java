
package pos;

import pos.dao.UserDao;
import pos.model.User;


public class POS {

    public static void main(String[] args) {
        
        User user1 = new User("sathy", "1234");
        User user2 = new User("keya", "1234");
        User user3 = new User("juyena ", "1234");
        
        UserDao userDao = new UserDao();
        
        userDao.saveUser(user1);
        userDao.saveUser(user2);
        userDao.saveUser(user3);
    }
    
}
