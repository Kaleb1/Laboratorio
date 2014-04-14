package Vector;
//variable.length = dimension del arreglo :o
public class Main {

	public static void main(String[] args){
		
		float vector[];
		vector = new float[10];
		
		for(int i=0;i<10;i++){
			
			vector[i]=i+3;
			
			System.out.println("Es: "+vector[i]);
		}
	}
}
