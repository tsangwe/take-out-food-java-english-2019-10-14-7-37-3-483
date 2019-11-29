public class Order {
    private Item item;
    private int quantity;
    
    public Order(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return (int) item.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return item.getName() + " x " + quantity + " = " + (int) item.getPrice()*quantity + " yuan\n";
    }
}