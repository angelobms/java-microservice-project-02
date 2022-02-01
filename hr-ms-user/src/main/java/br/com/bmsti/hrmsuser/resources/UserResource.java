package br.com.bmsti.hrmsuser.resources;

import br.com.bmsti.hrmsuser.entities.User;
import br.com.bmsti.hrmsuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserResource {

    private UserRepository userRepository;

    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        return ResponseEntity.ok(user.get());
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        User user = userRepository.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}
