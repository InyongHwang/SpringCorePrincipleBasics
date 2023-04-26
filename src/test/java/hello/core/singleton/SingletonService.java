package hello.core.singleton;

public class SingletonService {

    // 이렇게 작성할 경우, class 레벨에 올라가기 때문에 1개만 존재하게 된다.
    private static final SingletonService instance = new SingletonService();

    // 외부에서 생성할 수 없도록 생성자를 private으로 만든다.
    private SingletonService() {
    }

    // SingletonService를 조회할 때는 getInstance()를 사용한다.
    public static SingletonService getInstance() {
        return instance;
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
