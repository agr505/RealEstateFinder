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
    public AvailablePropertiesStateEvent(AvailableProperties source,String t) {
        super(source);
        text=t;
    }
    
     public AvailableProperties getSource() {
        return (AvailableProperties) super.source;
    }
}
