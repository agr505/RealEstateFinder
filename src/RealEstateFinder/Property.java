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
/**
 * Class that holds a Property's name, image name, and text description
 * @author Aaron
 */
public class Property implements  Cloneable, Serializable {
private static final long serialVersionUID = 15;
    public Property(String name, String picture, String text) {
        this.name = name;
        this.picture = picture;
        this.text = text;
    }
    /**
     * accessor for name
     * @return String holding the value of name of property
     */
    public String getName() {
        return name;
    }
    /**
     * accessor for picture
     * @return String holding the location of the picture
     */
    public String getPicture() {
        return picture;
    }
    /**
     * accessor for text description
     * @return String holding the value of the property description 
     */
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
