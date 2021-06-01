import java.util.*;

public class App {
    private static final String MENU =
            "1.News\n" +
            "2.Main Page\n";

    private static final String DELIMETER = "------------------------\n";

    private static final String MAIN_PAGE = "Welcome to the MAIN PAGE";

    private static ArrayList<String> news = new ArrayList<>();

    private Scanner scanner;

    static {
        news.add("Joe Biden has fired");
        news.add("Trump has been attacked by Nuclear bomb");
    }

    public void start(){
        scanner = new Scanner(System.in);
        boolean successfulLogin = Auth.auth();

        if (!successfulLogin) return;

        System.out.println(MENU);
        System.out.println( "Enter page number: ");
        String menuChoice = scanner.nextLine();

        switch (Integer.parseInt(menuChoice)) {
            case 1 -> NewsPage();
            case 2 -> MainPage();
        }

        scanner.close();
    }

    private void MainPage() {
        System.out.println(MAIN_PAGE);
    }

    public void NewsPage(){
        System.out.println("Enter sort type:\n" +
                "1 - descending\n" +
                "2 - ascending\n");
        int sortType = scanner.nextInt();

        switch (sortType) {
            case 1 -> news.sort(Collections.reverseOrder());
            default -> Collections.sort(news);
        }

        System.out.println("Recent News:");
        for (String title: news) {
            System.out.println(title);
            System.out.println(DELIMETER);
        }
    }












}
