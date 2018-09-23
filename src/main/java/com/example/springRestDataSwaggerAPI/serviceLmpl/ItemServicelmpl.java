package com.example.springRestDataSwaggerAPI.serviceLmpl;
import org.springframework.boot.CommandLineRunner;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import com.example.springRestDataSwaggerAPI.services.ItemService;
import com.example.springRestDataSwaggerAPI.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.springRestDataSwaggerAPI.entity.Item;

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@Service
@Component
public class ItemServicelmpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;


    public ItemServicelmpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> retrieveItems() {
        List<Item> items = itemRepository.findAll();
        return items;
    }

    public Item getItem(Long item_itemNo) {
        Optional<Item> optImp = itemRepository.findById(item_itemNo);
        return optImp.get();
    }

    public void saveItem(Item item){
        itemRepository.save(item);
    }

    public void deleteItem(Long item_itemNo){
        itemRepository.deleteById(item_itemNo);
    }

    public void updateItem(Item item) { itemRepository.save(item);

    }

    }


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++