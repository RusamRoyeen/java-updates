import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> { //any class you can pass to Team. Should accept only player class and subclasses.
    private String name;

    private List<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) {
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;

        }else {
            members.add(player);
            System.out.println(((Player)player).getName() + " picked for team" + this.name);
            return true;
        }
    }
}
