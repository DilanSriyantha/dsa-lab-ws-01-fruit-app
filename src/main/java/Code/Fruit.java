package Code;

public class Fruit {
    private String name;
    private String type;
    private String color;
    private String imagePath;
    
    public Fruit(String name, String type, String color){
        this.name = name;
        this.type = type;
        this.color = color;
    }
    
    public Fruit(String name, String type, String color, String imagePath){
        this.name = name;
        this.type = type;
        this.color = color;
        this.imagePath = imagePath;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getImagePath(){
        return imagePath;
    }
    
    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }
    
    public String toString(){
        return "Name : " + name + "\n"
                + "Color : " + color + "\n"
                + "Type : " + type;
    }
}
