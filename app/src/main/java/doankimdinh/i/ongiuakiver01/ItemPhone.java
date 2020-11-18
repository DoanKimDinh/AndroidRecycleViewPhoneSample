package doankimdinh.i.ongiuakiver01;

public class ItemPhone {
    private int hinhAnh;
    private String name;
    private double price;

    public ItemPhone(int hinhAnh, String name, double price) {
        this.hinhAnh = hinhAnh;
        this.name = name;
        this.price = price;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
