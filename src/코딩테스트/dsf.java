package 코딩테스트;

class dsf {	
	  public static void main (String[] args) {
		  dsf s=new dsf();
		  int a[]= {1,2,3,4,5};
		  System.out.println(s.solution(a));
	  }
	  public double solution(int[] arr) {
	      double answer = 0;
	      for(int i=0;i<arr.length;i++) {
	    	  answer+=arr[i];
	      }
	      return answer/arr.length;
	  }
	}