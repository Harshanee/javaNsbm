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
public class PostgraduateDetails extends AbstractTableModel {
    
    private static final String[] COLUMNSNAME ={"Reg ID","First Name","Last Name","Faulty"};
    private static ArrayList<Postgraduate> list;
    
    PostgraduateDetails(ArrayList<Postgraduate> unList){
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
                 return list.get(rowIndex).getFaculty();
             default:
                 return "error"; 
                 
         }
    }
    
}
    

