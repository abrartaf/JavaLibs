import javax.swing.JOptionPane;
public class JavaLibs5026211132{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
            "HALO!\nSelamat Datang!\nDisini saya ingin bertanya beberapa hal pribadi pada kamu!",
            "JAVALIBS GAME ABRARTA",
            1);

        String input1 = (String)JOptionPane.showInputDialog(null,
            "Nama kamu siapa?",
            "NAMA",
            2,
            null,
            null,
            "Type something here..");


        String input2 = (String)JOptionPane.showInputDialog(null,
            "Umur kamu berapa?",
            "UMUR",
            2,
            null,
            null,
            "Type something here..");
        
        JOptionPane.showMessageDialog(null,
            "Halo "+ input1 + "(" +input2+ ")");
        

        JOptionPane.showMessageDialog(null,
            "Kita lanjut ke pertanyaan berikutnya!");
        

        String[] acceptableValues = {"FPS", "RPG", "MOBA"};
        String input3 = (String)JOptionPane.showInputDialog(null,
            "Kamu suka game bergenre apa?",
            "Genre",
            2,
            null,
            acceptableValues,
            acceptableValues[1]);

        String input4 = (String)JOptionPane.showInputDialog(null,
            "Biasanya berapa lama kamu bermain game?",
            "Durasi",
            2,
            null,
            null,
            "Type something here..");

        String input5 = (String)JOptionPane.showInputDialog(null,
            "Apa nama game favoritmu?",
            "Game",
            2,
            null,
            null,
            "Type something here..");

        String input6 = (String)JOptionPane.showInputDialog(null,
            "Jam berapa biasanya kamu mulai bermain game "+input5+"?",
            "Waktu",
            2,
            null,
            null,
            "Type something here..");

        String[] acceptableValues2 = {"Keluarga", "Teman", "Pasangan"};
        String input7 = (String)JOptionPane.showInputDialog(null,
            "Biasanya kamu bermain "+input5+" dengan siapa?",
            "Teman main",
            2,
            null,
            acceptableValues2,
            acceptableValues2[2]);

        String input8 = (String)JOptionPane.showInputDialog(null,
            "Apa alasan kamu suka dengan "+input5+ "?",
            "Alasan suka",
            2,
            null,
            null,
            "Type something here..");

        String input9 = (String)JOptionPane.showInputDialog(null,
            "Dari 1-10, Seberapa besar kamu suka "+input5+"?",
            "Skala",
            2,
            null,
            null,
            "Type something here..");
        
        String input10 = (String)JOptionPane.showInputDialog(null,
            "Mengapa kamu memberi nilai tersebut?",
            "Nilai",
            2,
            null,
            null,
            "Type something here..");

        JOptionPane.showMessageDialog(null,
            "Yaa, sekarang aku paham!\n"+input1+ " sangat suka genre game "+input3+"!, kemudian biasanya kamu bermain game selama "+input4+"\nGame favorit kamu ternyata "+input5+
            " Kemudian kamu mulai bermain sekitar jam "+input6+"!, dan biasanya juga bersama "+input7+".\nTernyata alasan kamu suka "+input5+" adalah karena game tersebut "
            +input8+". Kemudian kamu menilai "+input5+" dengan nilai sebesar "+input9+"! dengan alasan "+input10+".\nYaa! senang berkenalan denganmu!\nSampai Jumpa Lagi!!!"
            );
    }    
    
}