package creational.singleton.BT4_SingleTon;

public class User {
    String name;
    private  boolean voted;
    String kq;

    public String getKq() {
        return kq;
    }

    public User(String name) {
        this.name = name;
        voted = false ;
    }

    public void vote(Candidate c){
        Election e = Election.getElection();
        if(voted == false){
            e.vote(c);
            voted =! voted;
        }
        kq = e.toString();
    }

}
