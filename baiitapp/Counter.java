package baiitapp;

public class Counter {

private int count = 0;

public synchronized void increment() throws InterruptedException {
count++;

System.out.print(" " + count + " ");


}
public int getCount() {
return count;
}
}