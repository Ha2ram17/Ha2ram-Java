package haeram;

import java.util.Arrays;

public class gg {
	public static void main(String[] args) {
		int[] arr = new int[] {57,41,6,52,65,89};
		for(int i = 1; i < arr.length; i++) {//i를 0번째가 아닌 1번째로 시작함. -> 삽입 정렬의 방식
//			i<arr.length인 이유는, index의 0번째는 포커스로 두지않고 1번째부터 시작하기 때문.
			for(int j = i; j>0; j--) {
				if(arr[j-1]>arr[j]) { //비교했을 때, 예시로 arr의 1번째 index가 0번째 index보다 크다면 순서를 바꾸는 조건문
					int temp = arr[j-1];//temp라는 임시변수를 생성해 배열의 순서를 바꿈.
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
//예시로 8,3,4,9,7을 정렬하려고 했을 때, 
//8,3,4,9,7 : 1 Pass
//3,8,4,9,7 : 2 Pass
//3,4,8,9,7 : 3 Pass
//3,4,7,8,9 : 4 Pass 순으로 완료되게 됨.
	}

}
