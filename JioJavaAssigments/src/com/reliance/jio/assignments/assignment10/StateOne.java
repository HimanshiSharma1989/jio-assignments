package com.reliance.jio.assignments.assignment10;

public class StateOne implements StateType {
	private StateMachineController controllerParent;
	@Override
	public void doSomething(StateMachineController controller) {
		System.out.println("*********Inside StateOne Class************");
		controller.setState(new StateTwo());
	}

}
