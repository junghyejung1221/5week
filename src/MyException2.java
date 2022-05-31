public class MyException2 extends Exception{
    public MyException2(){
        System.out.println("나이를 제대로 입력해주세요!!!!");
        System.out.println("(나이는 음수가 불가능합니다)");
    }
}
