package chpt05_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import static java.lang.System.out;

public class ReflectionTest {

	public static void main(String[] args) {
		// read class name from command lines args or user input
		String name;
		if (args.length > 0) {
			name = args[0];
		}
		else {
			Scanner in = new Scanner(System.in);
			out.println("Enter class name (e.g. java.util.Date): ");
			name = in.next();
		}
		
		try	{
			// print class name and super class name (if != Object)
			Class cl = Class.forName(name);
			Class superCl  = cl.getSuperclass();
			
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) {
				out.print(modifiers + " ");
			}
			
			out.print("class " + name);
			if (superCl != null && superCl != Object.class) {
				out.print( " extends " + superCl.getName());
			}
			
			System.out.print("\n{\n");
			printConstructors(cl);
			out.println();
			printMethods(cl);
			out.println();
			printFields(cl);
			out.println("}");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);

	} // end of main()
	
	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();
		
		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.print(" ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0) { 
				System.out.print(modifiers + " ");
			}	
			System.out.print(name + "(");
			
			// print parameter types
			Class[] paramTypes = c.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++)
			{
				if (j > 0) System.out.print(", ");
					System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");			
		}
	}

	/**
	 * Prints all methods of a class
	 * @param cl a class
	 */
	public static void printMethods(Class cl)
	{
		Method[] methods = cl.getDeclaredMethods();
	
		for (Method m : methods)
		{
			Class retType = m.getReturnType();
			String name = m.getName();
	
			System.out.print(" ");
			// print modifiers, return type, and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0) 
				System.out.print(modifiers + " ");
			System.out.print(retType.getName() + " " + name + "(");
	
			// print parameter types
			Class[] paramTypes = m.getParameterTypes();
			for (int j = 0; j < paramTypes.length; j++)
			{
				if (j > 0) 
					System.out.print(", ");
				System.out.print(paramTypes[j].getName());
			}
			System.out.println(");");
		}
	} // end of printMethods(Class cl) method
	
	/**
	 * Prints all fields of a class
	 * @param cl a class
	 */
	public static void printFields(Class cl)
	{
		Field[] fields = cl.getDeclaredFields();
	
		for (Field f : fields)
		{
			Class type = f.getType();
			String name = f.getName();
			System.out.print(" ");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0) 
				System.out.print(modifiers + " ");
			System.out.println(type.getName() + " " + name + ";");
		}
	}
	
}
