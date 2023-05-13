package test1;

public class CheckBranch {
	public boolean verify(String br) {
		return switch(br) {
		
		case "CIVIL":yield true;
		case "EEE"  :yield true;
		case "MECH" :yield true;
		case "ECE"  :yield true;
		case "CSC"  :yield true;
		default     :yield false;
		};	
	}
}
