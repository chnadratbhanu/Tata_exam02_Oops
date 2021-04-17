/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class CncMachine extends Machine { //inheritnace
    
    private String machineName;

    public CncMachine(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineName() {
        return machineName;
    }

    @Override
    public String toString() {
        
        return "Machine " + machineName + " has "+ super.start()+"and "+super.stop();
    }
    
    
    
}
