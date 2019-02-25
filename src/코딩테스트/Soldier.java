package 코딩테스트;

import 코딩테스트.ex01.Solution;

public class Soldier {
	public static void main (String[] args) {
		Solution s = new Solution();
		int rank[]=new int[]{3, 4, 3, 0, 2, 2, 3, 0, 0};
		int result=s.solution(rank);
		System.out.println(result);
	}
	static class Solution {
	    public int solution(int[] ranks) {
	        // write your code in Java SE 8
	    	
	    	int cnt=0;
	    	for(int i=0;i<ranks.length;i++) {
	    		for(int j=0;j<ranks.length;j++) {
	    			if(i==j) {
	    				continue;
	    			}else if((ranks[i]+1)==ranks[j]){
	    				System.out.println(ranks[i]+":"+ranks[j]+"이므로 보고");
	    			++cnt;
	    			break;
	    			}	    			
	    		}
	    	}	    	
	    	return cnt;
	    }
	}
}
