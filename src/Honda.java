import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Honda {
    public static void janken() throws NumberFormatException, IOException
    {
        System.out.println(hondaWords("じゃーんけーんぽん！"));

        while(true)
        {
            System.out.println("グー->1　チョキ->2　パー->3");

            // 入力待機
            System.out.print("あなた>");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int jkn = Integer.parseInt(br.readLine());

            // あなたの処理
            if (jkn == 1)
            {
                System.out.println(yourWords("グー"));
            }
            else if (jkn == 2)
            {
                System.out.println(yourWords("チョキ"));
            }
            else if (jkn == 3)
            {
                System.out.println(yourWords("パー"));
            }
            else
            {
                System.out.println(yourWords("グー・チョキー・パー以外の何か"));
            }
            

            // 本田の処理
            Random random = new Random();
            // 1-3までのランダム数字
            int hndjkn = random.nextInt(3) + 1;

            if (hndjkn == 1)
            {
                System.out.println(hondaWords("グー"));
            }
            else if (hndjkn == 2)
            {
                System.out.println(hondaWords("チョキ"));
            }
            else if (hndjkn == 3)
            {
                System.out.println(hondaWords("パー"));
            }

            // 両者じゃんけんの比較
            // あいこ　からのループ
            if (jkn == hndjkn)
            {
                System.out.println(hondaWords("あーいこーでしょ！"));
                continue;
            }
            else
            {
                // グーチョキパー以外の
                if (jkn > 3 || jkn < 1)
                {
                    System.out.println(hondaWords("それはせこいよ。"));
                    break;
                }
                // パーで負けた場合
                if (jkn == 3 && hndjkn == 2)
                {
                    System.out.println("YOU LOSE!!");
                    System.out.println(hondaWords("俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです。ほな、いただきます！"));
                }
                // グーで負けた場合
                else if (jkn == 1 && hndjkn == 3)
                {
                    System.out.println("YOU LOSE!!");
                    System.out.println(hondaWords("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！ほな、いただきます！"));
                }
                // チョキで負けた場合
                else if (jkn == 2 && hndjkn == 1)
                {
                    System.out.println("YOU LOSE!!");
                    System.out.println(hondaWords("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら明日も、俺が勝ちますよ。ほな、いただきます！"));
                }
                // 勝った場合
                else
                {
                    System.out.println("YOU WIN!!");
                    System.out.println(hondaWords("やるやん。明日は俺にリベンジさせて。では、どうぞ。"));
                }
            }

            System.out.println(hondaWords("一日一回勝負。じゃあ、また明日。"));
            break;
        }
        
    }

    public static String hondaWords(String words)
    {
        return "本田>" + words;
    }

    public static String yourWords(String words)
    {
        return "あなた>" + words;
    }
}