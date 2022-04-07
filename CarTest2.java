import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbi.level2.Car;
import com.sbi.level2.Engine;
import com.sbi.level2.Piston;

public class CarTest2 {
	public static void main(String[] args) {
		
		System.out.println("Begin main");
		
		System.out.println("Trying to create spring's container..with myspring2.xml..");
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("myspring2.xml"); 
		System.out.println("Spring container created....");
		
		
		Car myCar1 = (Car) ctx.getBean("a");
		
		System.out.println("---------------");
		Car myCar2 =  (Car)  ctx.getBean("a");
		
		System.out.println("---------------");
		Car myCar3 = (Car)  ctx.getBean("a");
		
		System.out.println("End main");
		
	}
}

