package enumeration;

/**
 * 本题主要演示由 Enum class中的 constants带自己的value
 * 		constants要带自己的value必须要求 Enum class里面有constructor.
 * 用 EnumType.name() 得 constant名
 * 用 EnumType中的得constant value的方法去得 constant的value 
 */

public class TrafficSignalSimulator {
	
	enum TrafficSignal {
		RED("STOP"), YELLOW("SLOW"), GREEN("GO");
		
		private String action;
		
		// Enum constructor cannot be public or protected, can be default or private
		TrafficSignal(String action) {
			this.action = action;
		}
		
		public String getAction() {
			return action;
		}
	}
	
	
	public static void main(String[] args) {
		// TrafficSignal[] signals = new TrafficSignal[]; //NO! NO!
		
		/* ENUM class contains constants so, */
		TrafficSignal[] signals = TrafficSignal.values();
		
		for (TrafficSignal s : signals) {
			System.out.println("Light is " + s.name() + " and action should be " + s.getAction());
		}
	}
}
