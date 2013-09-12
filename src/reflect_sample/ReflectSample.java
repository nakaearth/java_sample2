package reflect_sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {

	public static void main(String[] args)  {
		try {
			Class<? extends StringBuilder> clazz = StringBuilder.class;
			
			StringBuilder sb = new StringBuilder();
			Class<?> clazz2 = sb.getClass();
			
			Class<?> clazz3 = Class.forName("java.lang.StringBuilder");
			
			System.out.println("Class1:" + clazz.hashCode() + ", class2:" + clazz2.hashCode() + ", class3:" + clazz3.hashCode() );
			assert(clazz == clazz2);
			assert(clazz == clazz3);
			assert(clazz2 == clazz3);
			
			Class<?> clazz4 = Class.forName("reflect_sample.TestReflect");
			Method methods[] = clazz4.getMethods();
			for(Method method: methods) {
				System.out.println("Method:" + method.getName());
			}
			try {
				Method method = clazz4.getDeclaredMethod("hoge",String.class);
				method.setAccessible(true);
				method.invoke(clazz4.newInstance(),"Test MAN");
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
	}

}
