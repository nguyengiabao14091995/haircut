package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.CartItem;

public interface ShoppingCartRepository extends JpaRepository<CartItem, Long>{

}
