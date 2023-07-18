package products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Products {

    @Id
    @GeneratedValue
    Long productID;

    String productType;

    Products(){
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="roomid", nullable = false)
    private Products products;

    public Products getChat() {
        return products;
    }

    public void setChat(Products chat) {
        this.products = chat;
    }
}
