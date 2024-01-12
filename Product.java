class Product {

    private double price;
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double p) {
        price = p; 
    }
    
    public double getPrice(int quantity) {
        return price * quantity;
    }
}

class Main {

    public static void main(String[] args) {

        Product p = new Product();
        p.setPrice(9.99);
        
        System.out.println(p.getPrice()); 
        System.out.println(p.getPrice(5));

    }

}