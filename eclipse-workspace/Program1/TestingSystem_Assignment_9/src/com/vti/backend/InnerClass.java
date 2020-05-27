package com.vti.backend;

import com.vti.entity.innerclass.CPU;
import com.vti.entity.innerclass.Car;
import com.vti.entity.innerclass.Car.Engine;

public class InnerClass {
//	Question 1: 

public void Question1() {

	CPU cpu = new CPU(100);
	CPU.Ram ram = cpu.new Ram(1, "DELL");
	CPU.Processor processor = cpu.new Processor(2, "ASUF");

	// getClockspeed
	System.out.println(ram.getClockSpeed());

	// get cache
	System.out.println(processor.getCache());
}

//Question 2: 

public void Question2() {

	Car car = new Car("A", "B");

	Engine engine = car.new Engine();
	engine.setEngineType("C");

	car.setEngine(engine);

	car.printInfor();
}
}
