# k-best-tester
Program to return k-best elements in a group

The KBestCounter class creates a priority queue of size k in order to keep track of the k-best elements in a given set of elements. When a new element is added to the set, it is added to the priority queue if there are not already k elements in it, or, if there are k elements in the priority queue, the count method checks if the element to add is greater than the current minimum element and adds it if so. In order to return the k-best elements, a LinkedList is created by adding each minimum element of the priority queue to the front of the list, so that the last element added is the last minimum (i.e. the maximum). This sorts the elements in the priority queue in descending order. The elements are then added back into the priority queue by adding the elements of the LinkedList sortedElements in reverse order (so that the each element added will be the new minimum). If the priority queue is empty, an error message is printed and no elements are returned. To run this file, do the following: 1) cd into the directory in Terminal 2) type “javac KBestCounter.java” to compile the program

The TestKBest class tests the KBestCounter class by adding values to the counter and printing the k-best elements at different points. To run this file, do the following: 1) cd into the directoru in Terminal 2) type “javac TestKBest.java to compile the program 3) type “javac KBestCounter.java” to compile the KBestCounter program 4) type “java TestKBest” to run the program
