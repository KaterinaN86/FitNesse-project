public class TestMath {

    int firstNum;
    int secondNum;

    public TestMath() {
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
    public int add(){
        int c = firstNum+secondNum;
        return c;
    }
    public int subtract(){
        int c = firstNum-secondNum;
        return c;
    }
}
