package creational.singleton.BT4_SingleTon;


public class Main_Vote {
    public static void main(String[] args) {
        User u1 = new User("Minh");
        u1.vote(Candidate.Donal_Trump);

        User u2 = new User("Duy");
        u2.vote(Candidate.Donal_Trump);
        u2.vote(Candidate.Joe_Biden);

        User u3 = new User("Kiet");
        u3.vote(Candidate.Joe_Biden);
        u3.vote(Candidate.Donal_Trump);

        System.out.println(u3.getKq());

    }
}
