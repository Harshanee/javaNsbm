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
public class SubjectDetails extends AbstractTableModel {

    
    private static final String[] COLUMNSNAME ={"SUBJECT NAME","SUBJECT CODE","SUBJECT CREDIT","FACULTY"};
    private static ArrayList<SubjectInfo> list;
    
    SubjectDetails(ArrayList<SubjectInfo> unList){
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
                 return list.get(rowIndex).getSubName();
             case 1:
                 return list.get(rowIndex).getSubCode();
             case 2:
                 return list.get(rowIndex).getSubCredit();
             case 3:
                 return list.get(rowIndex).getFaculty();   
        
             default:
                 return "error"; 
                 
         }
    }
    
}
