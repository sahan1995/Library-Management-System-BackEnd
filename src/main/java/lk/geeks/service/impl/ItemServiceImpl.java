package lk.geeks.service.impl;

import lk.geeks.dto.ItemDTO;
import lk.geeks.entity.Item;
import lk.geeks.repostitory.ItemRepository;
import lk.geeks.service.ItemService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Override
    public boolean save(ItemDTO itemDTO) {


        Item item = new Item();
        BeanUtils.copyProperties(itemDTO,item);
        itemRepository.save(item);

        return true;
    }

    @Override
    public boolean update(String itemCode, ItemDTO itemDTO) {

        Item item = itemRepository.findById(itemCode).get();
        BeanUtils.copyProperties(itemDTO,item);
//        itemRepository.save(item);
        return true;
    }

    @Override
    public boolean delete(String itemCode) {

        itemRepository.deleteById(itemCode);

        return true;
    }

    @Override
    public List<ItemDTO> findAll() {

        if(itemRepository.findAll().isEmpty()){
            return null;
        }
        List<ItemDTO> itemDTOS = new ArrayList<>();

        itemRepository.findAll().forEach(item -> {
            ItemDTO itemDTO = new ItemDTO();
            BeanUtils.copyProperties(item,itemDTO);
            itemDTOS.add(itemDTO);
        });

        return itemDTOS;
    }

    @Override
    public ItemDTO findById(String itemCode) {

        if(!itemRepository.findById(itemCode).isPresent()){
            return null;
        }

        ItemDTO itemDTO = new ItemDTO();

        BeanUtils.copyProperties(itemRepository.findById(itemCode).get(),itemDTO);
        return  itemDTO;
    }

    @Override
    public boolean changeCategory(String itemCode, String categoryType) {
        Item item = itemRepository.findById(itemCode).get();
        item.setBookCatagory(categoryType);
        return true;
    }

    @Override
    public boolean setRare(String itemCode) {
        Item item = itemRepository.findById(itemCode).get();
        item.setBookCatagory("rare");
        return true;
    }

    @Override
    public boolean setPublic(String itemCode) {
        Item item = itemRepository.findById(itemCode).get();
        item.setBookCatagory("public");
        return true;
    }

    @Override
    public List<ItemDTO> findByitemCategory(String itemCategory) {
        List<Item> items = itemRepository.findAll();
        if(items.isEmpty()){
            return null;
        }

        List<ItemDTO> itemDTOS = new ArrayList<>();
        items.forEach(item -> {
            if(item.getItemCategory().equals(itemCategory)){
                ItemDTO itemDTO = new ItemDTO();
                BeanUtils.copyProperties(item,itemDTO);
                itemDTOS.add(itemDTO);
            }
        });

        return itemDTOS;
    }


}
