import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        // implement me
        return f1.getParent().equals(f2.getParent());
        Deque<File> files = new ArrayDeque<>(getChildren(rootDir));
        File file = files.pop();
        file.exists()
    }
}