
class Item {     
    private String name;
    private double price;
    private int index;



    // constructor:
    Item (String name, double price) {
        this.name = name;
        this.price = price;
    }


    // getters:
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getIndex(){
        return index;
    }

    // setters:
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIndex(int index){
        this.index = index;
    }
}

