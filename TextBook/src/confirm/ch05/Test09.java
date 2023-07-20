package confirm.ch05;

import java.util.Scanner;

/**
 * 날짜 : 2023/07/19
 * 이름 : 이현정
 * 내용 : Java 교재 p199
 */
public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("---------------------------------------------");
		System.out.println("1.학생수| 2.점수입력| 3.점수리스트 | 4.분석 | 5. 종료");
		System.out.println("----------------------------------------------");
		
		int stuCount = 0;
		int[] scores = null;
		
		while(true) {
			System.out.println("선택 >");
			int answer = sc.nextInt();
			
				if(answer == 1) {
					
					sc.nextLine();
					System.out.println("학생수 >");
					stuCount = sc.nextInt();
					scores = new int[stuCount];
				
				}else if(answer == 2) {
					
					sc.nextLine();
					for(int i =0; i < stuCount; i++) {
						System.out.println("점수입력 >");
						scores[i] = Integer.parseInt(sc.next());
					}
					
					
				}else if(answer == 3) {
					System.out.println("점수리스트 >");
					for(int score : scores) {
						System.out.println(score);
					}
				}else if(answer == 4) {
					int maxScore = findMaxScores(scores);
					double avgScore = calculateAverageScore(scores);
					System.out.println("최고 점수 > "+ maxScore);
					System.out.println("평균 점수 > "+ avgScore);
					sc.nextLine();
					
				}else if(answer == 5) {
					System.out.println("프로그램을 종료합니다.");
				
					break;
				
				}else {
					System.out.println("잘못된 선택입니다. 다시 선택하십시오");
				}
				
		}sc.close();
				
	}

	private static int findMaxScores(int[] scores) {
		
		int maxScore = Integer.MIN_VALUE;
		for(int score : scores) {
			if(score > maxScore) {
				maxScore = score;
			}
		}
		
		return maxScore;
	}

	private static double calculateAverageScore(int[] scores) {
		int sum =0;
		for(int score : scores) {
			sum += score;
		}
		
		return (double)sum/scores.length;
	}


}
