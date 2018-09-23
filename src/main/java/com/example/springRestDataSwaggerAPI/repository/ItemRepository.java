package com.example.springRestDataSwaggerAPI.repository;

import com.example.springRestDataSwaggerAPI.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@Repository

public interface ItemRepository extends JpaRepository<Item, Long> {

}
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
/*
@Repository

public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
    Item findHotelByName(String name);

    Page findAll(Pageable pageable);
}
*/


