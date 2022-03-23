
public class PassingAndReturningObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ComplexNumber c1 = new ComplexNumber(2, 3);
			ComplexNumber c2 = new ComplexNumber(3, 4);
			ComplexNumber c3 = new ComplexNumber(4, 2);
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			
			long answer = c1.addValue(c2); //c1+c2
			System.out.println("answer is "+answer);
			
			long answer1 = c1.addValue(c2, c3); //c1+c2
			System.out.println("answer1 is "+answer1);
			
			ComplexNumber c4 = c1.addComplex(c2);
			System.out.println(c4);
			
			Joker j = c1.produce(ba);
			
	}

}

class Joker { }
class ComplexNumber
{
	int base;
	int exponent;
	long value;

	long addValue(ComplexNumber x ) {
		System.out.println(" addValue() is invoked...b:"+base+" e:"+exponent+" v:"+value);
		System.out.println("                    b:"+x.base+" e:"+x.exponent+" v:"+x.value);
		long sum = value + x.value;
		return sum;
	}
	
	Joker produce() {
		Joker j = new Joker();
		return j;
	}
	
	long addValue(ComplexNumber x, ComplexNumber y ) {
		System.out.println(" addValue() is invoked...b:"+base+" e:"+exponent+" v:"+value);
		System.out.println("                    b:"+x.base+" e:"+x.exponent+" v:"+x.value);
		System.out.println("                    b:"+y.base+" e:"+y.exponent+" v:"+y.value);
		long sum = value + x.value + y.value;
		return sum;
	}
	ComplexNumber addComplex(ComplexNumber x ) {
		System.out.println(" addComplex() is invoked...b:"+base+" e:"+exponent+" v:"+value);
		System.out.println("                    b:"+x.base+" e:"+x.exponent+" v:"+x.value);
		ComplexNumber temp = new ComplexNumber(base+x.base, exponent+x.exponent);
		return temp;
	}
	
	public ComplexNumber(int base, int exponent) {
		super();
		this.base = base;
		this.exponent = exponent;
		value = 1;
		for(int i=1;i<=exponent;i++) {
			value = value * base ;
		}
	}

	@Override
	public String toString() {
		return "ComplexNumber [value=" + value + "]";
	}
	
	
}



//int base=2; 
//int exponent=7;
//int value = 1;
//
//for(int i=1;i<=exponent;i++) {
//	value = value * base ;
//}
//
//System.out.println("value "+value);
// 
//
//int base1=3; 
//int exponent1=9;
//int value1 = 1;
//
//for(int i=1;i<=exponent1;i++) {
//	value1 = value1 * base1 ;
//}
//
//System.out.println("value1 "+value1);



















/*
MyCalci calc = new MyCalci();
int num = 50;
int sq = calc.findSquare(num);
System.out.println("square is "+sq);
class MyCalci
{
	int findSquare(int i)
	{
		System.out.println("fun(int) "+i);
		return i * i;
	}
}
*/