package shop;

import java.util.List;

public class shoppingListServiceImpl implements shoppingListService {
    @Override
    public List<Item> findAllItems() {
        return null;
    }

    @Override
    public void saveItems(List<Item> items) {
        for (Item item : items) {
            item.check();
        }

    }
}
