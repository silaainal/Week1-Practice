public class Product{
    String name;
    double price;
    String category;

    public Product(String name, double price, String category){
        this.name= name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo(){
        System.out.println("Product: " + name + " Price: " + price + " Category: " + category);
    }

    //public void applyDiscount(double percent)
    //perform operation, return nothing
    //public Product applyDiscount(double percent)
    //perform operation, return this object
    public void applyDiscount(double percent){
        if(percent < 0 || percent > 100){
            System.out.println("Invalid discount");
            return;
        }

        double discount = price * (percent / 100);
        price -= discount;

        //%.0f%%
        //% formatting; .0 no decimal place; f floating point number; %% print
        //%.2f
        //% formatting; .2 2 decimal place; f floating point number
        System.out.printf("%.0f%% discount applied. New price: $%.1f\\n", percent, price);
    }
}