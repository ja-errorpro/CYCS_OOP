import java.util.*;


/**
 * Person 為抽象類別，包含 name 和 birthYear 兩個屬性
 * @author CompileErr0r
 * @version 1.0
 */
abstract class Person{
    String name;
    int birthYear;
}

/**
* Student 繼承 Person，並新增 grade 和 studentID 兩個屬性
* @author CompileErr0r
* @version 1.0
*/
class Student extends Person{
    int grade;
    int studentID;

    /**
     * 因為後面定義了有參數的建構子，所以這裡要 Overload 一個無參數的建構子
     */
    public Student(){}
    /**
     * 有參數的建構子
     * @param name 學生名字
     * @param birthYear 出生年份
     * @param grade 年級
     * @param studentID 學號
     */
    public Student(String name, int birthYear, int grade, int studentID){
        this.name = name;
        this.birthYear = birthYear;
        this.grade = grade;
        this.studentID = studentID;
    }

    /**
     * 重寫 toString 方法，以方便使用 System.out.println() 輸出
     * @return 字串
     */
    public String toString(){
        return "我是" + birthYear + "年出生的學生，我的名字是" + name + "，我是" + grade + "年級的學生，我的學號是" + studentID + "。";
    }
}

/**
 * Teacher 繼承 Person，並新增 subject 屬性
 * @version 1.0
 * @author CompileErr0r
 */
class Teacher extends Person{
    String subject;
    /**
     * 因為後面定義了有參數的建構子，所以這裡要 Overload 一個無參數的建構子
     */
    public Teacher(){}
    /**
     * 有參數的建構子
     * @param name 老師名字
     * @param birthYear 出生年份
     * @param subject 教授科目
     */
    public Teacher(String name, int birthYear, String subject){
        this.name = name;
        this.birthYear = birthYear;
        this.subject = subject;
    }
    /**
     * 重寫 toString 方法，以方便使用 System.out.println() 輸出
     * @return 字串
     */
    public String toString(){
        return "我是" + birthYear + "年出生的老師，我的名字是" + name + "，我教" + subject + "。";
    }
}

/**
 * Show 類別，包含兩個靜態方法，用來輸出 Person 陣列
 * @version 1.0
 * @author CompileErr0r
 */
class Show {
    /**
     * 依名字排序並輸出
     * @param p Person 陣列
     */
    public static void showInfoByName(Person[] p){
        Person[] p2 = p.clone();
        Arrays.sort(p2, new Comparator<Person>(){
            public int compare(Person pi, Person pj){
                return pi.name.compareTo(pj.name);
            }
        });

        for(Person i : p2){
            System.out.println(i);
        }
    }

    /**
     * 依年齡排序並輸出
     * @param p Person 陣列
     */
    public static void showInByAge(Person[] p){
        Person[] p2 = p.clone();
        Arrays.sort(p2, new Comparator<Person>(){
            public int compare(Person pi, Person pj){
                return pi.birthYear - pj.birthYear;
            }
        });

        for(Person i : p2){
            System.out.println(i);
        }
    }
}

public class hw2_2 {

    /**
     * 第三題，要求為各類別重新定義 toString() 方法 , 以便能夠利用
     * System.out.println() 顯示學生或老師的個人資訊。
     */
    static void hw3(){
        Student s = new Student();
        s.name = "王小明";
        s.grade = 3;
        s.birthYear = 2000;
        s.studentID = 114514;
        System.out.println("\n" + s);

        Teacher t = new Teacher();
        t.name = "陳老師";
        t.subject = "數學";
        t.birthYear = 1970;
        System.out.println(t);
    }

    /**
     * 第四題，要求撰寫一個類別 , 提供有一個 showInfoByName() 方法 可以傳
     * 入任意個學生以及老師物件 , 並依據姓名排序後 , 顯示每一個學生以及老
     * 師的資訊。
     *
     * 這裡使用 Show 提供 showInfoByName 方法
     *
     * 在測試時使用 Collections.shuffle() 方法打亂陣列順序
     */
    static void hw4(){
        Person [] p = new Person[5];
        p[0] = new Student("Alice", 2000, 3, 114514);
        p[1] = new Student("Bob", 2001, 2, 1919810);
        p[2] = new Teacher("Cathy", 1970, "Math");
        p[3] = new Teacher("David", 1980, "English");
        p[4] = new Student("Eve", 1999, 4, 8101919);
        Collections.shuffle(Arrays.asList(p));

        System.out.println("\n原陣列：");
        for(Person i : p){
            System.out.println(i);
        }

        System.out.println("\n依名字排序：");
        Show.showInfoByName(p);

        System.out.println("\n原陣列：");
        for(Person i : p){
            System.out.println(i);
        }

    }

    /**
     * 第五題，新增一個 showInByAge() 方法 可以傳
     * 入任意個學生以及老師物件 , 並依據年齡排序後 , 顯示每一個學生以及
     * 老師的資訊。
     *
     * 這裡使用 Show 提供 showInByAge 方法
     *
     * 在測試時使用 Collections.shuffle() 方法打亂陣列順序
     */
    static void hw5(){
        Person [] p = new Person[5];
        p[0] = new Student("Alice", 2000, 3, 114514);
        p[1] = new Student("Bob", 2001, 2, 1919810);
        p[2] = new Teacher("Cathy", 1970, "Math");
        p[3] = new Teacher("David", 1980, "English");
        p[4] = new Student("Eve", 1999, 4, 8101919);
        Collections.shuffle(Arrays.asList(p));

        System.out.println("\n原陣列：");
        for(Person i : p){
            System.out.println(i);
        }

        System.out.println("\n依年齡排序：");
        Show.showInByAge(p);

        System.out.println("\n原陣列：");
        for(Person i : p){
            System.out.println(i);
        }
    }

    /**
     * 主程式，負責執行每題的程式碼
     * @param args
     */
    public static void main(String[] args){
        System.out.println("\033[1;31;40m第三題：\033[0m");
        hw3();
        System.out.println("\033[1;31;40m第四題：\033[0m");
        hw4();
        System.out.println("\033[1;31;40m第五題：\033[0m");
        hw5();
        
    }
}
