package code;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Shape{
	abstract void draw();
	
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("rectangle draw");
	}
}
class Circle extends Shape{
	void draw(){System.out.println("circle draw");}
}

public class Generics {
	//creating a method that accepts only child class of Shape  
	public static void drawShapes(List<? extends Shape> list){
		for(Shape s:list){
			s.draw();
		}
	}

	public static void main(String[] args) {
		
		
		List<Rectangle> list1=new ArrayList<Rectangle>();
		Rectangle r=new Rectangle();
		list1.add(r);  
		  
	/*	List<Circle> list2=new ArrayList<Circle>();  
		list2.add(new Circle());  
		list2.add(new Circle()); */ 
		  
		drawShapes(list1);  
//		drawShapes(list2); 
		

	}

}
