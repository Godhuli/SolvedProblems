package conceptOopDataStructure;



 class BiCycle{
	 String define_me(){
		 return "a vechine with pedals.";
	 }
}
 
 class MotorCycle extends BiCycle{
	 String define_me(){
		 return "a cycle with engine.";
	 }
	public  MotorCycle(){
		 System.out.println("Hello I am motor cycle. I am "+define_me());
		 String temp = super.define_me();
		 System.out.println("My Ancestor is bi cycle. I am "+temp);
		 		 
	 }
 }
 
 public class MethodOverrideII {

		public static void main(String[] args) {
			MotorCycle m1 = new MotorCycle();
			//m1. MotorCycle();//as soon I make object reference for that class constructor is called by default.s
			
		
		}
	}
