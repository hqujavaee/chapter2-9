package cn.edu.hqu.javaee.domain.cd.impl;

import java.util.List;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;

public class Albums implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;
	
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}


	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("正在播放"+artist+"的专辑《"+title+"》");
		for (String track:tracks) {
			System.out.println("-Track: "+track);
		}
	}

}
