/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectociber;

import javax.swing.JTable;
import javax.swing.table.TableColumn;
import sun.swing.MenuItemLayoutHelper.ColumnAlignment;

/**
 *
 * @author salazarwalter
 */
public class Grilla {

    public static void hacerColumnaInvisible(TableColumn column) {
        column.setMaxWidth(0);
        column.setMinWidth(0);
        column.setPreferredWidth(0);
        column.setWidth(0);
    }
//    public static void hacerColumnaInvisible(ColumnModel c){
//        
//    }

    public static void asignarAnchoRelativo(TableColumn column,int width) {
        column.setMinWidth(width);
        column.setPreferredWidth(width);
    }

    public static void hacerColumnaInvisible(JTable tabla, int col) {
        hacerColumnaInvisible(tabla.getColumnModel().getColumn(col));
    }

    public static void asignarAnchoRelativo(JTable tabla, int col, int width) {
        asignarAnchoRelativo(tabla.getColumnModel().getColumn(col), width);
    }

    public static void doDate(JTable tabla, int col) {
        tabla.getColumnModel().getColumn(col).setCellRenderer(new DateFormatRenderer());
    }

    public static void doDouble(JTable tabla, int col) {
        tabla.getColumnModel().getColumn(col).setCellRenderer(new DecimalFormatRenderer());
    }
    public static void doInt(JTable tabla, int col) {
        tabla.getColumnModel().getColumn(col).setCellRenderer(new IntegerFormatRenderer());
    }
}
