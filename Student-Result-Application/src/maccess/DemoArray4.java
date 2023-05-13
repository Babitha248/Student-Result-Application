package maccess;
import test1.*;
import java.util.*;
public class DemoArray4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Students:");
		int n=Integer.parseInt(s.nextLine());
		StudentDetails ob[]=new StudentDetails[n];
		System.out.println("Enter "+n+" Student Details..." );
		for(int i=0; i<ob.length; i++)
		{
			System.out.println("***Student "+(i+1)+" details...***");
			ob[i]=new StudentDetails();
			System.out.println("Enter the name:");
			ob[i].name=s.nextLine();
			System.out.println("Enter the Branch(CIVIL/EEE/MECH/ECE/CSE)");
			ob[i].branch=s.nextLine().toUpperCase();
			CheckBranch cb=new CheckBranch();
			boolean k=cb.verify(ob[i].branch);
			if(k)
			{
				System.out.println("Enter the rollNO:");
				ob[i].rollNo=s.nextLine();
				if(ob[i].rollNo.length()==10) {
					
					GenerateBranchByCode gc=new GenerateBranchByCode();
					String gBr = gc.generate(ob[i].rollNo.substring(6,8));
					if(gBr==null) {
						System.out.println("rollNo holding invali branch code:");
						i--;
					}else{
						  if(gBr.equals(ob[i].branch)) {
							  System.out.println("=====Enter 6 Subject marks=====");
							  int j=1,totM=0;
							  boolean p=false;
							  while(j<=6)
							  {
								  System.out.println("Enter the marks of sub-"+j);
								  int sub= Integer.parseInt(s.nextLine());
								  if(sub<0 || sub>100)
								  {
									  System.out.println("Invalid Marks..");
									  continue;
								  }
								  if(sub>=0 && sub<=34)
								  {
									  p=true;
								  }
								  j++;
								  
								  totM=totM+sub;
							  }//end of loop
							  
							  ob[i].totMarks=totM;
							  ob[i].per=(float)ob[i].totMarks/6;
							  
							  Percentage sr = new Percentage();
							  ob[i].result=sr.result(ob[i].per,p);
						  }else {
							  System.out.println("RollNumber not matched with the branch..");
							  i--;
						  
						  }
					}
				}// end of if
				
				else {
					System.out.println("Invalid rollNo..");
					i--;
				}
			}//end of if
			 
			else {
				System.out.println("Invalid Branch..");
				i--;
			}
			
		}//end of loop
		
		System.out.println("====Student Details====");
		for(StudentDetails c: ob)
		{
			System.out.println(c.toString());
		}//end of loop
		s.close();
		System.out.println("Ënter the rollNo to display 6 subject marks:");
	}

}
