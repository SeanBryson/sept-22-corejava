package com.cognixia.jump.codingproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class ChallengeDriver {

	public static void main(String[] args) {
		Challenges9_21 wednesday = new Challenges9_21();
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Sean");
		studentNames.add("Stanley");
		studentNames.add("Chris");
		studentNames.add("Daivion");
		studentNames.add("Parker");
		
		wednesday.problem1(studentNames);
		
		int x = 7;
		int y = 5;
		int[] nums = {x,y};
		nums = wednesday.problem2(nums);
		System.out.println(Arrays.toString(nums));
		
		String input3 = "Racecar";
		boolean result3 = wednesday.problem3(input3);
		System.out.println(result3 + " - " + input3);
		
		
		
	}

}

