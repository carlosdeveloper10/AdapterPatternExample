/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cmsoft.adapterexample;

/**
 * Helps to adapt the class <code>edu.cmsoft.adapterexample.Circle</code> to
 * the interface <code>edu.cmsoft.adapterexample.IConnectable</code>
 *	
 * @author salak401
 */
public class PlugAdapter implements IConnectable{

    private CirclePlug plug;
    
    public PlugAdapter(){
        this.plug = new CirclePlug();
    }
    
    public String connectToStandarLeftInput() {
        return plug.connectToSCircleLeftInput();
    }

    @Override
    public String connectToStandarRightInput() {
        return plug.connectToCircleRightInput();
    }
    
}
