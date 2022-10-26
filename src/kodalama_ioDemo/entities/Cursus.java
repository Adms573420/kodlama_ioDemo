package kodalama_ioDemo.entities;

public class Cursus {
    private String Category;
    private String instructor;
    private int price;

    public void Cursus() {

    }

    public Cursus(String category, String instructor, int price) {
        Category = category;
        this.instructor = instructor;
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
