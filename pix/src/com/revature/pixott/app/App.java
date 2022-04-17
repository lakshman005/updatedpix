package com.revature.pixott.app;

import java.util.Scanner;

import com.revature.pixott.handler.MainMenuHandler;

public class App {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MainMenuHandler.dis();
		scanner.close();
	}
}
  
