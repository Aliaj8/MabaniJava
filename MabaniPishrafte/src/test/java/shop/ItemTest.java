package shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemTest {
    private shoppingListService shoppingList;
    private List<Item> itemList;
    @BeforeEach
    void setUp() {
        shoppingList = new shoppingListServiceImpl();
        itemList= new LinkedList<>();
    }

    @Test
    void should_be_check_if_item_are_not_null_or_empty() {
        itemList.add(new Item("Banana",5));
        itemList.add(new Item("Orange",2));
        assertDoesNotThrow(()-> shoppingList.saveItems(itemList));
    }

    @Test
    void should_throw_item_name_exception_when_an_item_with_null_name_exist() {
        itemList.add(new Item("Banana",5));
        itemList.add(new Item(null,2));
        assertThrows(ItemNameException.class, ()-> shoppingList.saveItems(itemList));
    }
    @Test
    void should_throw_item_name_exception_when_an_item_with_empty_name_exist() {
        itemList.add(new Item("",5));
        itemList.add(new Item("Orange",2));
        assertThrows(ItemNameException.class, ()-> shoppingList.saveItems(itemList));
    }

    @Test
    void should_throw_item_quantity_exception_when_an_item_has_a_quantity_less_than_one() {
        itemList.add(new Item("Banana",0));
        itemList.add(new Item("Orange",20));
        assertThrows(ItemQuantityException.class, ()-> shoppingList.saveItems(itemList));
    }
    @Test
    void should_throw_item_quantity_exception_when_an_item_has_a_quantity_greater_than_100
            () {
        itemList.add(new Item("Banana",55));
        itemList.add(new Item("Orange",101));
        assertThrows(ItemQuantityException.class, ()-> shoppingList.saveItems(itemList));
    }
}
