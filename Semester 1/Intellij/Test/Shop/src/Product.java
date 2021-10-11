public class Product {
    private String prodName;
    private float prodPrice;
    private String prodType;

    public Product(String prodName, float prodPrice, String prodType) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodType = prodType;
    }

    public void tryProduct(){
        System.out.println("The product was tried succesfully");
    }
}
