/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Harshanee
 */
public class ComputingDetails extends AbstractTableModel{
    private static final String[] COLUMNSNAME ={"Reg ID","First Name","Last Name","DOB","ID NO","E-mail"};
    private static ArrayList<Undergraduate> list;
    
    ComputingDetails(ArrayList<Undergraduate> unList){
        list = unList; 
    }
    @Override
    public int getRowCount() {
        return list.size();
    }

    public String getColumnName(int columnIndex){
        return COLUMNSNAME[columnIndex];
    }
    @Override
    public int getColumnCount() {
        return COLUMNSNAME.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch(columnIndex){
             case 0:
                 return list.get(rowIndex).getRegID();
             case 1:
                 return list.get(rowIndex).getFirstName();
             case 2:
                 return list.get(rowIndex).getLastname();
             case 3:
                 return list.get(rowIndex).getDob();
             case 4:
                 return list.get(rowIndex).getIdNO();
             case 5:
                 return list.get(rowIndex).getEmail();
             default:
                 return "error"; 
                 
         }
    }
}
