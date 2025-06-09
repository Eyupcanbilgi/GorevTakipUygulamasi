import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n--- Görev Takip Sistemi ---");
            System.out.println("1 - Görev Ekle");
            System.out.println("2 - Görevleri Listele");
            System.out.println("3 - Görev Tamamla");
            System.out.println("4 - Tamamlanan Görevleri Listele");
            System.out.println("5 - Görev Sil");
            System.out.println("6 - Görevleri İsme Göre Sırala");
            System.out.println("0 - Çıkış");
            System.out.print("Seçim: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Enter yakalama.aaaaaaa
            

            switch (secim) {
                case 1:
                    System.out.print("Görev başlığı: "); //eee
                    String baslik = scanner.nextLine();
                    manager.addTask(baslik);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Tamamlanacak görev index: ");
                    int tamam = scanner.nextInt();
                    manager.completeTask(tamam);
                    break;
                case 4:
                    manager.listCompletedTasks();
                    break;
                case 5:
                    System.out.print("Silinecek görev index: ");
                    int sil = scanner.nextInt();
                    manager.deleteTask(sil);
                    break;
                case 6:
                    manager.sortTasksByTitle();
                    break;
                case 0:
                    System.out.println("Çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }
}
