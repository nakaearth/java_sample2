package reflect_sample;

public class TestReflect {
    private String name;
    private Integer age;
    
    public void hello(){
    	System.out.println("hello");
    	hoge("test");
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
    
    private void hoge(String message) {
    	System.out.println("HELLO!" + message);
    }

}
