package pl.sda.Controller;

import pl.sda.Model.Fatigue;
import pl.sda.Model.GiantModel;
import pl.sda.Model.Health;
import pl.sda.Model.Nourishment;
import pl.sda.View.GiantView;

import java.util.List;

public class GiantController {

    private List<GiantModel> models;
    private GiantView giantView;

    public GiantController(List<GiantModel> models, GiantView giantView) {
        this.models = models;
        this.giantView = giantView;
    }

    public Health getHealth(int lp) {
        return models.get(lp).getHealth();
    }

    public void setHealth(Health health, int lp) {
        models.get(lp).setHealth(health);
    }

    public Fatigue getFatigue(int lp) {
        return models.get(lp).getFatigue();

    }

    public void setFatigue(Fatigue fatigue, int lp) {
        models.get(lp).setFatigue(fatigue);

    }

    public Nourishment getNourishment(int lp) {
        return models.get(lp).getNourishment();

    }

    public void setNourishment(Nourishment nourishment, int lp) {
        models.get(lp).setNourishment(nourishment);

    }

    public String getName(int lp) {
        return models.get(lp).getName();

    }

    public void setName(String name, int lp) {
        models.get(lp).setName(name);

    }

    public void updateView(int lp) {
        this.giantView.displayGiant(this.models.get(lp));

    }


}
