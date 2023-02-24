package hello.core.singleton;

public class SingletonService {

    // static 선언하면 하나만 만들어져 올라감.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }
    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
