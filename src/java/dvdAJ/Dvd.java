/*
 * Andrew Jackson
 * cs4010 hw4
 * 08/11/2017
 */
package dvdAJ;
import java.io.*;
import java.text.NumberFormat;

public class Dvd implements Serializable{
    private String productCode;
    private String name;
    private String imageSrc;
    private String quantity;
    private String price;
    
    public Dvd(){
        productCode= "";
        name = "";
        imageSrc = "";
        quantity = "0";
        price = "0";
    }
    public Dvd(String productCode , String name , String imageSrc , 
               String quantity , String price){
        this.productCode = productCode;
        this.name = name;
        this.imageSrc = imageSrc;
        this.quantity = quantity;
        this.price = price;
        
    }
    public void setProductCode(String productCode){
        this.productCode = productCode;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setImageSrc(String imageSrc){
        this.imageSrc = imageSrc;
    }
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }
    public void setPrice(String price){
        this.price = price;
    }
    
    public String getProductCode(){
        return productCode;
    }
    public String getName(){
        return name;
    }
    public String getImageSrc(){
        return imageSrc;
    }
    public String getQuantity(){
        return quantity;
    }
    public String getPrice(){
        return price;
    }
    
    public String getPriceCurrencyFormat(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(Float.parseFloat(price));
    }
    public String getTotalCurrencyFormat(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(Float.parseFloat(price)*Integer.parseInt(quantity));
    }
}
