import java.io.*;

public class Main {
    public static void main(String[] args) {
        //var r = new RegEx();
        try {
            var fis = new FileInputStream("text.txt");
            var isr = new InputStreamReader(fis);
            var br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            while (br.ready()){
                sb.append(br.readLine());
                sb.append("\n");
            }
            var s = sb.toString();
            br.close();
            String regex = "(?<=\\s)(?:[0-1]?\\d|2[0-3]):[0-5]\\d(?::[0-5]\\d)?(?=[;.,!?-]?\\s)";
            var res = RegEx.find(s, regex);
            for (var line : res){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось найти указанный файл");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
