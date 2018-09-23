package com.example.springRestDataSwaggerAPI.entity;


import com.example.springRestDataSwaggerAPI.repository.ItemRepository;
import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@Component
@Service
@Entity
@ApiModel(description = "All about item")
@Table(name="ITEMS")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemNo;

    @Column(name = "ITEM_NAME")
    private String name;

    @Column(name = "ITEM_AMOUNT")
    private int amount;

    @Column(name = "INVENTARY_CODE")
    private int inventaryCode;



    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long itemNo) {
        this.itemNo = itemNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public Integer getInventaryCode() {
        return inventaryCode;
    }

    public void setInventaryCode(Integer inventaryCode) {
        this.inventaryCode = inventaryCode;
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 @Override
public String toString() {
     return "Item{" + "itemNo=" + itemNo + ", name='" + name + '\'' + ", amount=" + amount + "" +
             ", inventaryCode=" + inventaryCode + '}';


 }
}