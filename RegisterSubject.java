public class RegisterSubject {
    public static void main(String[] args) {
        boolean isKMITLStudent = true;
        boolean isCSStudent = true;
        int studentID = 65050521;
        
        if (isKMITLStudent && isCSStudent && studentID>=65050440) {
            System.out.println("Can Register In ProFun Sec 2");
        }else{
            System.out.println("Error");
        }
    }
}
