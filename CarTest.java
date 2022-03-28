import java.time.LocalDateTime;

class C {
	void eat() {
		
	}
}
class B
{
	C c = new C();
	
	

}
class A
{
	B b = new B();

}

public class CarTest {
	public static void main(String[] args) {
		
		A a = new A();
		a.b.c.eat();
		
		
		System.out.println("Begin main");
		
		Car carObj1 = new Car(1,"Skoda","MH-01-RT-7565","abc");
		Car carObj2 = new Car(2,"Honda","MH-02-PY-1335","pqr");
		Car carObj3 = new Car(3,"Maruti","MH-03-BU-5461","xyz");
		
		CarKey key1 = new CarKey("abc");
		CarKey key2 = new CarKey("pqr");
		CarKey key3 = new CarKey("xyz");
		
		
		Driver driverObj1 = new CarDriver();
		Driver driverObj2 = new CarDriver();
		Driver driverObj3 = new CarDriver();
		
		try {
			driverObj1.startTheVehicle(carObj1,key1);
			
			
		} catch (LockException e) {

			System.out.println("lock problem : "+e);
			
		} catch (UnLockException e) {

			System.out.println("unlock problem : "+e);
		}
		
		catch(SpeedLimitException e) {
			System.out.println("speed limit exeeded..."+e);
		}
		

		try {
			driverObj2.startTheVehicle(carObj2,key2);
			
			
		} catch (LockException e) {

			System.out.println("lock problem : "+e);
			
		} catch (UnLockException e) {

			System.out.println("unlock problem : "+e);
		}
		
		catch(SpeedLimitException e) {
			System.out.println("speed limit exeeded..."+e);
		}
		
		try {
			driverObj3.startTheVehicle(carObj3,key3);
			
			
		} catch (LockException e) {

			System.out.println("lock problem : "+e);
			
		} catch (UnLockException e) {

			System.out.println("unlock problem : "+e);
		}
		
		catch(SpeedLimitException e) {
			System.out.println("speed limit exeeded..."+e);
		}
		
		
		
		
		System.out.println("car obj1 "+carObj1);
		
		
		
		System.out.println("End main");
	}
}

/*--------------------------------------------*/
abstract class Key
{
	String password;
	abstract void turnOn();
	abstract void turnOff();
}
class CarKey extends Key
{
	public CarKey(String password) {
		super();
		this.password = password;
	}
	void turnOn() {
		System.out.println("Car is key is turned on...");
	}
	void turnOff() {
		System.out.println("Car is key is turned off...");
	}
}
/*--------------------------------------------*/

abstract class Lock {
	String password;
	abstract void lockIt();
	abstract void unLockIt();
}
class CarLock extends Lock {
	
	public CarLock(String password) {
		super();
		this.password = password;
	}

	void lockIt() {
		System.out.println("locking the car...");
	}
	void unLockIt() {
		System.out.println("unlocking the car...");
	}
}
/*--------------------------------------------*/
abstract class Driver
{
	abstract void startTheVehicle(Vehicle vehicle, Key key)  throws LockException, UnLockException ;

}

class LockException extends Exception
{
	LockException(String str) {
		super(str);
	}
}
class UnLockException extends Exception
{
	UnLockException(String str) {
		super(str);
	}
}
class SpeedLimitException extends RuntimeException
{
	SpeedLimitException (String str) {
		super(str);
	}
}
class CarDriver extends Driver
{
	void startTheVehicle(Vehicle vehicle, Key key) throws LockException, UnLockException 
	{
		Car theCar = (Car) vehicle;
		
		if(theCar.lock.password.equals(key.password)) {
			theCar.lock.unLockIt();	
		}
		else {
			throw new UnLockException("Unable to unlock it....");
		}
		
		key.turnOn();
		
		if(theCar.lock.password.equals(key.password)) {
			theCar.lock.lockIt();	
		}
		else {
			throw new LockException("Unable to lock it....");
		}
		theCar.longDrive();
	}
}
/*--------------------------------------------*/
abstract class Engine
{
	abstract void ignition();
}
class PetrolEngine extends Engine
{
	void ignition() {
		System.out.println("Petrol Engine is ignited....");
		
	}
}

/*--------------------------------------------*/

class Vehicle 
{
	
}
class Car extends Vehicle //isA 
{
	int carId;
	String modelName;
	String numberPlate;
	boolean keyFoundStatus;
	Engine engine = new PetrolEngine(); //hasA
	Lock lock ;
	
	
	public Car(int carId, String modelName, String numberPlate, String password) {
		super();
		this.carId = carId;
		this.modelName = modelName;
		this.numberPlate = numberPlate;
		lock =  new CarLock(password); 
	}


	@Override
	public String toString() {
		return "Car [carId=" + carId + ", modelName=" + modelName + ", numberPlate=" + numberPlate + "]";
	}


	void longDrive() {
		System.out.println(modelName+" has started the long drive....");
		for(int i=1;i<=30;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double value= Math.random()%10;
			if(value>0.98) {
				SpeedLimitException speedLtdEx = new SpeedLimitException("Oh!!! You exceeded the speed limit....");
				throw speedLtdEx;
			}
			System.out.println(modelName+" has completed...."+i+" kms "+LocalDateTime.now());
		}
		System.out.println(modelName+" has finished the long drive....");
	}
}
