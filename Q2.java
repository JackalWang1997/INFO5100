package assignment3;

public class Q2 {
public static void main(String args[]) {
	happyObject h = new happyObject();
	sadObject s = new sadObject();
	psyObject.exmaine(h);
	psyObject.observe(h);
	psyObject.exmaine(s);
	psyObject.observe(s);
}
}
abstract class MoodyObject{
	String mood;
	protected abstract void expressFeeling();
	protected abstract String getMoody();
	public void queryMoody() {
		System.out.println("i feel "+mood+" today!");
	}
	
}
class happyObject extends MoodyObject{
	public happyObject() {
		super.mood="happy";
	}
	public void expressFeeling() {
		System.out.println("hahahahahaha");
	}
	protected String getMoody() {
		return this.mood;
	}
	public String toString() {
		return "subject laugh a lot";
		
	}
}
class sadObject extends MoodyObject{
	public sadObject() {
		super.mood="sad";
	}
	public void expressFeeling() {
		System.out.println("wah boo hoo weep sob weep");
	}
	protected String getMoody() {
		return this.mood;
	}
	public String toString() {
		return "subject cry a lot";	
	}
}
class psyObject {
public static  void exmaine(MoodyObject moodyObject) {
	System.out.println("how are u feeling?");
	moodyObject.queryMoody();
}
public static  void observe(MoodyObject moodyObject) {
	moodyObject.expressFeeling();
	System.out.println(moodyObject.toString());
}
	
	
}