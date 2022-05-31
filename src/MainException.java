public class MainException {
    public static void main(String [] args){
        int array[] = new int[2];
        int age;

        Game jhj = new Game("정혜정");
        Game aaa = new Game("가나다");

        try {
            jhj.setNickname("decidejung");
            aaa.setNickname("A");
        }
        catch (MyException1 a){
            a.printStackTrace();
        }try {
            jhj.setAge(24);
            aaa.setAge(-100);
        }catch (MyException2 b){
            b.printStackTrace();
        }
        try {
            array[0]=1111111;
            array[1]=0000000;
            array[2]=2222222;
            array[3]=3333333;
        }catch (Exception aa){
            System.out.println("배열 인덱스 초과");
            System.out.println("배열의 크기는 " + array.length + " 입니다.");
        }
        try{
            jhj.setFriend(array[0]);
            aaa.setFriend(array[1]);
        }catch (MalformedData m){
            m.printStackTrace();
        }


        jhj.check();
        aaa.check();

        System.out.println("GoodEnd!!");
    }
}
