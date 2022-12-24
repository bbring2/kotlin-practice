package lecture.null_type;

public class JavaCode {

    //안전하지 않은코드!
    public boolean startsWithA(String str) {
        return str.startsWith("A");
    }

    public boolean startsWithA1(String str) {
        if(str == null) {
            throw new IllegalArgumentException("Null");
        }

        return str.startsWith("A");
    }

    public Boolean startsWithA2(String str) {
        if(str == null) {
            return null;
        }

        return str.startsWith("A");
    }

    public boolean startsWithA3(String str) {
        if(str == null) {
            return false;
        }

        return str.startsWith("A");
    }



}
