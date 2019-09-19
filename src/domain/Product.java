package domain;

public class Product {
    private String title;
    private String type;
    private String id;

    public Product(String title, String type, String id){
        setTitle(title);
        setType(type);
        setId(id);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }


}
