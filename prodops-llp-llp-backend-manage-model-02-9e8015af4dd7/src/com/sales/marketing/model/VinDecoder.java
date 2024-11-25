package com.sales.marketing.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="vin_decoder")
@NamedQuery(name="VinDecoder.findAll", query="SELECT v FROM VinDecoder v")
public class VinDecoder {

	@Id
	@SequenceGenerator(name="vin_decoder_decoder_id_GENERATOR", sequenceName="vin_decoder_decoder_id_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vin_decoder_decoder_id_GENERATOR")
	@Column(name="decoder_id")
	private int decoderId;

	@Column(name="vin")
	private String vin;

	@Column(name="vin_response")
	private String vinResponse;

	@Column(name="creation_user_i")
	private String creationUserI;

	public VinDecoder() {
		
	}

	public int getDecoderId() {
		return decoderId;
	}

	public void setDecoderId(int decoderId) {
		this.decoderId = decoderId;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVinResponse() {
		return vinResponse;
	}

	public void setVinResponse(String vinResponse) {
		this.vinResponse = vinResponse;
	}

	public String getCreationUserI() {
		return creationUserI;
	}

	public void setCreationUserI(String creationUserI) {
		this.creationUserI = creationUserI;
	}

	@Override
	public String toString() {
		return "VinDecoder [decoderId=" + decoderId + ", vin=" + vin + ", vinResponse=" + vinResponse
				+ ", creationUserI=" + creationUserI + "]";
	}
	
	
}
