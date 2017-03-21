package exercicio01;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel{
	
	private int d1 = 1, d2 = 6, d3 = 1, d4 = 0, d5 = 1, d6 = 7;
	
	public String getColumnName(int column){
		switch(column){
		case 0: return "F";
		case 1: return "E";
		case 2: return "D";
		case 3: return "C";
		case 4: return "B";
		case 5: return "A";
		}
		return "G";
	}

	public int getColumnCount(){
		return 6;
	}

	public int getRowCount(){
		return 100;
	}

	public Object getValueAt(int rowIndex, int columnIndex){
		switch(columnIndex){
		case 0: return columnIndex + rowIndex + d1 + d5;
		case 1: return columnIndex + rowIndex + d2 * 2;
		case 2: return columnIndex + rowIndex + d3 - 1;
		case 3: return 4 * rowIndex;
		case 4: return rowIndex * 2 + d3;
		case 5: return d4 + d6 + rowIndex;
		}
		return rowIndex;
	}
}
