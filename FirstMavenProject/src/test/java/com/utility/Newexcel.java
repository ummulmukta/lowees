package com.utility;

public class Newexcel {

	public static void main(String[] args) {
		//Access the Maximum Display Range
		Range range = worksheet.getCells().getMaxDisplayRange();
		int tcols = range.getColumnCount();
		int trows = range.getRowCount();
		 
		System.out.println("Total Rows:" + trows);
		System.out.println("Total Cols:" + tcols);
		 
		RowCollection rows = cells.getRows();
		 
		for (int i = 0 ; i < rows.getCount() ; i++)
		{
		    for (int j = 0 ; j < tcols ; j++)
		    {
		        System.out.print(cells.get(i,j).getName() + " - " + cells.get(i,j).getValue() + "\t");
		    }
		    System.out.println("");
		}

	}

}
