public class Gmail {
    public static void main(String[] args) {
        String str = "programming@gmail.com";
        int i = str.indexOf("@");
        String user = str.substring(0, i);
        String domain = str.substring(i + 1, str.length());
        System.out.println(user);
        System.out.println(domain);
        System.out.println((domain.matches("gmail.*")));
    }
}
