package oop.collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class songs {
    public static void main(String[] args) {
        TreeSet<Song> songs = new TreeSet<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/oop/collections/songs.txt"));

            String song;
            while ((song = reader.readLine()) != null) {
                String title = song.substring(0, song.indexOf('/'));
                String artist = song.substring(song.indexOf('/') + 1);

                Song songObject = new Song(title, artist);
                songs.add(songObject);
            }

            reader.close();
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        for (Song s: songs){
            System.out.println(s);
        }

            }

        }




