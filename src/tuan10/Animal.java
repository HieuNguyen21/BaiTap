package tuan10;

abstract public class Animal {
    protected String picture;
	protected String food;
	protected int hunger;
	protected String boundaries;
	protected int location;

	protected  void makeNoise(){
		System.out.println("Động vật kêu!!");
	}
	protected void eat(){
		System.out.println("Ăn một cách bình thường!!");
	}
	protected void sleep(){
		System.out.println("Đang ngủ !!");
	}
	protected void roam(){
		System.out.println("Đang đi loanh quanh!!");
	}
}
