public class Main {
    public static void main(String[] args) {
        String name = "Sachin";
//        System.out.println(name.length());
//System.out.println(name.equals("sachin"));
//        System.out.println(name.equalsIgnoreCase("sachin"));
//
//        String st1 = new String("Java");
//        System.out.println(st1.concat(" Learning"));
//
//          StringBuffer sb = new StringBuffer("Happy Learning");
//          sb.append(" Java is good");
//        System.out.println(sb);
//          sb.insert(6,"Holiday");
//        System.out.println(sb);
//        System.out.println(sb.reverse());

//        sb.replace(6,14,"Holiday");
//        System.out.println(sb);

        StringBuilder builder = new StringBuilder("Happy Learning");
        builder.append(" for Java Learners");
        System.out.println(builder);
        //System.out.println(builder.reverse());
        builder.replace(19,23,"REact");
        System.out.println(builder);


    }
}