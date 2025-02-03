import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Autor(jmeno = "Pepa z Depa")
public class MojeTrida {

    @Zpracuj
    public void metoda1() {
        System.out.println("Zpracovávám metodu 1");
    }

//    @Zpracuj()
    public void metoda2() {
        System.out.println("Zpracovávám metodu 2");
    }

    public void metoda3() {
        System.out.println("Metoda 3 není označena anotací");
    }


    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //instance tridy == objekt

        MojeTrida mojeTrida = new MojeTrida();

        //reflection api = info o tride
        Class<?> c1 = mojeTrida.getClass();
        System.out.println(c1.getAnnotations());

        Autor a = c1.getAnnotation(Autor.class);

        //var je sus sa
//        for (Annotation a :c1.getAnnotations()){
//            if (a.)
//        }
        if (a != null){
            System.out.println(a.jmeno());
        }

        var x = c1.getMethods();
        System.out.println(x);

        Method[] ms = c1.getMethods();
        for (Method method : ms){
            Zpracuj b = method.getAnnotation(Zpracuj.class);
            if (b != null){
                System.out.println(method.getName());
                method.invoke(new MojeTrida());
            }
//            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
//            if (m.getName()=="metoda1" || m.getName()=="metoda2" || m.getName()=="metoda3") {
//                System.out.println(m.getName() + ":");
//            }
        }
    }
}