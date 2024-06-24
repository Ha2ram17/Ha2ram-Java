package sungil0914;

import java.util.*;
import java.io.*;
public class Baseball {
public static int playGame() throws IOException {
    int x,y,z;//난수가 들어갈 x,y,z 선언
    Random r = new Random();//객체변수 r

    x = Math.abs(r.nextInt() %9)+1;
    //Math.abs를 이용해 절대값으로 만듬. 난수가 일의자리가 아닐 경우를 
    //대비해 %9로 나머지를 구한 후 +1을 통해 1~9까지의 수만 나오도록 설정
    do {
    	y = Math.abs(r.nextInt() %9)+1;
    }while(y==x);
    //x와 원리는 같으나, y가 x와 같지 않도록 조건을 걸어서 x와 y가
    //서로 다른 수가 되도록 설정. do whlie문을 이용.
    do {
    	 z = Math.abs(r.nextInt() %9)+1;
    }while(z==y&&z==x);
     //**

//    System.out.println(x + ", " + y + ", " + z);
    //결정된 난수 x,y,z로 PlayGame메소드 실행
    return playGame(x,y,z);
}
public static int playGame(int x, int y, int z) throws IOException {
	
    int count; //정수형 변수 count 선언
    int strike, ball; //정수형 변수 strike, ball 선언
    int[] usr = new int[3]; //유저의 입력한 숫자 3개의 저장소가 될 배열 usr 선언
    int[] com = { x, y, z }; //배열 com에 x,y,z를 넣음
    System.out.println("숫자 야구 게임 시작"); //숫자 야구 게임 시작을 알리는 안내문
    
    count = 0; //도전 회차를 카운트하는 변수를 0으로 세팅.
    
    do {//첫번째 do while문
        count++; //도전 회차가 지날 때마다 count가 1씩 증가
        do {//두번째 do while문
            System.out.println("\n카운트: " + count); //카운트를 알려주는 안내문
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //객체변수 버퍼리더 선언 
            String user; //문자열 유저 선언
            
            System.out.print("1번째 숫자: "); //n번째 숫자를 알려주는 안내문
            user = in.readLine(); //사용자가 입력받음 문자열 형태.
            usr[0] = new Integer(user).intValue(); //문자열을 정수형으로 변환 후 배열에 삽입
            System.out.print("2번째 숫자: "); //n번째 숫자를 알려주는 안내문
            user = in.readLine(); //**
            usr[1] = new Integer(user).intValue();//**
            System.out.print("3번째 숫자: "); //n번째 숫자를 알려주는 안내문
            user = in.readLine(); //**
            usr[2] = new Integer(user).intValue();//**

            if ((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0)) { //사용자가 의도하지 않은 입력을 했을때를 대비한 예외처리
                System.out.println("0은 입력하지 마세요. 다시 입력해주세요."); //0을 입력했을 시 출력 안내문
            } else if ((usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)) {//** {
                System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요."); //1부터 9까지의 숫자를 입력하지 않았을 시 안내문
            } else if ((usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2])) {//**
                System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요."); //숫자가 겹치는 경우 출력될 안내문
            }
        } while ((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0) || (usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9) || (usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[0] == usr[2]));
        //예외처리 상황 다 집어넣기
        strike = ball = 0; //strike와 ball 리셋 설정
        
        //값 비교 후 strike와 ball 판별
        if (usr[0] == com[0]) strike++; //완벽히 일치하면 strike
        if (usr[1] == com[1]) strike++; //**
        if (usr[2] == com[2]) strike++; //**
        if (usr[0] == com[1]) ball++; //자릿수가 일치하지 않는다면 ball
        if (usr[0] == com[2]) ball++; //**
        if (usr[1] == com[0]) ball++; //**
        if (usr[1] == com[2]) ball++; //**
        if (usr[2] == com[0]) ball++; //**
        if (usr[2] == com[1]) ball++; //**

        System.out.println("Strike: " + strike + " Ball: " + ball); //위 코드로 합산된 strike와 ball 출력
    } while ((strike < 3) && (count < 11)); //이 조건을 만족하지 않을 시 게임 종료, 스트라이크 3 혹은 카운트 수가 10초과

    return count; //도전 회차의 최종값을 반환
}
    public static void main(String[] args) throws IOException{
    	int cont;
    	int a,b,c;
    	if(args.length==3) {
    		a=Integer.valueOf(args[0]).intValue();
    		b=Integer.valueOf(args[1]).intValue();
    		c=Integer.valueOf(args[2]).intValue();
    		cont=playGame(a,b,c);
    	}
    	else {
    		cont=playGame();
    	}
    	if(cont<3) {
    		System.out.println("참 잘했다.");
    	}
    	else if(cont<6) {
    		System.out.println("보통 ㅎㅎ ");
    	}
    	else if(cont<10) {
    		System.out.println("ㅋ");
    	}
    	else {
    		System.out.println("분발하도록");
    	}
    }
}
