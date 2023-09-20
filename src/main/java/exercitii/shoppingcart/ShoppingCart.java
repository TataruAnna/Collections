package exercitii.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> cartItems;

    public ShoppingCart() {
        this.cartItems = new HashMap<>();
    }

    public Map<Product, Integer> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<Product, Integer> cartItems) {
        this.cartItems = cartItems;
    }

    public void addToCart(Product product, Integer quantity){
        if(cartItems.containsKey(product)){
            cartItems.put(product, cartItems.get(product)+quantity );
        }
        else{
            cartItems.put(product, quantity);
        }
    }

    public void addToCart(Product product){
        if(cartItems.containsKey(product)){
            cartItems.put(product, cartItems.get(product)+1 );
        }
        else{
            cartItems.put(product, 1);
        }

    }

    public void removeFromCart(Product product, Integer quantity)throws Exception{
            if(!cartItems.containsKey(product)){
                throw new Exception("produsul nu exista ");
            }
            if(quantity<cartItems.get(product)){
                throw new Exception("Produsul are o cantitate mai mica");
            }

            cartItems.remove(product,cartItems.get(product)-quantity);

    }

    public void removeFromCart(Product product)throws Exception{
        if(!cartItems.containsKey(product)){
            throw new Exception("produsul nu exista ");
        }
        cartItems.remove(product);

    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartItems=" + cartItems +
                '}';
    }
}
