package TaskSix;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("A", 1);
        Item item2 = new Item("B", 2);
        Item item3 = new Item("C", 3);
        Item item4 = new Item("D", 4);
        Item item5 = new Item("E", 5);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
        shoppingCart.addItem(item4);
        shoppingCart.addItem(item5);
        shoppingCart.setDiscount(0);

        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getItemList());

        shoppingCart.removeItem(item5);
        shoppingCart.removeItem(item1);
        shoppingCart.setDiscount(1);

        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getItemList());

    }
}
