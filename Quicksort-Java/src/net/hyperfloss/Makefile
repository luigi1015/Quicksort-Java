all: Quicksort Test

Quicksort: Quicksort.java
	javac Quicksort.java

Test: Quicksort.java QuicksortTest.java
	javac -cp /usr/share/java/junit.jar:. QuicksortTest.java
	java -cp .:/usr/share/java/junit4-4.10.jar org.junit.runner.JUnitCore QuicksortTest

clean:
	rm *.class
