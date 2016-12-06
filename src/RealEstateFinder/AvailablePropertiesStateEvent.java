/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealEstateFinder;

import javax.swing.event.ChangeEvent;

/**
 *
 * @author Aaron
 */
public class AvailablePropertiesStateEvent extends ChangeEvent{
    public String text;
    
    /** 
     * Overrided constructor allowing for an object of type AvailableProperties to be a
     * parameter
     *
     * @param source of type AvailableProperties
     */
    public AvailablePropertiesStateEvent(AvailableProperties source,String t) {
        super(source);
        text=t;
    }
    
     /**
     * Overrided method for obtaining the source of the event and casting the
     * object into a type AvailableProperties     */
     public AvailableProperties getSource() {
        return (AvailableProperties) super.source;
    }
}
