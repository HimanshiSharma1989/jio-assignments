package com.reliance.jio.assignments.assignment10;

public class StateMachineController {
	protected StateType state;
	
	public StateMachineController() {
		state = new StateOne();
	}
	
	public void start() {
		state.doSomething(this);
	}
	
	public void setState(StateType nextState) {
		this.state=nextState;
	}
}
