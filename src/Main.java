import atraction.model.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


//        neuesMuseum.addReview("Потрясающая коллекция Египта.");


//        alteNationalgalerie.addReview("Прекрасные образцы немецкого искусства 19 века.");
//        -----------------------------------------------------

//        tiergarten.addReview("Прекрасное место для прогулок на свежем воздухе.");

//        treptowerPark.addReview("Замечательный вид на реку и отличные места для пикника.");


//        tempelhoferFeld.addReview("Уникальное место с историей, отлично подходит для катания на велосипеде.");
//        -----------------------------------------------------

//        brandenburgGate.addReview("Величественное и исторически значимое место.");

//        reichstag.addReview("Интересное место с панорамным видом на город.");


//        checkpointCharlie.addReview("Место с уникальной историей, стоит посетить.");
//        -----------------------------------------------------



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

        CityGuide attractionCityGuide = new CityGuide(attractionList);

//        attractionCityGuide.get(0).addReview("Отличная экспозиция древних артефактов!");

        attractionCityGuide.getAttractions();







//        if (attractionList.get(0) instanceof Museum) {
//            Museum museum = (Museum) attractionList.get(0);
//            museum.getListRewiew();
//        }
//        System.out.println(filterForType(attractionList, "HistoricalSite"));






    }


}