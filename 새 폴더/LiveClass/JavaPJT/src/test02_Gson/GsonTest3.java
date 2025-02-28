package test02_Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonTest3 {

	// Gson 추가하는 방법 2가지
	// 1. 직접추가(jav)
	// 2. maven 추가
	
	public static void main(String[] args) {

		Gson gson = new Gson();  // 인스턴스 생성
		
		Student st1 = new Student("Yang", 45, "computer");
		Student st2 = new Student("kim", 15, "math");
		Student st3 = new Student("park", 55, "art");
		
		// 객체 배열
		Student[] sArr = new Student[3];
		sArr[0] = st1;
		sArr[1] = st2;
		sArr[2] = st3;
		
		System.out.println(Arrays.toString(sArr));
		
		
		// 객체배열 -> JSON으로
		String arrStr = gson.toJson(sArr);
		System.out.println(arrStr);
		// JSON -> 객체배열
		Student[] sArr2 = gson.fromJson(arrStr, Student[].class);
		System.out.println(Arrays.toString(sArr2));
		
		// 객체 리스트
		List<Student> sList =  new ArrayList<>();
		sList.add(st1);
		sList.add(st2);
		sList.add(st3);
		
		System.out.println(sList);
		//객체리스트 -> JSON
		String ListStr = gson.toJson(sList);
		System.out.println(ListStr);
		//Json -> 객체리스트
		Type studentListType = new TypeToken<ArrayList<Student>>(){}.getType();
		ArrayList<Student> sList2 = gson.fromJson(ListStr, studentListType);
		System.out.println(sList2);
		
		
		
	}
}
