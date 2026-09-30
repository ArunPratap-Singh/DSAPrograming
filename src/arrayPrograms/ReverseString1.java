package arrayPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
	
		char [] s = {'H','a','n','n','a','h'};
		
		reverse(s, 2, 4);
		for(char c : s) {
			System.out.println("Array After Reverse is: " +c+ " ");
		}

	}
	
	public static void reverse(char [] s, int start, int end) {
		
		while(start < end) {
			
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start++;
			end--;
		}
	}

}
