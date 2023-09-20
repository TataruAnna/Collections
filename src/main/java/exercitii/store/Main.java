package exercitii.store;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("carnat", 20, Category.MEZELURI);

        Store store = new Store();
        store.addProduct(product);
        Product product2 = new Product("muschi", 30, Category.MEZELURI);
        store.addProduct(product2);
        store.deleteProduct(product2);
        System.out.println(store.getProductsByCategory());
    }
}
