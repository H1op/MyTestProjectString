package methPromChapOneTaskB;

public class Reverse {
    public String reverse(String line) {
        StringBuilder builder = new StringBuilder();
        char[] keep = new char[line.length()];
        line.getChars(0, line.length(), keep, 0);
        for (int i = keep.length - 1; i >= 0; i--) {
            builder.append(keep[i]);
        }
        return builder.toString();
    }
}
