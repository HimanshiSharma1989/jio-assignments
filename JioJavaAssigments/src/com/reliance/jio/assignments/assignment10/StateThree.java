package com.reliance.jio.assignments.assignment10;

public class StateThree implements StateType {
	private StateMachineController controllerParent;
	@Override
	public void doSomething(StateMachineController controller) {
		System.out.println("*********Inside StateThree Class************");
		controller.setState(new StateOne());
	}

}
