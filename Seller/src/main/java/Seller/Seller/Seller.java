package Seller.Seller;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "seller_email", nullable = false, unique = true)
    private String sellerEmail;

    @Column(name = "seller_name", nullable = false)
    private String sellerName;

    @Column(name = "seller_category", nullable = false)
    private String sellerCategory;

    @Column(name = "seller_password", nullable = false)
    private String sellerPassword;

    @Column(name = "seller_description", nullable = false)
    private String sellerDescription;

    @Column(name = "Product_ID", nullable = false)
    private String productId;


    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updated_at")
    @CreationTimestamp
    private Date updatedAt;

    public Seller(){

    }

    public Seller(String seller_name, String seller_email, String seller_category, String seller_password, String seller_description, String product_Id){
        this.setSellerName(sellerName);
        this.setSellerEmail(sellerEmail);
        this.setSellerCategory(sellerCategory);
        this.setSellerPassword(sellerPassword);
        this.setSellerDescription(sellerDescription);
        this.setProductId(productId);
    }

    public int getId(){return id;}

    public String getSellerName(){return sellerName;}

    public void setSellerName(String sellerName) {this.sellerName = sellerName;}

    public String getSellerEmail(){return sellerEmail;}

    public void setSellerEmail(String sellerEmail) {this.sellerEmail = sellerEmail;}

    public String getSellerCategory(){return sellerCategory;}

    public void setSellerCategory(String sellerCategory) {this.sellerCategory = sellerCategory;}

    public String getSellerPassword(){return sellerPassword;}

    public void setSellerPassword(String sellerPassword) {this.sellerPassword = sellerPassword;}

    public String getSellerDescription(){return sellerDescription;}

    public void setSellerDescription(String sellerStreetAddress) {this.sellerDescription = sellerDescription;}

    public String getProductId(){return productId;}

    public void setProductId(String productId) {this.productId = productId;}

    public Date getCreatedAt() {return createdAt;}

    public void setCreatedAt(Date createdAt){this.createdAt = createdAt;}

    public Date getUpdatedAt(){ return updatedAt;}

    public void setUpdatedAt(Date updatedAt){this.updatedAt = updatedAt;}
}

