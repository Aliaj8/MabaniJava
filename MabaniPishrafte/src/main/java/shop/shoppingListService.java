package shop;

import java.util.List;

public interface shoppingListService {
    List<Item> findAllItems();

    void saveItems(List<Item> items);

}
