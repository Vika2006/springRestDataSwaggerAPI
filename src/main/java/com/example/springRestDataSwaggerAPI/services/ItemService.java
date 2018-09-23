package com.example.springRestDataSwaggerAPI.services;


import java.util.List;
import com.example.springRestDataSwaggerAPI.entity.Item;

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
public interface ItemService {

    public List<Item> retrieveItems();

    public Item getItem(Long item_itemNo);

    public void saveItem(Item item);

    public void deleteItem(Long item_itemNo);

    public void updateItem(Item item);
}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
