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
public class ResultDetails extends AbstractTableModel{

    private static final String[] COLUMNSNAME ={"Reg ID","Main1","Main2","Main2","Optional1","Optional2","Optional3","Optional4","GPA"};
    private static ArrayList<ResultMake> list;
    
    ResultDetails(ArrayList<ResultMake> rmList){
        list = rmList; 
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
                 return list.get(rowIndex).getRegid();
             case 1:
                 return list.get(rowIndex).getMmark11();
             case 2:
                 return list.get(rowIndex).getMmark12();
             case 3:
                 return list.get(rowIndex).getMmark13();
             case 4:
                 return list.get(rowIndex).getMark11();
             case 5:
                 return list.get(rowIndex).getMark12();
             case 6:
                 return list.get(rowIndex).getMark13();
             case 7:
                 return list.get(rowIndex).getMark14();
            case 8:
                 return list.get(rowIndex).getGpa();
             default:
                 return "error"; 
                 
         }
    }
    
}
