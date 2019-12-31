/*
 * Andrew Jackson
 * cs4010 hw4
 * 08/11/2017
 */

package dvdAJ;
import java.io.*;
import java.text.NumberFormat;


public class Cart implements Serializable{
    private Dvd[] contents;
    
    public Cart(){
        contents = new Dvd[4];
        contents[0] = new Dvd("dvd01" , "The Royal Tenenbaums" ,
                            "https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/The_Tenenbaums.jpg/220px-The_Tenenbaums.jpg" ,
                            "0" , "9.99");
        contents[1] = new Dvd("dvd02" , "Rushmore" , 
                            "https://upload.wikimedia.org/wikipedia/en/thumb/4/42/Rushmoreposter.png/220px-Rushmoreposter.png" ,
                            "0" , "8.99");
        contents[2] = new Dvd("dvd03" , "The Life Aquatic with Steve Zissou" ,
                            "https://upload.wikimedia.org/wikipedia/en/thumb/7/7c/Lifeaquaticposter.jpg/220px-Lifeaquaticposter.jpg" ,
                            "0" , "7.99");
        contents[3] = new Dvd("dvd04" , "The Grand Budapest Hotel" , 
                            "https://upload.wikimedia.org/wikipedia/en/a/a6/The_Grand_Budapest_Hotel_Poster.jpg" , 
                            "0" , "10.99");
    }
    
    public void setContents(Dvd[] contents){
        this.contents = contents;
    }
    
    public Dvd[] getContents(){
        return contents;
    }
    public void updateContents(String productCode , String quantity){
        if (productCode.equals("dvd01")){
            if(quantity.equals("add")){
                contents[0].setQuantity(new Integer((Integer.parseInt(contents[0].getQuantity())
                                        + 1)).toString());
            }
            else{
                contents[0].setQuantity(quantity);
            }
        }
        else if (productCode.equals("dvd02")){
            if(quantity.equals("add")){
                contents[1].setQuantity(new Integer((Integer.parseInt(contents[1].getQuantity())
                                        + 1)).toString());
            }
            else{
                contents[1].setQuantity(quantity);
            }
        }
        else if (productCode.equals("dvd03")){
            if(quantity.equals("add")){
                contents[2].setQuantity(new Integer((Integer.parseInt(contents[2].getQuantity())
                                        + 1)).toString());
            }
            else{
                contents[2].setQuantity(quantity);
            }
        }
        else if (productCode.equals("dvd04")){
            if(quantity.equals("add")){
                contents[3].setQuantity(new Integer((Integer.parseInt(contents[3].getQuantity())
                                        + 1)).toString());
            }
            else{
                contents[3].setQuantity(quantity);
            }
        }
    }
    
    public String getTotal(){
        float totalFloat = 0;
        for(Dvd dvd : contents){
            totalFloat += Float.parseFloat(dvd.getPrice()) * 
                          Float.parseFloat(dvd.getQuantity());
        }
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(totalFloat);      
    }
}
