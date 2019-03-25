package Section2;

public class TextExample {
    public static void main(String[] args) {

            String str = "Это ##тестовый пример## для задачи ##на## строки";

            String m = str.replaceAll(" ##", " <");
            String f = m.replaceAll("## ", "> ");

            System.out.println(f);
        }
    }






