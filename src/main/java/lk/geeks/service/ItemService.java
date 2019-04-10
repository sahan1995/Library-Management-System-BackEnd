package lk.geeks.service;

import lk.geeks.dto.ItemDTO;
import lk.geeks.entity.Item;

import java.util.List;

public interface ItemService {

    boolean save(ItemDTO itemDTO);

    boolean update(String itemCode, ItemDTO itemDTO);

    boolean delete(String itemCode);

    List<ItemDTO> findAll();

    ItemDTO findById(String itemCode);

    boolean changeCategory(String itemCode,String categoryType);

    boolean setRare(String itemCode);

    boolean setPublic(String itemCode);

    List<ItemDTO> findByitemCategory(String itemCategory);

}
