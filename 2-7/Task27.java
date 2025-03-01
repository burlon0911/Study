/**
* Task27 : 課題内容
*
* 本課題では、配列の使い方を学んでいきましょう。
* 問①から問⑥まであります。
* 指定された値と変数名を守って記述して下さい。
*
* 問⑤,⑥については、コメントを入れて下さい。
*
*/
public class Task27 {


    public static void main(String[] args) {
       // ①「JAPAN」、「AMERICA」、「KOREA」、「ENGLAND」を要素の値（初期値）とする配列 countryを作成しなさい。

        String[] country = {"JAPAN","AMERICA","KOREA","ENGLAND"};

       // ② ①で作成した配列の要素数を出力して下さい。
       System.out.println(country.length);

        //③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。

    
        String[] strArray = new String[3];
    
         strArray[0] = "りんご"; 
         strArray[1] = "もも"; 
         strArray[2] = "ぶどう"; 

        


       // ④ ③で作成した配列の3番目の要素を出力しなさい。
        System.out.println("country[2] … "+country.length);


        /* ⑤下記の処理について、何をしているのかコメントを記入して下さい。
        *  // int型の配列変数intArrayの宣言をし、10,20,30,40,50で初期化する
        */
        int[] intArray = { 10, 20, 30, 40, 50 };



       // ⑥下記の処理について、何をしているのかコメントを記入して下さい。
       // 変数の(intArray[0]とintArray[4]値を出力する
        System.out.println(intArray[0] + intArray[4]);


    }
}