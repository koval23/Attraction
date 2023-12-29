import atraction.model.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Attraction> attractionList = new ArrayList<>(Arrays.asList(
                new Museum("Pergamon Museum", "Один из крупнейших музеев в Германии", 15.0),
                new Museum("Neues Museum", "Дом для коллекции египетских артефактов", 12.0),
                new Museum("Alte Nationalgalerie", "Галерея классического искусства", 18.0),
                new Park("Tiergarten", "Большой городской парк в центре Берлина"),
                new Park("Treptower Park", "Известный своим мемориалом войны и прекрасными видами на реку"),
                new Park("Tempelhofer Feld", "Бывший аэропорт, превращенный в общественный парк"),
                new HistoricalSite("Brandenburg Gate", "Знаменитые ворота, символ Берлина и Германии"),
                new HistoricalSite("Reichstag", "Здание парламента с богатой историей"),
                new HistoricalSite("Checkpoint Charlie", "Знаковое место холодной войны")
        ));

        attractionList.get(0).addReview("Отличная экспозиция древних артефактов!");
        attractionList.get(1).addReview("Потрясающая коллекция Египта.");
        attractionList.get(2).addReview("Прекрасные образцы немецкого искусства 19 века.");
//        -----------------------------------------------------
        attractionList.get(3).addReview("Прекрасное место для прогулок на свежем воздухе.");
        attractionList.get(4).addReview("Замечательный вид на реку и отличные места для пикника.");
        attractionList.get(5).addReview("Уникальное место с историей, отлично подходит для катания на велосипеде.");
//        -----------------------------------------------------
        attractionList.get(6).addReview("Величественное и исторически значимое место.");
        attractionList.get(7).addReview("Интересное место с панорамным видом на город.");
        attractionList.get(8).addReview("Место с уникальной историей, стоит посетить.");
//        -----------------------------------------------------
        CityGuide attractionCityGuide = new CityGuide(attractionList);
//---------------------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Показать все достопримечательности");
            System.out.println("2: Добавить отзыв о достопримечательности");
            System.out.println("3: Поиск по названию");
            System.out.println("4: Показать по популярности");
            System.out.println("5: Показать все отзывы");
            System.out.println("6: Показать отзывы группы атракционнов");
            System.out.println("7: Показать отзыв атракционна");
            System.out.println("0: ВЫХОД");
            int res = scanner.nextInt();
            scanner.nextLine();
            switch (res) {
                case 1:
                    attractionCityGuide.getAttractions();
                    break;

                case 2:
                    System.out.println("Введите название");
                    String name = scanner.nextLine();
                    Attraction result = attractionCityGuide.findAttraction(name);
                    if (result != null) {
                        System.out.println("Вводите отзыв!");
                        String review = scanner.nextLine();
                        result.addReview(review);
                    } else {
                        System.out.println("Такого атракциона нет!!!");
                    }
                    break;

                case 3:
                    System.out.println("Введите название");
                    String nameAttraction = scanner.nextLine();
                    result = attractionCityGuide.findAttraction(nameAttraction);
                    if (result != null) {
                        String review = scanner.nextLine();
                        result.addReview(review);
                    } else {
                        System.out.println("Такого атракциона нет!!!");
                    }
                    break;
                case 4:
                    attractionCityGuide.populationAttraction().stream().forEach(System.out::println);
                    break;
                case 5:
                    attractionCityGuide.printAllReviewable();
                    break;
                case 6:
                    System.out.println("Введите группу атракционнов");
                    String nameGroup = scanner.nextLine();
                    attractionCityGuide.printAllInGroupReviewable(nameGroup);
                    break;
                case 7:
                    System.out.println("Введите название");
                    nameAttraction = scanner.nextLine();
                    result = attractionCityGuide.findAttraction(nameAttraction);
                    if (result != null) {
                        attractionCityGuide.printAttractionReviewable(nameAttraction);
                    } else {
                        System.out.println("Такого атракциона нет!!!");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Нет такого пункта меню");
            }

        }

//---------------------------------------------------------------------------
    }
}