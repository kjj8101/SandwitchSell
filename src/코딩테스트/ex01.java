package 코딩테스트;

import java.util.ArrayList;
import java.util.Collections;

public class ex01 {
public static void main (String[] args) {
		Solution s = new Solution();
		int result=s.solution(2);
		System.out.println(result);
	}
	static class Solution {
	    public int solution(int N) {
	        // write your code in Java SE 8
	    	int n=N;
	    	//System.out.println(N);
	    	ArrayList<Integer> binary= new ArrayList<Integer>();//나눈값을 저장할 변수
	    	ArrayList<Integer> Gaplist= new ArrayList<Integer>();//나눈값을 저장할 변수
	    	while(n!=1) { //0까지 게속 나눔
	    		binary.add(n%2);	    		
	    		n=n/2;
	    	}
	    	if(n==1) {
	    	binary.add(n);
	    	}
	    	Collections.reverse(binary);
	    	System.out.print(binary);
	    	boolean State=false;
	    	int c=0;
	    	for(int i=0;i<binary.size();i++) {
	    		if(State==false&&binary.get(i)==1) { //GAP크기측정을 시작하지않은상태에서 1을만남
	    			State=true;
	    	}else if(State==true&&binary.get(i)==1) { //GAP크기측정을 시작한상태에서 1을만남	    		
	    		State=false;
	    		Gaplist.add(c);
	    		c=0;

	    	}else {
	    		++c;
	    	}
	    	}	    	
	    	return Collections.max(Gaplist);
	    }
	}	
}