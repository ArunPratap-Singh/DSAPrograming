package arrayPrograms;

public class ReverseString {

	public static void main(String[] args) {
		char [] s = {'h','e','l','l','o'};
		
		reverse(s);
		for(char c : s) {
			System.out.println("Array After Reverse is: " +c+" ");
		}
		

	}
	
	public static void reverse(char[] s) {
		
		int start = 0;
		int end = s.length-1;
		
		while(start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start ++;
			end --;
		}
	}

}
