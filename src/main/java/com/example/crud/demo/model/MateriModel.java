package com.example.crud.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MateriModel {
	@Id
	@Column(name="i_preview")
	private String iPreview;
	
	@Column(name="v_video")
	private String vVideo;
	
	@Column(name="t_keterangan")
	private String tKeterangan;

	public String getiPreview() {
		return iPreview;
	}

	public void setiPreview(String iPreview) {
		this.iPreview = iPreview;
	}

	public String getvVideo() {
		return vVideo;
	}

	public void setvVideo(String vVideo) {
		this.vVideo = vVideo;
	}

	public String gettKeterangan() {
		return tKeterangan;
	}

	public void settKeterangan(String tKeterangan) {
		this.tKeterangan = tKeterangan;
	}
 
	
	
}
