package api.dtos;

import java.math.BigDecimal;

public class CurrencyConversionDto {
	
	private CurrencyExchangeDto exchange;
	private BigDecimal quantity;
	private ConversionResult conversionResult;
	
	
	
	
	public CurrencyConversionDto(CurrencyExchangeDto exchange, BigDecimal quantity) {
		
		this.exchange = exchange;
		this.quantity = quantity;
		CurrencyConversionDto.ConversionResult result = 
				new CurrencyConversionDto.ConversionResult(exchange.getTo(), quantity.multiply(exchange.getExchangeRate()));
		this.conversionResult = result;
	}




	public CurrencyConversionDto() {
		
	}




	public CurrencyExchangeDto getExchange() {
		return exchange;
	}




	public void setExchange(CurrencyExchangeDto exchange) {
		this.exchange = exchange;
	}




	public BigDecimal getQuantity() {
		return quantity;
	}




	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}




	public ConversionResult getConversionResult() {
		return conversionResult;
	}




	public void setConversionResult(ConversionResult conversionResult) {
		this.conversionResult = conversionResult;
	}




	private class ConversionResult {
		private String to;
		private BigDecimal convertedAmount;
		
		public ConversionResult() {
			
		}
		
		

		public ConversionResult(String to, BigDecimal convertedAmount) {
			
			this.to = to;
			this.convertedAmount = convertedAmount;
		}



		public String getTo() {
			return to;
		}

		public void setTo(String to) {
			this.to = to;
		}

		public BigDecimal getConvertedAmount() {
			return convertedAmount;
		}

		public void setConvertedAmount(BigDecimal convertedAmount) {
			this.convertedAmount = convertedAmount;
		}
		
		
	}
}
