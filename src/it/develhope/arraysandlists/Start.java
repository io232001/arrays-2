package it.develhope.arraysandlists;
import java.util.Arrays;
public class Start {
    public static void main(String[] args) {
        String[] aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        String[] bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos = new String[]{"Reading", "Learning", "Coding"};
        System.out.println("Is Alice's array equal to Bob's array? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice's array equal to Tim's array? " + Arrays.equals(aliceToDos, timToDos));
        System.out.println("Is Alice's array having the same length of Bob's array? " + (aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == timToDos.length));
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos, Arrays.copyOfRange(bobToDos, 0, aliceToDos.length)));
        System.out.println("Is Alice having the same tasks of Tim? " + Arrays.equals(aliceToDos, timToDos));
    }
}

