package com.abm.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.abm.dao.AlbumSongDao;
import com.abm.entity.Album;
import com.abm.entity.Song;

public class AlbumSongApp {

	public static void main(String[] args) {
		AlbumSongDao dao = new AlbumSongDao();
		
		//scenario: first write the code to add an album
		/*Album album = new Album();
		album.setName("Hits of 2022");
		album.setCopyright("Sony Music");
		album.setReleaseDate(LocalDate.of(2022, 12, 25));
		dao.save(album);*/
		
		//scenario: then try to add a song to that album
		/*Album album = (Album) dao.fetchById(Album.class, 3);
		Song song = new Song();
		song.setTitle("Kesariya");
		song.setArtist("Arijit Singh");
		song.setDuration(4);
		song.setAlbum(album);
		dao.save(song);*/
		
		//scenario: adding album and songs together
		/*Album album = new Album();
		album.setName("Hits of 2021");
		album.setCopyright("Amazon Music");
		album.setReleaseDate(LocalDate.of(2021, 12, 25));
		
		Song song1 = new Song();
		song1.setTitle("Raatan Lambiyan");
		song1.setArtist("Jubin Nautiyal");
		song1.setDuration(4.30);
		song1.setAlbum(album);
		
		Song song2 = new Song();
		song2.setTitle("Raanjha");
		song2.setArtist("Jasleen Royal");
		song2.setDuration(3.30);
		song2.setAlbum(album);
		
		List<Song> songs = new ArrayList<>();
		songs.add(song1);
		songs.add(song2);
		album.setSongs(songs);
		
		dao.save(album);*/
	
		//scenario: fetching an album
		/*Album album = (Album) dao.fetchById(Album.class, 3);
		System.out.println("Name " + album.getName());
		System.out.println("Released on " + album.getReleaseDate());
		System.out.println("Copyright of " + album.getCopyright());
		List<Song> songs = album.getSongs();
		for(Song song : songs) {
			System.out.println("==============");
			System.out.println("Title " + song.getTitle());
			System.out.println("Artist " + song.getArtist());
		}*/
		
		//scenario: fetching a song
		Song song = (Song) dao.fetchById(Song.class, 5);
		System.out.println("Title " + song.getTitle());
		System.out.println("Artist " + song.getArtist());
		Album album = song.getAlbum();
		System.out.println("Name " + album.getName());
		System.out.println("Released on " + album.getReleaseDate());
		System.out.println("Copyright of " + album.getCopyright());
		
	}
}











