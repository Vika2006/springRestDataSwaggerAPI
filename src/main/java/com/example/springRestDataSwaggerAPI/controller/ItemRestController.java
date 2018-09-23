 package com.example.springRestDataSwaggerAPI.controller;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import com.example.springRestDataSwaggerAPI.repository.ItemRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.web.servlet.ServletComponentScan;
import com.example.springRestDataSwaggerAPI.entity.Item;
import com.example.springRestDataSwaggerAPI.services.ItemService;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@ServletComponentScan
@SpringBootApplication
@Service
@RestController
@RequestMapping(path = "/api/items/")

@Api(value = "ItemsControllerApi",produces = MediaType.APPLICATION_JSON_VALUE)


public class ItemRestController  {
    @Autowired
    private ItemService itemService;
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

   // @GetMapping ("/api/items")
  //  public List<Item> getItem () {
 //       List<Item> items = itemService.retrieveItems();
  //      return items;
  //  }


 //   @RequestMapping(value = "/show/{id}", method= RequestMethod.GET)
 //   public Item showItem(@PathVariable Integer id, Model model){
 //       Item item = itemService.getItem()ById(itemNo);
 //       return item;
 //   }
    @GetMapping("/api/items")
    public List<Item> getItems() {
        List<Item> items = itemService.retrieveItems();
        return items;
    }

    @GetMapping("/api/items/{itemNo}")
    public Item getItem(@PathVariable(name="itemNo")Long itemNo) {
        return itemService.getItem(itemNo);
    }

    //  @GetMapping("/api/items/")
      // public Item getItem(@PathVariable(name="itemNo")long itemNo) {
      //    return itemService.getItem(itemNo);
      // }

    @PostMapping("/api/items")
    public void saveItem(Item item){
        itemService.saveItem(item);
        System.out.println("Item Saved Successfully");
    }

    @DeleteMapping("/api/items/{itemNo}")
    public void deleteItem(@PathVariable(name="itemNo")Long itemNo){
        itemService.deleteItem(itemNo);
        System.out.println("Item Deleted Successfully");
    }

    @PutMapping("/api/items/{itemNo}")
    public void updateItem(@RequestBody Item item,
                           @PathVariable(name="itemNo")Long itemNo) {
        Item it = itemService.getItem(itemNo);
        if (it != null) {
            itemService.updateItem(item);

        }

    }
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
