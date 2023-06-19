package com.mc.electronic.store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mc.electronic.store.entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem,Integer> {
}
