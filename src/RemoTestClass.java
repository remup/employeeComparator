import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoTestClass {
	public static void main(String args[]) {
		System.out.println("welcome to main");
		String name = "CDAAABC";
		String reverseName = "";
		char tempChar;
		
		
		HashMap<String, Integer> nameMap = new HashMap<>();
		
		for (int i = name.length() - 1; i >= 0; i--) {
			reverseName = reverseName + name.charAt(i);
		}

		System.out.println("reversed name " + reverseName);

		char[] nameCharArray = name.toCharArray();
		
		for(int p=0;p<nameCharArray.length-1;p++) {
			for(int q=p+1;q<nameCharArray.length;q++) {
				if(nameCharArray[p]>nameCharArray[q]) {
				tempChar=nameCharArray[p];
				nameCharArray[p]=nameCharArray[q];
				nameCharArray[q]=tempChar;
				}
			}
		}
		System.out.println("sortString");
		for(int h=0;h<nameCharArray.length;h++) {
			System.out.println(nameCharArray[h]);
		}
		
		for (int j = 0; j < nameCharArray.length; j++) {
			String nameInCharArray = Character.toString(nameCharArray[j]);
			if (nameMap.containsKey(nameInCharArray)) {
				nameMap.put(nameInCharArray, nameMap.get(nameInCharArray) + 1);

			} else {
				nameMap.put(nameInCharArray, 1);
			}
		}

		System.out.println("letter occurance numer " + nameMap);
		HashMap<String, Integer> maxOccarance = new HashMap<>();
		Iterator iteratorName = nameMap.entrySet().iterator();
		int count = 0;
		int max = 0;
		while (iteratorName.hasNext()) {
			Map.Entry<String, Integer> nameEntry = (Entry<String, Integer>) iteratorName.next();
			String key = nameEntry.getKey();
			int value = nameEntry.getValue();
			count = value;
			if (max <= count) {
				max = count;

				maxOccarance.put(key, value);

			}

		}
		System.out.println("letter occurance max " + maxOccarance);

		System.out.println(nameMap.entrySet().stream().max((a, b) -> a.getValue().compareTo(b.getValue())).get());
		
		Employee e1 = new Employee("remya",12,"kalyanna");
		Employee e2 = new Employee("remya",10,"kalyan");
		Employee e3 = new Employee("remya",12,"kalyannnnn");
		
		System.out.println(e1.equals(e2));
		System.out.println(e3.equals(e2));
		System.out.println(e1.equals(e3));
		
		HashMap<Employee, Integer> empMap = new HashMap<>();
		
		empMap.put(e1, 1);
		empMap.put(e2, 2);
		
		System.out.println("empMap "+empMap);
		
		TreeSet<Employee> empTree = new TreeSet<Employee>(new EmployeeComparator());
		
		empTree.add(e1);
		empTree.add(e2);
		empTree.add(e3);
		
		empTree.forEach(System.out::println);
		
//		StaticClass s1= new StaticClass("remya");
//		StaticClass s2= new StaticClass("remyaaaa");
//		
//		System.out.println(s1.lastName);
//		System.out.println(s2.lastName);
//		
		StaticClass s3= new StaticSubClass(10);
		
		int number = 1234;
		String numberString = Integer.toString(number);
		String reverse="";
		for(int i =numberString.length()-1;i>=0;i--) {
			reverse= reverse + numberString.charAt(i);
		}
		int revInt = Integer.parseInt(reverse);
		System.out.println(revInt);
		
		String str1="HI";
		String str2= new String("HI");
		String str3=str2.intern();
		
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str2==str3);
		System.out.println(str1==str3);
		
		String[] str = new String[5];
		 
        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";
 
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
 
        // It returns a non-empty Optional
//        Optional<String> value = Optional.of(str[3]);
//        System.out.println(value);
        
       HashMap<String, Integer> m  = new HashMap<>();
       m.put(null, 1);
       m.put("remya", 1);
       m.put("remyaaa", 1);
       m.computeIfAbsent("r", d->4*4);
       m.computeIfPresent("r", (key,value)->value*4);
       Iterator mIt = m.entrySet().iterator();
//       while(mIt.hasNext()) {
//    	   Map.Entry<String, Integer> entrySetMap = (Entry<String, Integer>) mIt.next();
//    			   if(entrySetMap.getKey().equals("remya")) {
//    				   m.put("remya", 2);
//    			   }
//    	   
//       }
       System.out.println(m);
       
       HashSet<Employee> set = new HashSet<>();
       set.add(e1);
       set.add(e2);
       set.add(e3);
       
       
       set.forEach(System.out::println);
       Employee e4 = new Employee("remya",12,"thane");
		Employee e5 = new Employee("reshmi",10,"thane");
		Employee e6 = new Employee("kuttu",1,"usa");
       ArrayList<Employee> list = new ArrayList<>();
       list.add(e4);
       list.add(e5);
       list.add(e6);
       
     Employee list2= list.stream().filter(e->e.getAddress().equalsIgnoreCase("thane")).
    		 max((f1,f2)->Integer.valueOf(f1.getAge()).compareTo(Integer.valueOf(f2.getAge()))).get();
     
     System.out.println("max "+list2);
      int data =5;
      System.out.println(data++);
      System.out.println(++data);
      
      System.out.println(testReturn());
      
    		  

	}
	
	@SuppressWarnings("finally")
	public static  int testReturn() {
		int ff=0;
		try {
			ff=6;
	    	  return ff;
	      }
	      
	      finally {
	    	  System.out.println("in finally");
	    	  ff=8;
	    	  return ff;
	      }
	}
}
