/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cmsoft.adapterexample;

/**
 * 
 * Represents a standard electric plug.
 *
 * @author carlos mario <carlos_programmer10@hotmail.com>
 *
 */
public class StandarPlug implements IConnectable {

    @Override
    public String connectToStandarLeftInput() {
        return "Side Left is connected...";
    }

    @Override
    public String connectToStandarRightInput() {
        return "Side right is connected...";
    }
}
