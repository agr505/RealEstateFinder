/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import java.io.Serializable;

/**
 *
 * @author Aaron
 */
public class Property implements  Cloneable, Serializable {

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
    
    @Override
    public Property clone() throws CloneNotSupportedException 
    {
        return (Property)super.clone();     
    }
     private String name;
   private String picture;
   private String text;
   
   
         
}
