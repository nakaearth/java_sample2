package nest_class_sample;

public class NotStaticNestClassSample {
    
	private class MyHelper {
    	private static final String nested_priv_class_field = "Nested private class field";
    	private String nested_priv_inst_field = "nested private instance field";
    	private int same_name_field = 2;
    	
    	private void doit(NotStaticNestClassSample my) {
    		System.out.println(my.priv_inst_field);
    		System.out.println(same_name_field);
    		System.out.println(this.same_name_field);
    		System.out.println(NotStaticNestClassSample.this.same_name_field);
    	}
    }
	private static String priv_class_field = "private class field";
	private String priv_inst_field = "private instance field";
	private int same_name_field = 3;
	
	private void doIt() {
		MyHelper helper = new MyHelper();
		helper.doit(this);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(MyHelper.nested_priv_class_field);
		
		NotStaticNestClassSample sample = new NotStaticNestClassSample();
		sample.doIt();
	}

}
