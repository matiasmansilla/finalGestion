/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectociber;

import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.Date;

/**
 *
 * @author salazarwalter
 */
public class DateFormatRenderer extends DefaultTableCellRenderer{
    private static Color color =new Color(125,250,200);
    public DateFormatRenderer(){
        setBackground(color);
    }
    public Component getTableCellRendererComponent(JTable table, Object value, boolean
isSelected, boolean hasFocus, int row, int column){
super.getTableCellRendererComponent( table, value, isSelected, hasFocus, row, column );
    if ( value instanceof Date ){

        String strDate = new SimpleDateFormat("dd/MM/yyyy").format((Date)value);
        
        this.setText( strDate );
        this.setHorizontalAlignment(this.CENTER);
    }
return this;
}
}

