class Stream {
    public int a = 10;
    public int b = 20;
}
public class ObjectAsArguement {
    static int sum(Stream str) {
        Stream temp = new Stream();
        int answer = temp.a + temp.b;
        return answer;
    }
    public static void main(String[] args) {
        Stream str = new Stream();
        System.out.println("Sum -> " + sum(str));
    }
}
