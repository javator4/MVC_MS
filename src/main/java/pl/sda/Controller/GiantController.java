package pl.sda.Controller;

import pl.sda.Model.Fatigue;
import pl.sda.Model.GiantModel;
import pl.sda.Model.Health;
import pl.sda.Model.Nourishment;
import pl.sda.View.GiantView;

public class GiantController {

    private GiantModel giant;
    private GiantView giantView;

    public GiantController(GiantModel giant, GiantView giantView) {
        this.giant = giant;
        this.giantView = giantView;
    }

    public Health getHealth() {
        return giant.getHealth();
    }

    public void setHealth(Health health) {
        giant.setHealth(health);
    }

    public Fatigue getFatigue() {
        return giant.getFatigue();
    }

    public void setFatigue(Fatigue fatigue) {
        giant.setFatigue(fatigue);
    }

    public Nourishment getNourishment() {
        return giant.getNourishment();
    }

    public void setNourishment(Nourishment nourishment) {
        giant.setNourishment(nourishment);
    }

    public void updateView() {
        this.giantView.displayGiant(this.giant);

    }



}
