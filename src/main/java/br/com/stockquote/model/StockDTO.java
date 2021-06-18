package br.com.stockquote.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class StockDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long _id;
	private String id;
	private String description;
}
