package com.mits.corejava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mitsind759
 *regex.Matcher demo
 */
public class PatterMatch {// class declaration

	public static void main(String[] args) {// main declaration
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile(".k");// . represents single character
		Matcher m = p.matcher("ak"); // true (2nd char is k)
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".l").matcher("all").matches();

		// 3rd way
		boolean b3 = Pattern.matches("...s", "akks"); // true (3rd char is s)
		System.out.println("2nd char is k:" + b + " has more than 2 char:" + b2 + " 3rd char is s:" + b3);

		System.out.println(Pattern.matches("2nd char is not s" + ".s", "mk"));// false (2nd char is not s)
		System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
															

		System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
																
		System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m	 or n)
														
		System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a
																// comes more
																// than once)
		System.out.println(Pattern.matches("[^abc]", "abcd"));// false (Any character except a, b or c (negation))
																
																
																
																
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));// true (a-zA-Z)
		System.out.println(Pattern.matches("[a-d[m-p]]", "am"));// false (a through d, or m through p: [a-dm-p] (union))
																
																
																
															
		System.out.println("? quantifier ....");
		System.out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n
															// comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes
																// more than one
																// time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m
																	// and n
																	// comes
																	// more than
																	// one time)
		System.out.println(Pattern.matches("[amn]?", "aazzta"));// false (a
																// comes more
																// than one
																// time)
		System.out.println(Pattern.matches("[amn]?", "am"));// false (a or m or
															// n must come one
															// time)

		System.out.println("+ quantifier ....");
		System.out.println(Pattern.matches("[amn]+", "a"));// true (a or m or n
															// once or more
															// times)
		System.out.println(Pattern.matches("[amn]+", "aaa"));// true (a comes
																// more than one
																// time)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));// true (a or m
																	// or n
																	// comes
																	// more than
																	// once)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and
																// t are not
																// matching
																// pattern)

		System.out.println("* quantifier ....");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));// true (a or m
																// or n may come
																// zero or more
																// times)

		System.out.println("metacharacters d....");// d means digit

		System.out.println(Pattern.matches("\\d", "abc"));// false (non-digit)
		System.out.println(Pattern.matches("\\d", "1"));// true (digit and comes
														// once)
		System.out.println(Pattern.matches("\\d", "4443"));// false (digit but
															// comes more than
															// once)
		System.out.println(Pattern.matches("\\d", "323abc"));// false (digit and
																// char)

		System.out.println("metacharacters D....");// D means non-digit

		System.out.println(Pattern.matches("\\D", "abc"));// false (non-digit
															// but comes more
															// than once)
		System.out.println(Pattern.matches("\\D", "1"));// false (digit)
		System.out.println(Pattern.matches("\\D", "4443"));// false (digit)
		System.out.println(Pattern.matches("\\D", "323abc"));// false (digit and
																// char)
		System.out.println(Pattern.matches("\\D", "m"));// true (non-digit and
														// comes once)

		System.out.println("metacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", ""));// true (non-digit and
														// may come 0 or more
														// times)

	}// closing main
}// closing class


