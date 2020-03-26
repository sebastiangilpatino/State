
public class AlertStateContext {
	private MobileAlertState currentState;
	private AlertStateContext alertstatecontext;

	public AlertStateContext() {
		currentState = null;
	}

	public void setState(MobileAlertState state) {
		currentState = state;
	}

	public void alert() {
		currentState.alert(alertstatecontext);
	}
}