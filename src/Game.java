public class Game {
    private String username;
    private String nickname;
    private int age;
    private long friend;

    public Game(String username){
        this.username = username;
    }

    //예외처리선언
    public void setNickname(String n) throws MyException1 {
        if (n.length() < 3) {
            throw new MyException1();
        }
        nickname = n;
    }
    public void setAge(int a)throws MyException2{
        if (a<=0){
            throw new MyException2();
        }
        age = a;
    }
    public void setFriend(int f) throws MalformedData{
        if (f<=0){
            throw new MalformedData();
        }
        friend=f;
    }

    public void check(){
        System.out.println(username);
        System.out.println("닉네임 : "+nickname );
        System.out.println("나이 : "+age );
        System.out.println("추천인 코드 : "+ friend );
    }
}
