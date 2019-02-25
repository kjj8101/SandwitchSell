package 코딩테스트;
import java.util.ArrayList;
import java.util.Arrays;
import 코딩테스트.Necklace.Solution;

public class Board {
	public static void main (String[] args) {
		String[]B =new String[] {"..X...","......","....X.",".X....","..X.X.","...O.."};
		Solution s = new Solution();
		System.out.println("최대값:"+s.solution(B));
	}
	static class Solution {		
		public int pointX=-1;
		public int pointY=-1;
		public int updateX=-1;
		public int updateY=-1;
		public String[] upLine;
		//Pawn 포지션 잡기
		public void PawnPosition(String[]A) {
			for(int i=0;i<A.length;i++) {
				String str[]=A[i].split("");
				System.out.println(Arrays.toString(str));
				for(int j=0;j<str.length;j++) {
					if(str[j].equals("O")) {
						pointX=j;
						pointY=i;
						updateX=pointX;
						updateY=pointY;
					}
				}					
			}			
		}	
	    public int solution(String[] B) {
	    	int cnt=0;
	    	int pass=0;
	    	boolean left=false;
	    	boolean right=false;
	    	ArrayList<String> arr= new ArrayList<String>();
	    	PawnPosition(B);
	    	System.out.println(pointX+":"+pointY);
	    	for(int i=0;i<=pointY;i++) {
	    		arr.add(B[i]);	
	    	}

	    	while(true) {
	    		if(pointY-1==0) {
	    			break;
	    		}
	    	upLine=arr.get(pointY-1).split("");
	    	if(pass==1) {	  
	    		if(pointY==-1||pointX-1==-1||pointX>=upLine.length) {
		    		break;
		    	}	    	
	    		
		    	upLine = arr.get(pointY-1).split("");
		    	if(left=true) {
		    	if(upLine[pointX-1].equals(".")){
		    		pointX-=1;
			    	pointY-=1;
			    	pass=0;
			    	++cnt;
			    	right=false;
			    	left=false;
			    	updateX=pointX;
			    	updateY=pointY;
		    	}else {
		    		pass=0;
		    		cnt=0;
			    	pointX=updateX;
			    	pointY=updateY;	
		    	}
		    	}else if(right=true) {		
		    	if(upLine[pointX+1].equals(".")) {
		    		pointX+=1;
			    	pointY-=1;
			    	pass=0;
			    	++cnt;
			    	right=false;
			    	left=false;
			    	updateX=pointX;
			    	updateY=pointY;		
				    	
		    	
		    	}
		    	else {
		    		pass=0;
		    		cnt=0;		    		
			    	pointX=updateX;
			    	pointY=updateY;
		    	}
		    	
		    	}
	    	}
	    		if(upLine[pointX-1].equals("X")&&left==false){
		    		pointX-=1;
		    		pointY-=1;
		    		++pass;
		    		left=true;
		    		
		    	}
		    		else if(upLine[pointX+1].equals("X")&&right==false) {
		    		pointX+=1;
			    	pointY-=1;
			    	++pass;
			    	right=true;
			  
		    	} else if(pointY==-1||pointX-1==-1||pointX>=upLine.length) {
		    
		    		break;
		    	}	    	
	    		
	    	}
	    	return cnt;
	    	}	   	
	    
	    }	
	
}
	

	
