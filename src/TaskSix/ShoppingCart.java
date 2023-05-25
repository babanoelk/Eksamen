package TaskSix;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> itemList = new ArrayList<>();
    private int discount = 0;

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public int getTotalPrice() {
        int counter = 0;
        for (Item i : itemList) {
            counter += i.getPrice();
        }
        if (discount > 0) {
            return counter - discount;
        }
        return counter;
    }

}
