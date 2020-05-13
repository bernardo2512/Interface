package carbono;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) {
		ArrayList<CarbonFootprint> array = new ArrayList<CarbonFootprint>();
		Car car1 = new Car("gas",2500);
		Car car2 = new Car("gas",1500);
		House n1 = new House(100,true,150,true);
		School s1 = new School(150,false,100,true);
		Bicycle bi1 = new Bicycle("bmx",1500);
		Bicycle bi2 = new Bicycle("trail",2000);
		
		array.add(car1);
		array.add(car2);
		array.add(n1);
		array.add(s1);
		array.add(bi1);
		array.add(bi2);
		
		int n = array.size();
		for(int i = 0; i<n; i++) {
			System.out.println(array.get(i).getCarbonFootprint());
		}
		
		 try{
	        
		        FileOutputStream fout2 = new FileOutputStream("C:\\Users\\berna\\eclipse-workspace\\ExerciciosInteface\\testeSerializado\\texto.txt");
		        FileOutputStream fout3 = new FileOutputStream("C:\\Users\\berna\\eclipse-workspace\\ExerciciosInteface\\testeSerializado\\texto2.txt");
		        FileOutputStream fout4 = new FileOutputStream("C:\\Users\\berna\\eclipse-workspace\\ExerciciosInteface\\testeSerializado\\texto3.txt");
		        FileOutputStream fout5 = new FileOutputStream("C:\\Users\\berna\\eclipse-workspace\\ExerciciosInteface\\testeSerializado\\texto4.txt");
		        
		        ObjectOutputStream oos2 = new ObjectOutputStream(fout2); 
		        ObjectOutputStream oos3 = new ObjectOutputStream(fout3); 
		        ObjectOutputStream oos4 = new ObjectOutputStream(fout4); 
		        ObjectOutputStream oos5 = new ObjectOutputStream(fout5); 

		        oos2.writeObject(car1);
		        oos3.writeObject(n1);
		        oos4.writeObject(s1);
		        oos5.writeObject(bi1);
		        
		         
		        oos2.close();
		        oos3.close();
		        oos4.close();
		        oos5.close();
		        
		        System.out.println("Done");
		  
		    }catch(Exception ex){
		           ex.printStackTrace();
		    } 
		
		 try {
			 FileInputStream fin = new FileInputStream("C:\\Users\\berna\\eclipse-workspace\\ExerciciosInteface\\testeSerializado\\texto.txt");
			 ObjectInputStream ois = new ObjectInputStream(fin);
			 Car carro = (Car) ois.readObject();
	         ois.close();
	  
	           System.out.println(carro);
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }
		
		
		
	
		
	}

}
