package com.techlabs.adapterPattern.test;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.adapterPattern.model.Biscuit;
import com.techlabs.adapterPattern.model.Chocolate;
import com.techlabs.adapterPattern.model.Hat;
import com.techlabs.adapterPattern.model.HatAdapter;
import com.techlabs.adapterPattern.model.IItems;
import com.techlabs.adapterPattern.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Biscuit biscuit = new Biscuit("Biscuit", 10);
        Chocolate chocolate = new Chocolate("Chocolate", 20);
        Hat hat = new Hat("HAT001", "Stylish Hat", 50, 0.14);

        
        HatAdapter hatAdapter = new HatAdapter(hat);

        
        ShoppingCart cart = new ShoppingCart();

        
        List<IItems> items = new ArrayList<>();
        items.add(biscuit);
        items.add(chocolate);
        items.add(hatAdapter); 

        cart.addItemsToCart(items);

        
        cart.displayCart();

	}

}
