
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] ages = {3, 9, 23, 64,2, 8, 28, 93};
       System.out.println(ages[ages.length - 1] - ages[ages.length - 8]);//Problem 1A Sorry there is no explanation on the print line it errors every time I add one
       //System.out.println( ages.length - 1);
       for (int age : ages) {
    	   //System.out.println(age);
}
       int [] newAges = {3, 9, 23, 64,2, 8, 28, 93, 44};
       System.out.println( newAges[newAges.length - 1] - newAges[newAges.length - 9]);//Problem 1B
       	int sum = 0;
        for (int i = 0; i < newAges.length; i++) {
        	sum += newAges[i];
}
        System.out.println("This is for problem 1C: " + sum / newAges.length);//Problem 1C
       
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
       sum = 0;
       for (String name : names) {
    	   sum += name.length();
    	   }
       
       
	   
	        
       System.out.println("This is for problem 2A: " + sum / names.length);//Problem 2A
	   String nameTogether = " ";//Problem 2B
	   for (String name : names) {
		   nameTogether += name + " ";
		   
	   }
	   System.out.println("This is for problem 2B: " + nameTogether);
	   
	   //Problem 3 you access it by using the array name with [] and the number of the last position
	   System.out.println("This is for problem 3: " + names [5]);
	   //Problem 4 you access it by using the array name with [] and the number of the first position
	   System.out.println("This is for problem 4: " + names [0]);
	   
	   int[] nameLengths = new int[names.length];//Problem 5
	    for(int i = 0; i < names.length; i++) {
	    	nameLengths[i] += names[i].length();
	    	
	    }
	        for (int length : nameLengths) {
	        	System.out.println("This is for problem 5: " + length);
	        }
	        sum = 0;
	        for (int nameLength : nameLengths) {//problem 6
	        	sum += nameLength;
	        }
	        System.out.println("This is for problem 6: " + sum);
	        
	    
	   
	   System.out.println("This is for problem 7: " + createStringInt("Hello", 4));//Problem 7
	   
	   String firstName = "Sarah";//problem 8
	   String lastName =  "Smith";
	   String fullName = creatingFullName(firstName, lastName);
	   System.out.println("This is for problem 8: " + fullName);
	   
	   sum = 0;
	   int[] arrayOfNumbers = {8, 10, 11, 15, 18, 20, 25};//problem 9
	    for(int i = 0; i < arrayOfNumbers.length; i++) {
	    	sum += arrayOfNumbers[i];
	    }System.out.println("This is for problem 9: " + sumOfNumbers(sum, 100));
	  
	   double[] doubleNumbers = {10.0, 15.8, 20.6, 1.04, 4.2, 8.9, 12.5, 14.8};//problem 10
	   System.out.println("This is for problem 10: " + calculateDoubleAverage(doubleNumbers));
	   }
	
	public static String createStringInt (String word, int number) {//Problem 7
		String print = "";
		for (int i = 0; i < number; i++) {
			print += word;}
        return print;}
	
	public static String creatingFullName(String firstName, String lastName) {//Problem 8
		return firstName + " " + lastName;
	}
	
	public static boolean sumOfNumbers(int additionOfNumbers, int greaterThan100) {// Problem 9
		return additionOfNumbers > greaterThan100;}
	
	public static double calculateDoubleAverage (double[] numbers){//Problem 10
	  double sum = 0;
	  for (double number : numbers) {
		  sum += number;
		  }
	  return sum / numbers.length;
	}
	  


}

