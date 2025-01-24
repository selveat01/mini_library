/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minilibrary;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wardi
 */
public class BorrowerTableModel extends DefaultTableModel {
    
    public BorrowerTableModel() {
        super(new Object[] {"No. ID", "Name", "Borrowed Book"}, 0);
    }
    
}
