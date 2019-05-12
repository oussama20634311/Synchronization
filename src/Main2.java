//    synchronized  		
class myTable{  
			  
	synchronized void printTable(int n){ 
			   for(int i=1;i<=5;i++){  
			     System.out.println(n*i);  
			     try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			   }  
			  
			 }  
			}  
			  
			class Thread1 extends Thread{  
			myTable t;  
			 Thread1(myTable t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(5);  //faire lock
			}  
			  
			}  
			class  Thread2 extends Thread{  
			myTable t;  
			 Thread2(myTable t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(100);  
			}  
			}  
			  
			class Main2{  
			public static void main(String args[]){  
			myTable obj = new myTable(); 
			Thread1 t1=new Thread1(obj);  
			Thread2 t2=new Thread2(obj);  
			t1.start();  
			t2.start();  
			} 
			
	}


