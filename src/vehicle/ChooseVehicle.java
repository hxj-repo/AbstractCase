package vehicle;

public class ChooseVehicle extends Vehicle{

    @Override
    public void reachDestination(int budge) {
        if (this.drivingCost <= budge) {
            System.out.println("可选择自驾");
        }
        if (this.carCost <= budge) {
            System.out.println("可选择公共汽车");
        }
        if (this.trainCost <= budge) {
            System.out.println("可选择火车");
        }
        if (this.planeCost <= budge) {
            System.out.println("可选择飞机");
        }
    }

    public static void main(String[] args) {
        ChooseVehicle chooseVehicle = new ChooseVehicle();
        chooseVehicle.reachDestination(500);
    }
}
