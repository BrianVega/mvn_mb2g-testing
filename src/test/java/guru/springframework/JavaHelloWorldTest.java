package guru.springframework;


public class JavaHelloWorldTest {
    /*
     POJO tests conventions says that pojo tests need to start with test
    */
    public void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World".equals(javaHelloWorld.getHello()));
        // ! Now execute test lifecycle step
    }
}