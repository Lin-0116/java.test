package mode;

public class movie {
    private int id;
    private String name;
    private int price;
    private String number;//主演名称

    public movie() {
}

    public movie(int id,String name, int price, String number) {
        this.id=id;
        this.name = name;
        this.price = price;
        this.number = number;
}

    public int getId() {
        return id;
}

    public void setId(int id) {
        this.id = id;
}

    public String getName() {
        return name;
}

    public void setName(String name) {
        this.name = name;
}

    public int getPrice() {
        return price;
}

    public void setPrice(int price) {
        this.price = price;
}

    public String getNumber() {
        return number;
}

    public void setNumber(String number) {
        this.number = number;
}

}
