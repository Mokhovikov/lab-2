package com.github.rsoi;

import com.github.rsoi.domain.Sing;
import com.github.rsoi.service.PlaylistImpl;
import com.github.rsoi.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
	}

    @Override
    public void run(String... args) {

        ArrayList<Sing> all= new ArrayList<>();
        all.add(new Sing("Instasamka-За деньги да", new ArrayList<LocalDate>(List.of(LocalDate.of(2023,2,1),LocalDate.of(2023,2,10),LocalDate.of(2023,2,13)))));
        all.add(new Sing("Dj Smash - Позвони",new ArrayList<LocalDate>(List.of(LocalDate.of(2023,2,10),LocalDate.of(2023,2,4),LocalDate.of(2023,2,14)))));
        all.add(new Sing("Anna Asti - По барам", new ArrayList<LocalDate>(List.of(LocalDate.of(2023,2,6),LocalDate.of(2023,2,1),LocalDate.of(2023,2,5)))));
        all.add(new Sing("ЛСП - Курточка",new ArrayList<LocalDate>(List.of(LocalDate.of(2023,2,6),LocalDate.of(2023,2,6),LocalDate.of(2023,2,26)))));
        all.add(new Sing("Anna Asti - Повело",new ArrayList<LocalDate>(List.of(LocalDate.of(2023,2,6),LocalDate.of(2023,2,10),LocalDate.of(2023,2,20)))));
        all.add(new Sing("Miley Syrus - Flowers", new ArrayList<LocalDate>(List.of(LocalDate.of(2023,3,1),LocalDate.of(2023,3,10),LocalDate.of(2023,3,11)))));
        all.add(new Sing("GAYLE - abcdefu",new ArrayList<LocalDate>(List.of(LocalDate.of(2023,3,11),LocalDate.of(2023,3,12)))));
        all.add(new Sing("The Weeknd - Is There Someone Else", new ArrayList<LocalDate>(List.of(LocalDate.of(2023,3,5),LocalDate.of(2023,3,13),LocalDate.of(2023,3,1)))));
        all.add(new Sing("Juice WRLD - Wandered To LA",new ArrayList<LocalDate>(List.of(LocalDate.of(2023,3,5),LocalDate.of(2023,3,15)))));
        all.add(new Sing("Juice WRLD - Smile",new ArrayList<LocalDate>(List.of(LocalDate.of(2023,3,5),LocalDate.of(2023,3,15)))));
        all.add(new Sing("Руки вверх - 18 мне уже", new ArrayList<LocalDate>(List.of(LocalDate.of(2023,1,14),LocalDate.of(2023,1,17)))));
        all.add(new Sing("LOVE66 - 10КМ", new ArrayList<LocalDate>(List.of(LocalDate.of(2023,1,15),LocalDate.of(2023,1,18)))));
        all.add(new Sing("Drake - God's plan", new ArrayList<LocalDate>(List.of(LocalDate.of(2023,1,16),LocalDate.of(2023,1,19)))));




        TreeMap<String, ArrayList<LocalDate>> allMap = new TreeMap<>();
        TreeMap<String, ArrayList<LocalDate>> first = new TreeMap<>();
        TreeMap<String, ArrayList<LocalDate>> second = new TreeMap<>();
        TreeMap<String, ArrayList<LocalDate>> third = new TreeMap<>();







        PlaylistImpl playlist1 = new PlaylistImpl();

        playlist1.form(all,allMap ,first,second,third);
        playlist1.sortByListen(first);
        playlist1.sortByListen(second);
        playlist1.sortByListen(third);

    }
}
