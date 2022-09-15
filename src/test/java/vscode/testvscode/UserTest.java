package vscode.testvscode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vscode.testvscode.data.entities.User;
import vscode.testvscode.data.repositories.UserRepository;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void createUser(){
        User user = new User("Joel", "Gutierrez", "joelgut1998@outlook.es", "123456");
        this.userRepository.saveAndFlush(user);
    }

    @Test
    public void updateUser(){
        User user = this.userRepository.findById(1L).orElse(null);

        if(user != null){
            user.setLastname("Gutierrez Nuñez");
            this.userRepository.saveAndFlush(user);
        }
    }
    
}
