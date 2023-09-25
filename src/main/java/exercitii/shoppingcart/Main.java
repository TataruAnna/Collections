package exercitii.shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("branza",20,Category.LACTATE);
        Product product2 = new Product("SALAM",10,Category.MEZELURI);
        Product product3 = new Product("MERE",5,Category.LEGUMEFRUCTE);
        shoppingCart.addToCart(product1,3);
        shoppingCart.addToCart(product2,1);
        shoppingCart.addToCart(product3,5);
        System.out.println(shoppingCart);

      try{
            shoppingCart.removeFromCart(product1,2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(shoppingCart);


    }
}
