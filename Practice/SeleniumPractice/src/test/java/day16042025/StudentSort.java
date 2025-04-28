package day16042025;

import java.util.*;

class Student implements Comparable<Student> {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int compareTo(Student s) {
		return this.name.compareTo(s.name); // sort by name
	}

	public String toString() {
		return id + " " + name;
	}
}

class SortById implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.id - s2.id; // sort by id
	}
}

public class StudentSort {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(102, "Rama"));
		list.add(new Student(101, "Sai"));
		list.add(new Student(103, "Kiran"));

		Collections.sort(list); // by name
		System.out.println("Sorted by Name: " + list);

		Collections.sort(list, new SortById()); // by id
		System.out.println("Sorted by ID: " + list);
	}
}
