//not synchronized  		
class Table {
	
	void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try { // pour executer reste 4 seconde
				Thread.sleep(4000); // A thread is a thread of execution in a program.
				// The Java Virtual Machine allows an application to have multiple threads
				// of execution running concurrently.
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

// implement Runnable
// MyThread1 t1=new MyThread1(obj);
// Thread t2 = new Thread(t1);
// t2.start();
class MyThread1 extends Thread { // Thread= classe content des methodes exmple
	// run() ou start() pour executer le methode
	Table t;
	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;
	MyThread2(Table t) { // Thread constrecteur
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class Main {
	public static void main(String args[]) {
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start(); // Thread object
		t2.start();
	}
}