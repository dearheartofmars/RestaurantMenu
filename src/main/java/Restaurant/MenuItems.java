package Restaurant;

public class MenuItems {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew;
public MenuItems(String name) {
    this.name = name;

}
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
//    TODO: Define custom toString() method

    @Override
    public String toString() {
        return name + '\n' +
                description + '\n' +
                category.toUpperCase() + "| $" + price;
    }

}
