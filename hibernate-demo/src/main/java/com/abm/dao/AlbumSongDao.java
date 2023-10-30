package com.abm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abm.entity.Album;
import com.abm.entity.Song;

public class AlbumSongDao extends GenericDao {

	
	public List<Song> fetchSongsByArtist(String artist) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		Query q = 
			em.createQuery("select s from Song s where s.artist = :at");
		q.setParameter("at", artist);
		List<Song> list = q.getResultList();
		
		em.close();
		emf.close();
		
		return list;
	}
	
	public List<Song> fetchSongsByAlbum(String album) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		Query q = 
			em.createQuery("select s from Song s join s.album a where a.name = :nm");
		q.setParameter("nm", album);
		List<Song> list = q.getResultList();
		
		em.close();
		emf.close();
		
		return list;
	}
	
	public List<Album> fetchAlbumsByArtist(String artist) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("rupranswahajokisayo");
		EntityManager em = emf.createEntityManager();

		Query q = 
			em.createQuery("select distinct a from Album a join a.songs s where s.artist = :at");
		q.setParameter("at", artist);
		List<Album> list = q.getResultList();
		
		em.close();
		emf.close();
		
		return list;
	}
}






