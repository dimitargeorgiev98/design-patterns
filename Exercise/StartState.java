package Exercise;

import javax.naming.Context;

public class StartState implements State {

    private String stateName = "START_STATE";

    @Override
    public void applyState(Context context) {
        //context.setState(this);
    }

    public String getStateName() {
        return this.stateName;
    }

}
