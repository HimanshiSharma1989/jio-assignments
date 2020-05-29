package com.reliance.jio.assignments.assignment9;

public class MumbaiWeatherNews {
	public static void main(String[] args) {
		MumbaiWeather mumbaiWeather = new MumbaiWeather();
		
		WeatherReportAajTak aajTak1 = new WeatherReportAajTak();
		WeatherReportAajTak aajTak2 = new WeatherReportAajTak();
		WeatherReportAajTak aajTak3 = new WeatherReportAajTak();
		mumbaiWeather.addObserver(aajTak1);
		mumbaiWeather.addObserver(aajTak2);
		mumbaiWeather.addObserver(aajTak3);
		mumbaiWeather.updateTempInMorning();
				
		WeatherReportAajTak aajTak= new WeatherReportAajTak();
		WeatherReportNDTV ndtv = new WeatherReportNDTV();
		WeatherReportStarNews starNews = new WeatherReportStarNews();
		WeatherReportZeeNews zeeNews = new WeatherReportZeeNews();
		mumbaiWeather.addObserver(aajTak);
		mumbaiWeather.addObserver(ndtv);
		mumbaiWeather.addObserver(starNews);
		mumbaiWeather.addObserver(zeeNews);
		
		mumbaiWeather.updateTempInMorning();
		mumbaiWeather.updateTempInNoon();
		mumbaiWeather.updateTempInEvening();
		mumbaiWeather.updateTempInNight();
		
		
	}
}
