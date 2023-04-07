package Restaurant;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    ArrayList<MenuItems> menu = new ArrayList<>();
    private Date LastUpdated = new Date;

//   TODO: Define Getters and Setters as needed
    public ArrayList<Restaurant.MenuItems> getMenu() {
        return menu;
    }
//    TODO: Define custom isString() method

//    TODO: Add item()
    void addItem(MenuItems item){
       menuItems.add(item);
    }
}
