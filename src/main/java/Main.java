import com.project.task.MyClass;
import com.project.task.VisibilityCheck;

public class Main {

    public static void main(String[] args) {
        VisibilityCheck check = new VisibilityCheck();
        check.checkVisibility();

        MyClass myClass = new MyClass();

        myClass.aDouble = 6.6;
//        myClass.integer;
//        myClass.aChar;
    }
}
