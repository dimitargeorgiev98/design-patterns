package Exercise;

public class PackagesMain {

    //Не успях да се досетя как точно да обединя 3-те шаблона, за да могат да работят по посоченият начин


    private static Package getChain() {
        Package bulgarianPackage = new BulgarianPackage();
        Package PlovdivPackage = new PlovdivPackage();
        Package ForeignPackage = new ForeignPackage();

        bulgarianPackage.setNextLogger(PlovdivPackage);
        PlovdivPackage.setNextLogger(ForeignPackage);
        return bulgarianPackage;
    }

    public static void main(String[] args) {

        Package chain = getChain();
        chain.logMessage(3, "");
        chain.logMessage(2, "");
        chain.logMessage(1, "");


        /*
        Topic topic = new Topic();
		Observer obs1 = new TopicSubscriber("Subscriber 1");

		topic.subscribe(obs1);

		topic.setName("New topic");
		topic.setName("Another topic");
         */

        /*
        Context player = new Context("Hero");

		StartState startState = new StartState();
		StopState stopState = new StopState();

		startState.applyState(player);
		stopState.applyState(enemy);

		State playerState = player.getState();
		String currentState = playerState.getStateName();
		System.out.println("currentState: " + currentState);
         */

    }
}
