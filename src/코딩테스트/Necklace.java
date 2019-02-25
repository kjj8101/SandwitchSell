package 코딩테스트;

import 코딩테스트.Soldier.Solution;

public class Necklace {
	public static void main (String[] args) {
		Solution s = new Solution();
		int Arrays[] = new int[] {1, 3, 2, 4, 5, 6, 7 ,0};
		int Arrays2[] = new int[] {5, 4, 0, 3, 1, 6, 2};
		int result=s.solution(Arrays);
		System.out.println(result);
		
	}
	 static class Solution {
		 public int solution(int[] A) {
	    	int cnt = 0;
	    	int maxcnt=-1;
	    	int index=-1;
	    	int startnum=-1;	    
	    	for(int i=0;i<A.length;i++) {
	    		if(startnum==-1) {	    			
	    			startnum=i;	    			    			
	    			index=A[i];	 
	    			++cnt;	
	    			System.out.println(i+"->Index["+index+"]이동");
	    			//System.out.println("startnum="+startnum);	    			
	    		}
	    		while(true) {
	    			if(A[index]!=startnum) {
	    				System.out.println("index["+index+"]->"+A[index]+"이동");
	    				index=A[index];
	    				cnt++;	    				
	    			}else{
	    				++cnt;
	    				if(maxcnt<cnt) {
	    					System.out.println("index["+index+"]->"+A[index]+"이동");
	    					maxcnt=cnt;
	    					cnt=0;
	    					index=-1;
	    					startnum=-1;	    					
	    				}else{
	    					cnt=0;
	    					index=-1;
	    					startnum=-1;	    					
	    				};	
	    				break;
	    			}
	    			
	    		}
	    	}

	    	return maxcnt;
	    }
	}
	}

