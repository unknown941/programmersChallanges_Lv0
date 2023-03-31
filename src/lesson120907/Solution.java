package lesson120907;

// OX퀴즈
// https://school.programmers.co.kr/learn/courses/30/lessons/120907
/* 
 * 문제 설명
 * 
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution {
	
	public static String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		
		for(int i = 0; i < quiz.length; i++) {
			// 공백 기준으로 split
			String[] quizSplit = quiz[i].split(" ");
			
			// 더하기인 경우
			if(quizSplit[1].equals("+")) {
				if(Integer.parseInt(quizSplit[0]) + Integer.parseInt(quizSplit[2]) == Integer.parseInt(quizSplit[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			// 빼기인 경우
			} else if(quizSplit[1].equals("-")) {
				if(Integer.parseInt(quizSplit[0]) - Integer.parseInt(quizSplit[2]) == Integer.parseInt(quizSplit[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			}
		}
		
		return answer;
	}
	
}
