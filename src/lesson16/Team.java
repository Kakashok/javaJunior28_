package lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {

    List <Participant> participants;
    String name;

    public void addParticipantToTeam(T participant){
        System.out.println("To team " + name + " added player with name " + participant.name);
        participants = new ArrayList<>();
        participants.add(participant);

    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void winnerTeam(Team<T> team){
        Random random = new Random();

        int randomOpredelitel = random.nextInt(2);
        if(randomOpredelitel == 1){
            System.out.println("Winner team is " + this.name);

        }else{
            System.out.println("Winner team is " + team.name);
        }
    }
}
