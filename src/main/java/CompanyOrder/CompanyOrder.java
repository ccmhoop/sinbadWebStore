package CompanyOrder;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import products.Products;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CompanyOrder {
    @Id
    @GeneratedValue
    Long CompanyOrderID;

    String order;

    CompanyOrder(){
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "companyorder")
    private List<Products> products = new ArrayList<>();

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public List<Products> getProducts() {
        return products;
    }

    public Long getCompanyOrderID() {
        return CompanyOrderID;
    }


}
