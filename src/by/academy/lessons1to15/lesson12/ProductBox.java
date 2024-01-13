package by.academy.lessons1to15.lesson12;


import by.academy.lessons1to15.lesson8.deal.Product;

public class ProductBox {
    private Product product;
    public ProductBox(Product product){
        this.product = product;
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
