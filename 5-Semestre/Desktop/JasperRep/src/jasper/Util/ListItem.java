/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasper.Util;

/**
 *
 * @author Frede
 */
public class ListItem {

    private int id;
    private String value;
    public ListItem(int id, String value){
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
    
    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

            
}
