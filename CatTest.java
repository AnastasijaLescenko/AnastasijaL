import org.junit.Test;

public class CatTest {
    @Test
    public void createCat (){
        Cat cat = new Cat();
        cat.setName("Murzik");
        cat.setLength(80);
        cat.setHunger(true);

        System.out.println(cat.getName());
        System.out.println(cat.getLength());
        System.out.println(cat.isHunger());
        System.out.println(cat.getColor());
    }
}
