package info.androidhive.recyclerviewsearch;

/**
 * Created by ravi on 16/11/17.
 */

public class Contact {
    String name;
    String image;
    String phone;

    public Contact() {
    }

    public Contact(String name, String image, String phone) {
        this.name = name;
        this.image = image;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getPhone() {
        return phone;
    }
}
