package pl.sda;


import pl.sda.Controller.GiantController;
import pl.sda.Model.Fatigue;
import pl.sda.Model.GiantModel;
import pl.sda.Model.Health;
import pl.sda.Model.Nourishment;
import pl.sda.View.GiantView;

public class App
{
    public static void main( String[] args )
    {

        GiantModel giant1 = new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Nourishment.NOTHUNGRY);
        GiantView giantView = new GiantView();

        GiantController controller = new GiantController(giant1, giantView);

        controller.updateView();
        controller.setHealth(Health.DEAD);
        controller.updateView();
        controller.setFatigue(Fatigue.SLEEPING);
        controller.updateView();


    }
}
