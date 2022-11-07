public class Client {
    public static void main(String[] args) {
        Display road = new RoadDisplay();
        road.draw();

        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();

        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();

        System.out.println();
        System.out.println("차선 표시 + 교통량 표시");
        Display roadWithLaneAndTraffic = new TrafficDecorator(
                new LaneDecorator(
                        new RoadDisplay()
                )
        );
        roadWithLaneAndTraffic.draw();

        System.out.println();
        System.out.println("횡단보도 표시 + 교통량 표시 + 차선 표시");
        Display roadWithCrossingLaneAndTraffic = new LaneDecorator(
                new TrafficDecorator(
                        new CrossingDecorator(
                                new RoadDisplay()
                        )
                )
        );
        roadWithCrossingLaneAndTraffic.draw();
    }
}
