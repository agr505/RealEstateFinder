/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

/**
 *
 * @author Aaron
 */
public class Property {

    public Property(String name, String picture, String text) {
        this.name = name;
        this.picture = picture;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public String getText() {
        return text;
    }
     private String name;
   private String picture;
   private String text;
   
         
}
