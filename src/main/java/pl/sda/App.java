package pl.sda;


import pl.sda.Controller.GiantController;
import pl.sda.Model.Fatigue;
import pl.sda.Model.GiantModel;
import pl.sda.Model.Health;
import pl.sda.Model.Nourishment;
import pl.sda.View.GiantView;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {



        GiantModel Pikachu = new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Nourishment.NOTHUNGRY, "Pikachu");
        GiantModel Bulbasaur = new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Nourishment.NOTHUNGRY, "Bulbasaur");
        GiantModel Squirle = new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Nourishment.NOTHUNGRY, "Squirle");
        GiantView giantView = new GiantView();


        List<GiantModel> models = new ArrayList<>();
        models.add(Pikachu);
        models.add(Bulbasaur);
        models.add(Squirle);
        GiantController controller = new GiantController(models, giantView);

        controller.setHealth(Health.DEAD, 1);
        controller.updateView(1);

        controller.setFatigue(Fatigue.SLEEPING, 0);
        controller.updateView(0);





    }
}
