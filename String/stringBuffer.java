public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer Str = new StringBuffer();
        Str.append("nit");
        Str.append("hyd");
        System.out.println("Str "+ Str.toString());
        Str.insert(1,"s");
        System.out.println("Str " + Str.toString());
        System.out.println("String reverse");
        System.out.println(Str.reverse());

    }
}
