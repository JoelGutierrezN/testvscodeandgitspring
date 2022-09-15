package vscode.testvscode.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vscode.testvscode.data.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
