package net.javaguides.springboot.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import net.javaguides.springboot.model.CartItem;

@Service
@SessionScope
public class ShoppingCartServiceImpl implements ShopingCartService {
	
	Map<Long, CartItem> maps = new HashMap<Long, CartItem>();

	@Override
	public void add(CartItem item) {
		CartItem cartItem = maps.get(item.getProductId());
		if (cartItem == null) {
			maps.put(item.getProductId(), item);
		} else {
			cartItem.setQuantity(cartItem.getQuantity() + 1);
		}

	}

	@Override
	public void remove(long id) {
		maps.remove(id);
	}

	@Override
	public CartItem update(long productId, int quantity) {
		CartItem cartItem = maps.get(productId);
		cartItem.setQuantity(quantity);
		return cartItem;
	}

	@Override
	public void clear() {
		maps.clear();
	}

	@Override
	public Collection<CartItem> getAllItem() {
		return maps.values();
	}
	
	@Override
	public int getCount() {
		return maps.values().size();
	}
	
	@Override
	public double getAmount() {
		return maps.values().stream().mapToDouble(item -> item.getQuantity() * item.getPrice()).sum();
	}
}
