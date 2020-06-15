import java.io.IOException;
import java.util.Date;

public class Command {
    public static void distribution(String cmd) throws NumberFormatException, IOException
    {
        switch (cmd)
        {
            case "time":
                Date dtime = new Date();
                System.out.println(dtime.toString());
                break;

            case "exit":
                System.exit(0);
                break;

            case "honda":
                Honda.janken();
                break;

            default:
                System.out.println("コマンド\"" + cmd + "\"は認識できません。");
                break;
        }
    }
}