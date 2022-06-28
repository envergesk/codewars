package codewars.June14;
//done
public class WelcomeToTheCity {
    public String sayHello(String [] name, String city, String state){
        StringBuilder fullName = new StringBuilder();
        for (int i = 0; i < name.length; i++) {
            fullName.append(name[i]);
            if (name[i] == name[name.length - 1]){
                continue;
            }
            fullName.append(" ");
        }
        fullName.toString();
        return "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";
    }
}

//import org.junit.Test;
//        import static org.junit.Assert.assertEquals;
//
//public class HelloTest {
//
//    @Test
//    public void test1() throws Exception {
//        Hello h = new Hello();
//        String[] name = {"John", "Smith"};
//        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
//                h.sayHello(name, "Phoenix", "Arizona"));
//    }
//}