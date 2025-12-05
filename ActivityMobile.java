package test1;

public class ActivityMobile {

	public void takephoto() {
		System.out.println("take photo");
    }
    
	public void makeCall(String number) {
		System.out.println(number);
	}
	public static void main(String[] args) {
		ActivityMobile obj=new ActivityMobile();
		obj.takephoto();
		obj.makeCall("6382159962");
	}
}