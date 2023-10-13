/**
 * Author: Amos Thando Mpofu
 */
package com.time;

/**
 * 
 */
public class Time {
	
	public static void main(String[] args) {
		int hour = 14, minute = 35, second = 0;
		int seconds = (hour * 60 * 60) + (minute * 60) + second;
		System.out.println("Number of seconds remaining in the day: " + seconds);
		int totalSeconds = 24 * 60 * 60; // total seconds in a day
		double percent = ((double) seconds / totalSeconds) * 100;
		System.out.println("The percentage of the day that has passed: " + percent + "%");
	}
}
