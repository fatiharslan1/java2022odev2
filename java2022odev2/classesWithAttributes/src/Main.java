public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.set_name("laptop");
        product.setId(5);
        product.set_description("yeni");
        product.set_price(47.2);
        product.set_stockAmount(14);

        ProductManager productManager = new ProductManager();

        productManager.Add(product);
        System.out.println(product.get_kod());
    }
}