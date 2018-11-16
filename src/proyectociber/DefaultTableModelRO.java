/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectociber;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author salazarwalter
 */
public class DefaultTableModelRO extends DefaultTableModel{

    public DefaultTableModelRO() {
    }

    public DefaultTableModelRO(int rowCount, int columnCount) {
        super(rowCount, columnCount);
    }

    public DefaultTableModelRO(Vector columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public DefaultTableModelRO(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    public DefaultTableModelRO(Vector data, Vector columnNames) {
        super(data, columnNames);
    }

    public DefaultTableModelRO(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        //return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
}
