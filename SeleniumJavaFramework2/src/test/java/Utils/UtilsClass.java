package Utils;

public class UtilsClass {
public static void main(String[] args) {
	ExcelUtils utt = new ExcelUtils("C:\\Users\\Windows\\eclipse-workspace\\SeleniumJavaFramework2\\excel\\Data.xlsx","Sheet1");
	utt.getRowCount();
	utt.getColCount();
	utt.getCellStringData(1,0);
	utt.getCellNumericData(2,1);
}
}
