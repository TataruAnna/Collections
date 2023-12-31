package exercitii.store;

import java.util.*;

public class Store {
    private Map<Category, List<Product>> productsByCategory;

    public Store(){
        this.productsByCategory = new HashMap<>();
    }

    public Map<Category, List<Product>> getProductsByCategory() {
        return productsByCategory;
    }

    public void setProductsByCategory(Map<Category, List<Product>> productsByCategory) {
        this.productsByCategory = productsByCategory;
    }

    public void addProduct(Product product){
        if(productsByCategory.containsKey(product.getCategory())){
            productsByCategory.get(product.getCategory()).add(product);
        }
        else{
            List<Product> valueProductList = new ArrayList<>();
            valueProductList.add(product);
            productsByCategory.put(product.getCategory(),valueProductList);
        }
    }

    public List<Product> getProductsByCategory(Category category){
        return productsByCategory.get(category);
    }

    public Set<Category> getAllCategories(){
        return productsByCategory.keySet();
    }

    public void deleteProduct(Product product){
        productsByCategory.get(product.getCategory()).remove(product);
    }
}
