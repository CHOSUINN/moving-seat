import java.util.Arrays;

public class String01_생성 {
	public static void main(String[] args) {
		
		
		// 스트링 풀에 생성된 문자열은 값이 같을 경우 같은 값을 참조하게 됨.
		String str1 = "Hello";
		String str2 = "Hello";
		
		
		System.out.println(str1 == str2);
		
		String str3 = new String("Hello");
		System.out.println(str1 == str3);
		
		// 문자열은 불변성을 가지고 있다.
		// 문자열에서 문자를 하나씩 뜯어오고 싶다.
	
		char[] arr1 = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++ ) {
			System.out.println(str1.charAt(i));
			arr1[i] = str1.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr1));
		
		char[] arr2 = str1.toCharArray();
		for (char c : str2.toCharArray()) {
			System.out.println(Arrays.toString(arr2));
		}
		
		// Java에서 문자한개를 입력 받는 방법은 "없다".
		// sc.next().charAt(0) 이런식으로 한개씩 받을 수 있다.
		
		System.out.println(str1.contains("ll"));
	}
}
