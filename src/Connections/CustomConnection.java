/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;

import java.util.ArrayList;

/**
 *
 * @author pgouttef
 */
public class CustomConnection {
    
    private int respawnIncrement = 10;
    // Par defaut : 
    private String javaStarterClass = "user.Starter";
    private ArrayList<String> args = new ArrayList<String>();
    private String nodeName;

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ArrayList<String> getArgs() {
        return args;
    }

    public void setArgs(ArrayList<String> args) {
        this.args = args;
    }
    
    public void freeArgs() {
        this.args = new ArrayList<String>();
    }
    
    public void addArgs(String arg) {
        this.args.add(arg);
    }
    
    public void removeArg(int i) {
        this.args.remove(i);
    }
    
    public void setArg(int i , String value) {
        this.args.set(i, value);
    }

    public String getJavaStarterClass() {
        return javaStarterClass;
    }

    public void setJavaStarterClass(String javaStarterClass) {
        this.javaStarterClass = javaStarterClass;
    }

    public int getRespawnIncrement() {
        return respawnIncrement;
    }

    public void setRespawnIncrement(int respawnIncrement) {
        this.respawnIncrement = respawnIncrement;
    }
    
    
}