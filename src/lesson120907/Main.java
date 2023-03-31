package lesson120907;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		// 테스트 케이스 1
		String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
		String[] result1 = {};
		
		// 테스트 케이스 2
		String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] result2 = {};
		
		
		result1 = Solution.solution(quiz1);
		result2 = Solution.solution(quiz2);
		
		System.out.println("테스트 케이스 1 결과 : " + Arrays.toString(result1));
		System.out.println("테스트 케이스 2 결과 : " + Arrays.toString(result2));
	}
	
}
