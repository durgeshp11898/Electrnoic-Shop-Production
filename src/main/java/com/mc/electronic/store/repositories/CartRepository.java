package com.mc.electronic.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.electronic.store.entities.Cart;
import com.mc.electronic.store.entities.User;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, String> {


    Optional<Cart> findByUser(User user);

}
