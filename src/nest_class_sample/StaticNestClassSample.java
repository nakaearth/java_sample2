package nest_class_sample;

public class StaticNestClassSample {
    
	private static class MyHelper {
    	private static String nested_priv_class_field = "Nested private class field";
    	private String nested_priv_inst_field = "nested private instance field";
    	
    	private static void class_doit() {
    		System.out.println(StaticNestClassSample.priv_class_field);
    	}
    	private void doit(StaticNestClassSample my) {
    		System.out.println(my.priv_inst_field);
    	}
    }
	private static String priv_class_field;
	private String priv_inst_field = "private instance field";
	
	
	private void doIt() {
		MyHelper helper = new MyHelper();
		helper.doit(this);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(MyHelper.nested_priv_class_field);
		MyHelper helper = new MyHelper();
		System.out.println(helper.nested_priv_inst_field);
		MyHelper.class_doit();
		
		StaticNestClassSample sample = new StaticNestClassSample();
		sample.doIt();
	}

}
