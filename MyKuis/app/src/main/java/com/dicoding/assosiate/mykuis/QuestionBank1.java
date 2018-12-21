package com.dicoding.assosiate.mykuis;

public class QuestionBank1 {

    private String textQuestions [] = {
            "1. Berikut ini API Level untuk Android dengan nama kode KitKat adalah?",
            "2. Tipe file installer di android adalah?",
            "3. activity yang dihapus berada pada fase?",
            "4. Saat ini SDK terbaru adalah API level?",
            "5. Android adalah sistem operasi yang dikeluarkan oleh?",
            "6. Salah satu fitur baru yang hadir pada Android Nougat?",
            "7. Komponen dasar aplikasi android yang berhubungan dengan pengguna melalui interface (antarmuka) adalah",
            "8. IDE (Integrated Development Environment) atau Editor Pemrograman Android yang bisa digunakan adalah",
            "9. Jika kita ingin menambahkan gambar, icon, atau style pada aplikasi Android, maka diletakan pada bagian",
            "10. Minimum versi Android yang bisa menjalankan Job Scheduler adalah"
    };
    private String multipleChoice [][] = {
            {"20", "21", "22", "18"},
            {"*.exe", "*.jar", "*.deb", "*.apk"},
            {"onPause()", "onDestroy()", "onStop()", "onRestart()"},
            {"29", "28", "30", "27"},
            {"Google", "Microsoft", "Oracle", "Apple"},
            {"Multi Window", "Google Now", "Smart Dialer", "Multi Screen"},
            {"Receiver", "Service", "Intent", "Activity"},
            {"Android Studio", "Visual Studio", "Dreamweaver", "Netbeans"},
            {"Res", "Manifest", "Gradle", "Java"},
            {"20", "21", "19", "22"}
    };

    private String mCorrectAnswers[] = {"20", "*.apk", "onDestroy()", "28", "Google",
            "Multi Window", "Activity", "Android Studio", "Res", "21"};

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