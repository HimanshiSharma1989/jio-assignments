package com.reliance.jio.assignments.assignment10;

public class StateTwo implements StateType {
	private StateMachineController controllerParent;
	@Override
	public void doSomething(StateMachineController controller) {
		System.out.println("*********Inside StateTwo Class************");	
		controller.setState(new StateThree());
	}

}
