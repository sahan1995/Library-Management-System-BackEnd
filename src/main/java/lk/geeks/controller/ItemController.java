package lk.geeks.controller;

import lk.geeks.dto.ItemDTO;
import lk.geeks.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "api/v1/items")
public class ItemController {

    @Autowired
    private ItemService itemService;


    /**
     * Get all Items
     * @return List of All Items
     */
    @GetMapping
    public List<ItemDTO> findAll(){
        return itemService.findAll();
    }

    /**
     * Get Item by Item Code
     * @param itemCode Item Code of Item
     * @return The Item DTO
     */
    @GetMapping(value = "/{itemCode}")
    public ItemDTO findByID(@PathVariable("itemCode") String itemCode){
        return itemService.findById(itemCode);
    }

    /**
     * Save the Item
     * @param itemDTO Item DTO containing all the information of Item
     * @return state of save or not
     */
    @PostMapping
    public boolean save(@RequestBody ItemDTO itemDTO){
        return itemService.save(itemDTO);
    }

    /**
     * Update the Item
     * @param itemCode  Item Code of Item
     * @param itemDTO Item DTO containing all the information of Item
     * @return state of sava or not
     */
    @PutMapping(value = "/{itemCode}")
    public boolean update(@PathVariable("itemCode") String itemCode, @RequestBody ItemDTO itemDTO){
        return itemService.update(itemCode,itemDTO);
    }


    /**
     * Delete the Item
     * @param itemCode  Item Code of Item
     * @return state of delete or not
     */
    @DeleteMapping(value = "/{itemCode}")
    public boolean deleteItem(@PathVariable("itemCode") String itemCode){
        return itemService.delete(itemCode);
    }

    /**
     * Set Item Rare
     * @param itemCode Item Code of Item
     * @return state of update or not
     */
    @PutMapping(value = "/setRare/{itemCode}")
    public boolean setItemRare(@PathVariable("itemCode") String itemCode){
        return itemService.setRare(itemCode);
    }

    /**
     * Set Item Public
     * @param itemCode Item Code of Item
     * @return state of update or not
     */
    @PutMapping(value = "/setPublic/{itemCode}")
    public boolean setItemPublic(@PathVariable("itemCode") String itemCode){
        return itemService.setPublic(itemCode);
    }

    /**
     * Get Items By Category
     * @return List of Category
     */
    @GetMapping(value = "/getBooks/{itemCategory}")
    public List<ItemDTO> getItemByCategory(@PathVariable("itemCategory") String itemCategory){
        return itemService.findByitemCategory(itemCategory);
    }

    /**
     * Change status of Item
     * @param itemCode Item Code of Item
     * @param category Status of Item
     * @return state of update or not
     */
    @PutMapping(value = "/changeCategory/{itemCode}/{category}")
    public boolean changeCategory(@PathVariable("itemCode") String itemCode, @PathVariable("category") String category){
        return itemService.changeCategory(itemCode,category);
    }

}
