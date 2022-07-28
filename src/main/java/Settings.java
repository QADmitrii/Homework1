import java.util.Scanner;

public class Settings {

    String nameBox1;
    String nameBox2;
    int box1;
    int box2;

    public Settings(int box1,int box2, String nameBox1, String nameBox2) {
        this.nameBox1 = nameBox1;
        this.nameBox2 = nameBox2;
        this.box1 = box1;
        this.box2 = box2;
    }

    void takeCount() {

        Scanner child = new Scanner(System.in);
        System.out.print("Введите число конфет: ");
        int count = child.nextInt();


        if (count <= 0) {
            System.out.print("Ошибка ввода...");
            return;
        }


        else if (count > box1) {

            System.out.println("В коробке " + nameBox1 + " кончились конфеты");
            System.out.println("Загрузка коробки " + nameBox2 + " ...");
            System.out.print("Введите число конфет: ");
            count = child.nextInt();

            if (count <= 0) {
                System.out.print("Ошибка ввода...");
                return;
            }

        }

        if (count > box2) {
            System.out.println("В коробке " + nameBox2 + " кончились конфеты");
        }

        else {
            System.out.println("Вот ваши конфеты!");
        }

    }

}



