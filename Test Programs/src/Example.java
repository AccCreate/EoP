
/*
 * Decompiled with CFR 0_122.
 */
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		System.out.println("Please enter 10 values");
		int i = 0;
		while (i < 10) {
			list.add(scnr.nextInt());
			++i;
		}
		Example.removeDuplicate(list);
		i = 0;
		while (i < list.size()) {
			System.out.print(list.get(i) + " ");
			++i;
		}
		scnr.close();
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		HashSet<Integer> Arraylistwithoutduplicates = new HashSet<Integer>();
		Arraylistwithoutduplicates.addAll(list);
		list.clear();
		list.addAll(Arraylistwithoutduplicates);
	}
}
