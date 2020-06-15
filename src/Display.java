import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Display {
    static String appname = "JConsole";

    /// ホストマシンを取得
    public static String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "UnknownHost";
    }

    /// メイン描画
    public static void view() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String hostname = getHostName();

            System.out.print("\n" + appname + ":" + hostname + ">");

            // 入力待ち
            String cmd = br.readLine();
            // コマンドを渡す
            Command.distribution(cmd);
        }
    }
}