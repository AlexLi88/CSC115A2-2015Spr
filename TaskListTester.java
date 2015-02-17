//Student Name:
//Student Number:


public class TaskListTester {
	public static void main(String [] args){
		testOne();
		testTwo();
		testThree();
		testFour();
		testFive();
		testSix();
		testSeven();
		testEight();
		testNine();
		testTen();
		testEleven();
	}


	public static void testOne(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased(); 
		int expected[] = {212, 198, 104};
		tl.insert(new Task(10,212));
		tl.insert(new Task(12,100));
		tl.insert(new Task(10,198));
		tl.insert(new Task(3,104));

		Task head = tl.removeHead();
		if(head.number != 100){
			passed = false;
		}

		for(int i = 0 ; i < expected.length; i++){
			Task t = tl.retrieve(i);
			if(t != null && t.number != expected[i]){
				passed = false;
				break;
			}else if( t ==null){
				passed = false;
				break;
			}
		}
		
		if(passed){
			System.out.println("First assignment example: PASSED");
		}else{
			System.out.println("First assignemt example: FAIL");
		}
	}
	public static void testTwo(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();
		if(tl.isEmpty()){
			passed = true;
		}else{
			passed = false;
		}
		if(passed){
			System.out.println("Second assignment example: PASSED");
		}else{
			System.out.println("Second assignemt example: FAIL");
		}
	}

	public static void testThree(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();
		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 15));
		tl.insert(new Task(10, 20));

		Task head = tl.removeHead();
		if(head.number == 10){
			passed = true;
		}else{
			passed = false;
		}


		if(passed){
			System.out.println("Third assignment example: PASSED");
		}else{
			System.out.println("Third assignemt example: FAIL");
		}
	}

	public static void testFour(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();
		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 15));
		tl.insert(new Task(10, 20));

		if(tl.getLength() == 4){
			passed = true;
		}else{
			passed = false;
		}



		if(passed){
			System.out.println("Forth assignment example: PASSED");
		}else{
			System.out.println("Forth assignemt example: FAIL");
		}
	}


	public static void testFive(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();

		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 15));
		tl.insert(new Task(10, 20));
		Task head = tl.removeHead();

		if(head.number == 10){
			passed = true;
		}else{
			passed = false;
			System.out.println("Fifth assignemt example: FAIL");
			return;
		}

		Task deleted = tl.remove(new Task(12, 16));


		if(deleted.number == 16){
			passed = true;
		}else{
			passed = false;
			System.out.println("Fifth assignemt example: FAIL");
			return;
		}



		if(passed){
			System.out.println("Fifth assignment example: PASSED");
		}else{
			System.out.println("Fifth assignemt example: FAIL");
		}
	}

	public static void testSix(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();

		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 15));
		tl.insert(new Task(10, 20));

		tl.insert(new Task(1, 2));
		tl.insert(new Task(3, 5));

		Task deleted = tl.remove(new Task(1, 2));

		if(deleted.number == 2){
			passed = true;
		}else{
			passed = false;
			System.out.println("Sixth assignemt example: FAIL");
			return;
		}

		deleted = tl.remove(new Task(1, 0));
		if(deleted == null){
			passed = true;
		}else{
			passed = false;
			System.out.println("Sixth assignemt example: FAIL");
			return;
		}


		if(passed){
			System.out.println("Sixth assignment example: PASSED");
		}else{
			System.out.println("Sixth assignemt example: FAIL");
		}

	}

	public static void testSeven(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();

		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 15));
		tl.insert(new Task(10, 20));

		tl.insert(new Task(1, 2));
		tl.insert(new Task(3, 5));

		Task head = tl.retrieve(0);
		if(head.number == 10){
			passed = true;
		}else{
			passed = false;
			System.out.println("Seventh assignemt example: FAIL");
			return;
		}

		head = tl.removeHead();
		
		head = tl.retrieve(0);
		if(head.number == 16){
			passed = true;
		}else{
			passed = false;
		}


		if(passed){
			System.out.println("Seventh assignment example: PASSED");
		}else{
			System.out.println("Seventh assignemt example: FAIL");
		}
	}

	public static void testEight(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();
		int [] expected = {25, 22, 10, 16, 15, 20, 5, 1, 2, 0};
		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 15));
		tl.insert(new Task(10, 20));

		tl.insert(new Task(1, 2));
		tl.insert(new Task(3, 5));
		tl.insert(new Task(3, 1));
		tl.insert(new Task(100, 25));
		tl.insert(new Task(1, 0));
		tl.insert(new Task(16, 22));

		//System.out.println(tl.toString());

		for(int i = 0 ; i < expected.length; i++){
			Task t = tl.retrieve(i);
			if(t != null && t.number != expected[i]){
				passed = false;
				break;
			}else if( t ==null){
				passed = false;
				break;
			}
		}


		if(passed){
			System.out.println("Eighth assignment example: PASSED");
		}else{
			System.out.println("Eighth assignemt example: FAIL");
		}
	}

	public static void testNine(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();

		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 15));
		tl.insert(new Task(10, 20));

		tl.insert(new Task(1, 2));
		tl.insert(new Task(3, 5));
		tl.insert(new Task(3, 1));
		tl.insert(new Task(100, 25));
		tl.insert(new Task(1, 0));
		tl.insert(new Task(16, 22));

		Task head = tl.removeHead();
		if(head.number == 25){
			passed = true;
		}else{
			passed = false;
			System.out.println("Ninth assignemt example: FAIL");
			return;
		}

		head = tl.removeHead();
		if(head.number == 22){
			passed = true;
		}else{
			passed = false;
			System.out.println("Ninth assignemt example: FAIL");
			return;
		}

		head = tl.removeHead();
		if(head.number == 10){
			passed = true;
		}else{
			passed = false;
			System.out.println("Ninth assignemt example: FAIL");
			return;
		}


		if(passed){
			System.out.println("Ninth assignment example: PASSED");
		}else{
			System.out.println("Ninth assignemt example: FAIL");
		}
	}

	public static void testTen(){
		boolean passed = true;
		TaskListRefBased tl = new TaskListRefBased();

		tl.insert(new Task(12, 16));
		tl.insert(new Task(15, 10));
		tl.insert(new Task(12, 14));
		tl.insert(new Task(10, 20));

		tl.insert(new Task(1, 2));
		tl.insert(new Task(3, 5));
		tl.insert(new Task(3, 1));
		tl.insert(new Task(100, 25));
		tl.insert(new Task(1, 0));
		tl.insert(new Task(16, 22));

		Task deleted = tl.remove(new Task(12, 16));
		if(deleted.number == 16){
			passed = true;
		}else{
			passed = false;
			System.out.println("Tenth assignemt example: FAIL");
			return;
		}
		deleted = tl.remove(new Task(10, 20));
		if(deleted.number == 20){
			passed = true;
		}else{
			passed = false;
			System.out.println("Tenth assignemt example: FAIL");
			return;
		}

		deleted = tl.remove(new Task(15, 10));
		if(deleted.number == 10){
			passed = true;
		}else{
			passed = false;
			System.out.println("Tenth assignemt example: FAIL");
			return;
		}

		deleted = tl.remove(new Task(16, 22));
		if(deleted.number == 22){
			passed = true;
		}else{
			passed = false;
			System.out.println("Tenth assignemt example: FAIL");
			return;
		}

		deleted = tl.remove(new Task(3, 1));
		if(deleted.number == 1){
			passed = true;
		}else{
			passed = false;
			System.out.println("Tenth assignemt example: FAIL");
			return;
		}

		
		if(passed){
			System.out.println("Tenth assignment example: PASSED");
		}else{
			System.out.println("Tenth assignemt example: FAIL");
		}
	}
	
	public static void testEleven(){
		System.out.println("This test is for the extra part");
		boolean passed = true;
		TaskListRefBasedExtra tl = new TaskListRefBasedExtra();
		tl.insertExtra(new Task(12, 17));
		tl.insertExtra(new Task(15, 10));
		tl.insertExtra(new Task(12, 15));
		tl.insertExtra(new Task(10, 20));
		tl.insertExtra(new Task(12, 14));
		tl.insertExtra(new Task(12, 16));


		tl.insertExtra(new Task(1, 2));
		tl.insertExtra(new Task(3, 5));
		tl.insertExtra(new Task(3, 1));
		tl.insertExtra(new Task(100, 25));
		tl.insertExtra(new Task(1, 0));
		tl.insertExtra(new Task(16, 22));

		System.out.println(tl.toString());

	}
}
