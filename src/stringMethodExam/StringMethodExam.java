package stringMethodExam;

import java.util.StringJoiner;

public class StringMethodExam {

	public static void main(String[] args) {

		String animal = "dog,tiger,cat";
		// 문자열배열(구분자로 구분) -> 문자열
		String[] animalArr = animal.split(",");
		for (String st : animalArr) {
			System.out.print(st); //dogtigercat
		}
		// 문자열(구분자를 넣음) -> 문자열배열
		String str = String.join("/", animalArr);
		System.out.println(str); // dog/tiger/cat
		
		// StringJoiner클래스를 이용한 문자열 결합
		StringJoiner sj = new StringJoiner(",", "(",")");
		String[] strArr = {"AAA", "BBB" ,"CCC"};
		
		for (String st : strArr) {
			sj.add(st.toLowerCase());
		}
		System.out.println(sj.toString()); //(aaa,bbb,ccc)
		
		
		//StringBuffer
		// StringBuffer는 내부 클래스에 char배열을 만들고 문자열과 비교해서 추가적으로 내용이 변경가능하다.
		
		// 인스턴스 생성시 버퍼의 크기를 정할 수 있다.
		StringBuffer sb = new StringBuffer(50);
		// append는 문자열을 추가할 수 있고 기본형과 참조형 모두 가능하다.
		sb.append("ABC").append('d').append(123).append(true);
		//object toString을 오버라이딩을 했기 때문에 가지고 있는 문자열을 출력할 수 있다.
		System.out.println(sb.toString()); //ABCd123true
		
		// 내용이 같은 StringBuffer
		StringBuffer sb2 = new StringBuffer(50);
		sb2.append("ABC").append('d').append(123).append(true);
		
		// equals는 오버라이딩을 하지 않았기 때문에 참조주소를 비교해서 문자열의 내용을 비교할 수 없다.(==도 마찬가지)
		
		// 출력된 문자열을 비교
		if(sb.toString().equals(sb2.toString())) {
			System.out.println("둘은 같은 문자열입니다."); // 실행
		}
		else {
			System.out.println("둘은 다른 문자열입니다.");
		}
	}
}