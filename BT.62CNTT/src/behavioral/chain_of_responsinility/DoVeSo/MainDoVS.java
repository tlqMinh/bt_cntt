package behavioral.chain_of_responsinility.DoVeSo;

public class MainDoVS {
    public static void main(String[] args) {
        String b = "123456789";
        IDoVeSo giai1 = new Giai5So("Giải ĐB", b);
        IDoVeSo giai2 = new Giai5So("Giải nhất",b);
        IDoVeSo giai3 = new Giai5So("Giải nhì",b);
        IDoVeSo giai4 = new Giai5So("Giải ba",b);
        IDoVeSo giai5 = new Giai5So("Giải tư",b);
        IDoVeSo giai6 = new Giai5So("Giải 5",b);
        IDoVeSo giai7 = new GiaiBeNhat("Giải bé nhất",b);

        giai1.giaiThapHon(giai2).
            giaiThapHon(giai3).
            giaiThapHon(giai4).
            giaiThapHon(giai5).
            giaiThapHon(giai6).
            giaiThapHon(giai7);
        System.out.println(giai1.doVS("123556789"));
    }
}
