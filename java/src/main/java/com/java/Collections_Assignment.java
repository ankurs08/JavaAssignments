package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_Assignment {
	static List<String> valueCards;
	static List<String> suiteCards;
	static List<String> deckCards = new ArrayList<String>();
	static List<String> spadesCards = new ArrayList<String>();
	static List<String> heartsCards = new ArrayList<String>();
	static List<String> clubsCards = new ArrayList<String>();
	static List<String> diamondsCards = new ArrayList<String>();

	public static void main(String[] args) {
		valueCards = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");
		suiteCards = Arrays.asList("Spades", "Hearts", "Clubs", "Diamonds");

		assignList();
		System.out.println("*********Printing the deck of cards*********");
		printList(deckCards);
		
		shuffleList(deckCards);
		System.out.println("*******Shuffling and printing the deck of cards*********");
		printList(deckCards);

		System.out.println("Assigning suites and Printing");
		assignSpecficSuite("Clubs");
		printList(clubsCards);
		
		
		System.out.println("shuffling suite and Printing");
		shuffleList(clubsCards);
		printList(clubsCards);
		
		
		//Not correct, need to recheck and have custom sort
		System.out.println("sorting suite and Printing");
		sortList(clubsCards);
		printList(clubsCards);
		
		

	}

	// creating a list of cards
	public static void assignList() {
		for (String s : suiteCards) {
			for (String v : valueCards) {
				deckCards.add(s.concat(v));
			}
		}

	}

	// print
	public static void printList(List<String> cardsName) {
		for (String d : cardsName) {
			System.out.println(d);
		}
	}

	// shuffle the list
	public static void shuffleList(List<String> cardsName) {
		Collections.shuffle(cardsName);
	}
	
	public static void sortList(List<String> cardsName) {
		Collections.sort(cardsName);
	}

	// shuffling a specific pack and printing the list

	public static void assignSpecficSuite(String suiteName) {
		if (suiteName.equalsIgnoreCase("Spades")) {
			String s = suiteCards.get(0);
			for (String v : valueCards) {
				spadesCards.add(s + v);
			}
		} else if (suiteName.equalsIgnoreCase("Hearts")) {
			String s = suiteCards.get(1);
			for (String v : valueCards) {
				heartsCards.add(s + v);
			}
		} else if (suiteName.equalsIgnoreCase("Clubs")) {
			String s = suiteCards.get(2);
			for (String v : valueCards) {
				clubsCards.add(s + v);
			}
		} else if (suiteName.equalsIgnoreCase("Diamonds")) {
			String s = suiteCards.get(3);
			for (String v : valueCards) {
				diamondsCards.add(s + v);
			}
		} else {
			System.out.println("Wrong choice!!");
		}
	}

}
