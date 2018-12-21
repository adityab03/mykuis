package com.dicoding.assosiate.mykuis;

public class QuestionBank {

    private String textQuestions [] = {
            "1. Pada android Studio terdapat Emulator Android yang disebut?",
            "2. Tipe file installer di android adalah?",
            "3. activity yang dihapus berada pada fase?",
            "4. Saat ini SDK terbaru adalah API level?",
            "5. Android adalah sistem operasi yang dikeluarkan oleh?",
            "6. Cara melakukan pembaruan Android Studio adalah?",
            "7. Komponen dasar aplikasi android yang berhubungan dengan pengguna melalui interface (antarmuka) adalah",
            "8. Berikut ini yang BUKAN bahasa pemrograman yang digunakan untuk mengembangkan aplikasi Android",
            "9. Jika kita ingin menambahkan gambar, icon, atau style pada aplikasi Android, maka diletakan pada bagian",
            "10. Komponen aplikasi Android yang biasanya digunakan untuk menjalankan proses yang memakan waktu lama atau membutuhkan komputasi intensif adalah"
    };

    private String multipleChoice [][] = {
            {"Virtual Box of Android", "QEMU-droid", "Android VMWare", "Android Virtual Device"},
            {"*.exe", "*.jar", "*.deb", "*.apk"},
            {"onPause()", "onDestroy()", "onStop()", "onRestart()"},
            {"29", "28", "30", "27"},
            {"Google", "Microsoft", "Oracle", "Apple"},
            {"Dari Android Market", "Dari Standard Development Kit Manager", "Unduh dari situs resmi Android", "Semua jawaban benar"},
            {"Receiver", "Service", "Intent", "Activity"},
            {"Python", "Java", "Go", "C/C++"},
            {"Res", "Manifest", "Gradle", "Java"},
            {"Receiver", "Activity", "Service", "Intent"}
    };

    private String mCorrectAnswers[] = {"Android Virtual Device", "*.apk", "onDestroy()", "28", "Google",
            "Dari Standard Development Kit Manager", "Activity", "Python", "Res", "Service"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}