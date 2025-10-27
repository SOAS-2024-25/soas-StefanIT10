package api.dtos;

import java.math.BigDecimal;

public class CurrencyExchangeDto {
	
	private String from;
	private String to;
	private BigDecimal exchangeRate;
	
	
	
	public CurrencyExchangeDto() {
		
	}
	public CurrencyExchangeDto(String from, String to, BigDecimal exchangeRate) {
		
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
}
