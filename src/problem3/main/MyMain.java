/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.Student.Student;
import problem3.myqueue.MyPriorityQueue;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Student you want insert");
        int value = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < value; i++) {
            System.out.println("Enter the Student name");
            String name = sc.nextLine();
            System.out.println("Enter the Roll Number for the student");
            int rollno = sc.nextInt();
            Student student = new Student(name, rollno);
            queue.enqueue(student);
            sc.nextLine();
        }
        queue.show();

    }
}

