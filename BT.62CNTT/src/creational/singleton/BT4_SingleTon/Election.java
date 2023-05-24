package creational.singleton.BT4_SingleTon;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election election;

    private Election(){}
    int donal_Trump = 0, joe_Biden = 0;

    List<String> votes = new ArrayList<>();
    public static Election getElection(){
        if(election == null)
            election = new Election();
        return election;
    }
    public void vote(Candidate c){
        if(c == Candidate.Donal_Trump)
            donal_Trump++;
        if(c == Candidate.Joe_Biden)
            joe_Biden++;
    }


    @Override
    public String toString() {
        return "Donal_Trump: " + donal_Trump +
                ", Joe_Biden: " + joe_Biden ;

    }
}
