package com.Retrieve.AnguImg.Modal;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data 
public class Imagemodal {
	
	 @Id
//	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String name;
	 private String type;
	 @Column(name = "picByte", length = 10000)
	 private byte[] picByte;
	 
	 public Imagemodal() {
		 
	 }
	 
	 public Imagemodal(long id,String name,String type,byte[] picByte) {
		 this.id=id;
		 this.name=name;
		 this.type=type;
		 this.picByte=picByte;
		 
	 }
}
