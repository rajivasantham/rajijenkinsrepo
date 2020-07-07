package dataDriven;

public class DataDirver {

	public static void main(String[] args) throws Exception {
		ExcelAPI e1=new ExcelAPI("D:\\Excel\\testdata.xlsx");
		System.out.println(e1.getCellData("login", 1, 1));
		System.out.println(e1.getCellData("login","userName",2));
		System.out.println(e1.setCellData("login", 4, 1, "passed"));

	}

}
