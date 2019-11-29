package com.utility;

public class TestexcelSpecifi {

	public static void main(String[] args) {
		private void processExcelFile(File f_path) throws Exception{
		    File path=f_path;

		    try{

		        FileInputStream is=new FileInputStream(path);

		        HSSFWorkbook wb = new HSSFWorkbook(is);
		        HSSFSheet sheet = wb.getSheetAt(0);

		        int rowcount_post=0;
		        int rowcount_304=0;

		                for(Row row: sheet){
		                    for(Cell cell : row){

		                        if (cell.getCellType() == Cell.CELL_TYPE_STRING){
		                                if (cell.getRichStringCellValue().getString().trim().equals("GET")){
		                                        rowcount_post=row.getRowNum();

		                                        HSSFRow removingRow = sheet.getRow(rowcount_post);

		                                            if (removingRow != null) {
		                                            sheet.removeRow(removingRow);
		                                            }

		                                     try (FileOutputStream fileOut = new FileOutputStream("C:/juni.xls")) {
		                                        wb.write(fileOut);
		                                    }
		                                    break;
		                                }
		                                else{
		                                    System.out.print("NOT FOUND");

		                                }


		                        break;
		                        }

		                    }
		                }

		    }
		    catch(Exception e){
		           JOptionPane.showMessageDialog(this,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
		    }
		}
		

	}

}
