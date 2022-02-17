package lt.vtmc.springbootdemo.repository;

import lt.vtmc.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
